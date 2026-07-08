-- Combined SQL script to create all CardDemo tables
-- Run this in pgAdmin Query Tool for the 'carddemo' database

-- Note: Run the individual SQL files in this order for full partitioned table setup
-- This script provides the table creation order

-- 1. Status Code table (lookup table)
\i database/tables/CDSTCP.pf.sql

-- 2. Customer table
\i database/tables/CDCUSP.pf.sql

-- 3. User table
\i database/tables/CDUSRP.SQL.sql

-- 4. Account table
\i database/tables/CDACTP.pf.sql

-- 5. Credit Card Account table
\i database/tables/CDCCAP.pf.sql

-- 6. Credit Card Master table
\i database/tables/CDCCMP.pf.sql

-- 7. Authorization table
\i database/tables/CDAUTP.pf.sql

-- 8. Transaction table
\i database/tables/CDTRNP.pf.sql

-- 9. Message File table
\i database/tables/CDMMF001P.pf.sql

-- 10. Data Area table
\i database/tables/data_area.sql
