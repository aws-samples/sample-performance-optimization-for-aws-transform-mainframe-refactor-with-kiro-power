
--- GENERATED SQL FOR LOGICAL FILE [CDCCMU01.lf]
--- expected target database is PostgreSQL compatible Engine

---***************************************************************
--- File Name       : CDCCMU01 (LF)     
--- Author          : Subu              
--- Date            : 02/11/2024        
--- Description     : Credit Card Master - Update Index
---***************************************************************

-- DEFAULT MEMBER TABLE
CREATE OR REPLACE VIEW CDCCMU01(
CARDNUM,CUSTID,ACCTNUM,PRIMARYSEC,NAME,
EXPIRYMO,EXPIRYYR,CVV,STATUS,CCMCRTDT,
CCMCRTTM,CCMCRTUSR,CCMCRTPGM,CCMCHGDT,CCMCHGTM,
CCMCHGUSR,CCMCHGPGM,
SRCFILE,MEMBER)
AS
SELECT 
CARDNUM,CUSTID,ACCTNUM,PRIMARYSEC,NAME,
EXPIRYMO,EXPIRYYR,CVV,STATUS,CCMCRTDT,
CCMCRTTM,CCMCRTUSR,CCMCRTPGM,CCMCHGDT,CCMCHGTM,
CCMCHGUSR,CCMCHGPGM,
SRCFILE,MEMBER
FROM CDCCMP
ORDER BY CARDNUM;

COMMIT;
