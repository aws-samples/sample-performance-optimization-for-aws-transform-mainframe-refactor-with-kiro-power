
--- GENERATED SQL FOR LOGICAL FILE [CDUSRR02.lf]
--- expected target database is PostgreSQL compatible Engine

---***************************************************************
--- File Name       : CDUSRR02 (LF)     
--- Author          : Subu              
--- Date            : 04/18/2024        
--- Description     : User Master - Select Active Status Only
---***************************************************************

-- DEFAULT MEMBER TABLE
CREATE OR REPLACE VIEW CDUSRR02(
USERID,FIRSTNAME,LASTNAME,TYPE,EMAIL,
STATUS,USRCRTDT,USRCRTTM,USRCRTUSR,USRCRTPGM,
USRCHGDT,USRCHGTM,USRCHGUSR,USRCHGPGM,
SRCFILE,MEMBER)
AS
SELECT 
USERID,FIRSTNAME,LASTNAME,TYPE,EMAIL,
STATUS,USRCRTDT,USRCRTTM,USRCRTUSR,USRCRTPGM,
USRCHGDT,USRCHGTM,USRCHGUSR,USRCHGPGM,
SRCFILE,MEMBER
FROM CDUSRP
WHERE STATUS = 'A'
ORDER BY USERID,TYPE;

COMMIT;
