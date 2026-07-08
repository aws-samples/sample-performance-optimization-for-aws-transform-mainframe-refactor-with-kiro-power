
--- GENERATED SQL FOR LOGICAL FILE [CDAUTU01.lf]
--- expected target database is PostgreSQL compatible Engine

---***************************************************************
--- File Name       : CDAUTU01 (LF)     
--- Author          : Subu              
--- Date            : 02/11/2024        
--- Description     : Authorization Master - Update Index
---***************************************************************

-- DEFAULT MEMBER TABLE
CREATE OR REPLACE VIEW CDAUTU01(
AUTHID,TRNID,CARDNUM,RESPONSE,RSPREASON,
FRAUDFLAG,AUTHDATE,AUTHTIME,AUTHUSER,AUTHPGM,
SRCFILE,MEMBER)
AS
SELECT 
AUTHID,TRNID,CARDNUM,RESPONSE,RSPREASON,
FRAUDFLAG,AUTHDATE,AUTHTIME,AUTHUSER,AUTHPGM,
SRCFILE,MEMBER
FROM CDAUTP
ORDER BY AUTHID;

COMMIT;
