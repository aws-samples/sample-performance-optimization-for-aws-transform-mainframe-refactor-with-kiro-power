CREATE OR REPLACE FUNCTION public.gwTimePartdiff(units INT, end_t TIMESTAMP with time zone , start_t TIMESTAMP with time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
   BEGIN

     diff_interval = end_t - start_t;
 
  	 -- timePartdiff unit : MINUTES
     diff = DATE_PART('minute', diff_interval);
     IF units = 4 THEN
        RETURN diff;
     END IF;
     
	 -- timePartdiff unit : SECONDS 
     diff = DATE_PART('second', diff_interval);
	 IF units = 2 THEN
		RETURN diff;
	 END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwTimePartdiff(units INT, end_t TIMESTAMP without time zone , start_t TIMESTAMP WITHOUT time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
   BEGIN
     -- timePartdiff unit : MINUTES
     diff = DATE_PART('minute', diff_interval);
     IF units = 4 THEN
        RETURN diff;
     END IF;
     
	 -- timePartdiff unit : SECONDS 
     diff = DATE_PART('second', diff_interval);
	 IF units = 2 THEN
		RETURN diff;
	 END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwTimePartdiff(units INT, end_t TIME with time zone , start_t TIME with time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
   BEGIN
	    diff_interval = end_t - start_t;
		
		 -- timePartdiff unit : MINUTES
		 diff = DATE_PART('minute', diff_interval);
		 IF units = 4 THEN
			RETURN diff;
		 END IF;
		 
		 -- timePartdiff unit : SECONDS 
		 diff = DATE_PART('second', diff_interval);
		 IF units = 2 THEN
			RETURN diff;
		 END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwTimePartdiff(units INT, end_t TIME without time zone , start_t TIME WITHOUT time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
   BEGIN
	 	    diff_interval = end_t - start_t;
		
		 -- timePartdiff unit : MINUTES
		 diff = DATE_PART('minute', diff_interval);
		 IF units = 4 THEN
			RETURN diff;
		 END IF;
		 
		 -- timePartdiff unit : SECONDS 
		 diff = DATE_PART('second', diff_interval);
		 IF units = 2 THEN
			RETURN diff;
		 END IF;	 
END
$BODY$;