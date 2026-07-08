
--- GENERATED SQL FOR LOGICAL FILE [CDCCAU01.lf]
--- expected target database is PostgreSQL compatible Engine

---***************************************************************
--- File Name       : CDCCAU01 (LF)     
--- Author          : Subu              
--- Date            : 02/11/2024        
--- Description     : Credit Card Activity - Update Index
---***************************************************************

-- DEFAULT MEMBER TABLE
CREATE OR REPLACE VIEW CDCCAU01(
CARDNUM,CCASEQNO,ACTIVITY,DESS,CCAUSER,
CCATMSTAMP,
SRCFILE,MEMBER)
AS
SELECT 
CARDNUM,CCASEQNO,ACTIVITY,DESS,CCAUSER,
CCATMSTAMP,
SRCFILE,MEMBER
FROM CDCCAP
ORDER BY CARDNUM,CCASEQNO;

COMMIT;
