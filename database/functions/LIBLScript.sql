-- Create the table to store all partitions of all physical files
CREATE TABLE IF NOT EXISTS blu4iv_table_libraries
(
    filename varchar(50),
    libname varchar(50),
    PRIMARY KEY (filename, libname)
);

CREATE UNIQUE INDEX Idx_Blu4iv_Lib
  ON blu4iv_table_libraries (filename, libname); 

-- Create the table to store all partitions of all logical files
CREATE TABLE IF NOT EXISTS blu4iv_dataarea_libraries
(
    areaname varchar(50),
    libname varchar(50),
    PRIMARY KEY (areaname, libname)
);

CREATE UNIQUE INDEX Idx_Blu4iv_DataArea_Lib
  ON blu4iv_dataarea_libraries (areaname, libname); 

-- Function that retrieves all partition of a file and add the row in blu4iv_table_libraries for the file
CREATE OR REPLACE FUNCTION retrievePartitions(tbl_name text)
  RETURNS void AS $func$
DECLARE
   apartition varchar;
BEGIN 
    FOR apartition IN
        SELECT inhrelid::regclass AS child FROM pg_catalog.pg_inherits WHERE inhparent = tbl_name::regclass
    LOOP
        INSERT INTO blu4iv_table_libraries (filename, libname) 
        VALUES (tbl_name, SPLIT_PART(apartition, '_', 2));
    END LOOP;
END
$func$ LANGUAGE plpgsql;

-- Function that retrieves data area libraries from the name column
CREATE OR REPLACE FUNCTION retrieveDataAreaLibraries()
  RETURNS void AS $func$
DECLARE
   dataarea_name text;
   library_name text;
BEGIN 
    FOR dataarea_name IN
        SELECT DISTINCT name FROM data_area
    LOOP
        -- Extract library name from data area name (assuming format: library/dataarea)
        IF POSITION('/' IN dataarea_name) > 0 THEN
            library_name := SPLIT_PART(dataarea_name, '/', 1);
            INSERT INTO blu4iv_dataarea_libraries (areaname, libname) 
            VALUES (areaname, library_name)
            ON CONFLICT (areaname, libname) DO NOTHING;
        END IF;
    END LOOP;
END
$func$ LANGUAGE plpgsql;

-- Function that stores all partitions for all file in the database
CREATE OR REPLACE FUNCTION storePartitions()
  RETURNS void AS $func$
DECLARE
   tablename varchar;
BEGIN 
    FOR tablename IN
        SELECT c.relname FROM pg_class AS c WHERE NOT EXISTS (SELECT 1 FROM pg_inherits AS i
                  WHERE i.inhrelid = c.oid) AND c.relkind = 'p' 
                  AND c.relnamespace IN (SELECT oid FROM pg_namespace WHERE nspname = 'public')
    LOOP
        PERFORM retrievePartitions(tablename);
    END LOOP;
    
    -- Handle data areas
    PERFORM retrieveDataAreaLibraries();
END
$func$ LANGUAGE plpgsql;

-- Load the library table with data from all tables
SELECT storePartitions();


-- Functions and triggers ---------------------------------------------------------------------

-- Create the function to be triggered on table creation/deletion to update blu4iv_table_libraries
CREATE OR REPLACE FUNCTION updateLibraryTable()
RETURNS event_trigger AS $$
DECLARE
    obj record;
    affected_object record;
    partition_name text;
    library_name text;
    parent_table text;
BEGIN
    IF TG_EVENT = 'ddl_command_end' THEN
        -- Handle creation events
        FOR obj IN SELECT * FROM pg_event_trigger_ddl_commands()
        LOOP
            IF obj.object_type = 'table' AND obj.command_tag = 'CREATE TABLE' THEN
                IF POSITION('_' IN obj.object_identity) > 0 THEN
                    -- Extract parent table name and partition name from object_identity
                    -- object_identity format is usually: schema.parent_table_partition_name
                    SELECT split_part(obj.object_identity, '.', 2) INTO partition_name;
                    SELECT SPLIT_PART(partition_name, '_', 1) INTO parent_table;
                    SELECT SPLIT_PART(partition_name, '_', 2) INTO library_name;

                    -- Insert new row in blu4iv_table_libraries
                    INSERT INTO blu4iv_table_libraries (filename, libname)
                    VALUES (parent_table, library_name);
                END IF;
            END IF;
        END LOOP;
    ELSIF TG_EVENT = 'sql_drop' THEN
        -- Handle deletion events
        FOR affected_object IN SELECT * FROM pg_event_trigger_dropped_objects()
        LOOP
            IF affected_object.object_type = 'table' THEN
                IF POSITION('_' IN affected_object.object_identity) > 0 THEN
                    -- The object is partition, extract parent table name and partition name
                    SELECT split_part(affected_object.object_identity, '.', 2) INTO partition_name;
                    SELECT SPLIT_PART(partition_name, '_', 1) INTO parent_table;
                    SELECT SPLIT_PART(partition_name, '_', 2) INTO library_name;
                       
                    -- Delete the specific row
                    DELETE FROM blu4iv_table_libraries 
                    WHERE filename = parent_table AND libname = library_name;
                ELSE
                    -- The object is table, remove all entries for this table
                    SELECT split_part(affected_object.object_identity, '.', 2) INTO parent_table;
                    DELETE FROM blu4iv_table_libraries WHERE filename = parent_table;
                    RETURN; -- Return to prevent further treatment on child partitions
                END IF;
            END IF;
        END LOOP;
    END IF;
END;
$$ LANGUAGE plpgsql;


-- Create the event triggers
CREATE EVENT TRIGGER table_creation_trigger
ON ddl_command_end
WHEN TAG IN ('CREATE TABLE', 'CREATE TABLE AS')
EXECUTE FUNCTION updateLibraryTable();

CREATE EVENT TRIGGER table_deletion_trigger
ON sql_drop
EXECUTE FUNCTION updateLibraryTable();


-- Function to handle data_area table changes and extract library information
CREATE OR REPLACE FUNCTION updateLibraryTableDataArea()
RETURNS TRIGGER AS $$
BEGIN
    -- Handle INSERT operations
    IF TG_OP = 'INSERT' THEN
        -- Check if the name column contains LIB/NAME format
        IF NEW.name ~ '^[^/]+/[^/]+$' THEN
            -- Extract the LIB part (everything before the first '/')
            INSERT INTO blu4iv_dataarea_libraries (areaname, libname)
            VALUES (LOWER(SPLIT_PART(NEW.name, '/', 2)), LOWER(SPLIT_PART(NEW.name, '/', 1)))
            ON CONFLICT (areaname, libname) DO NOTHING; -- Avoid duplicates
        END IF;
        RETURN NEW;
    END IF;
    
    -- Handle DELETE operations
    IF TG_OP = 'DELETE' THEN
        -- Check if the name column contains LIB/NAME format
        IF OLD.name ~ '^[^/]+/[^/]+$' THEN
            -- Remove the corresponding entry from blu4iv_dataarea_libraries
            DELETE FROM blu4iv_dataarea_libraries 
            WHERE areaname = LOWER(SPLIT_PART(OLD.name, '/', 2))
            AND libname = LOWER(SPLIT_PART(OLD.name, '/', 1));
        END IF;
        RETURN OLD;
    END IF;
    
    RETURN NULL;
END;
$$ LANGUAGE plpgsql;

-- Create the trigger on the data_area table
CREATE TRIGGER trg_data_area_library_extraction
    AFTER INSERT OR DELETE ON data_area
    FOR EACH ROW
    EXECUTE FUNCTION updateLibraryTableDataArea();
