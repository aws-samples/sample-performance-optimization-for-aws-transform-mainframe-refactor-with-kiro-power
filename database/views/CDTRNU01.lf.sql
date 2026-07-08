
--- GENERATED SQL FOR LOGICAL FILE [CDTRNU01.lf]
--- expected target database is PostgreSQL compatible Engine

---***************************************************************
--- File Name       : CDTRNR01 (LF)     
--- Author          : Subu              
--- Date            : 02/11/2024        
--- Description     : Transaction Master - Update Index
---***************************************************************

-- DEFAULT MEMBER TABLE
CREATE OR REPLACE VIEW CDTRNU01(
TRNID,CARDNUM,TYPECD,CATEGCD,SOURCE,
DESS,AMOUNT,ORIGDATE,PROCDATE,MERCHID,
TRNSTATUS,TRNCRTDT,TRNCRTTM,TRNCRTUSR,TRNCRTPGM,
TRNCHGDT,TRNCHGTM,TRNCHGUSR,TRNCHGPGM,
SRCFILE,MEMBER)
AS
SELECT 
TRNID,CARDNUM,TYPECD,CATEGCD,SOURCE,
DESS,AMOUNT,ORIGDATE,PROCDATE,MERCHID,
TRNSTATUS,TRNCRTDT,TRNCRTTM,TRNCRTUSR,TRNCRTPGM,
TRNCHGDT,TRNCHGTM,TRNCHGUSR,TRNCHGPGM,
SRCFILE,MEMBER
FROM CDTRNP
ORDER BY TRNID;

COMMIT;
