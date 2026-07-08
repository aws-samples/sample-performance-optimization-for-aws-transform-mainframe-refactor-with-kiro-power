CREATE OR REPLACE FUNCTION public.gwDecimal(expr NUMERIC DEFAULT NULL,pr INT DEFAULT -1,sc INT DEFAULT -1)
    RETURNS DECIMAL
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  decimalformat VARCHAR(50);
begin
  IF pr != -1 THEN
  	IF sc != -1 THEN 
	    decimalformat = CONCAT(repeat('9',pr),'D',repeat('9',sc));
	ELSE
		decimalformat = CONCAT(repeat('9',pr),'D');
	END IF;
	    raise notice 'Value: %', decimalformat;
	    RETURN TO_NUMBER(expr::TEXT,decimalformat);
  ELSE 
        RETURN CAST(expr AS DECIMAL(31,0));
  END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwDecimal(expr VARCHAR DEFAULT NULL,pr INT DEFAULT -1,sc INT DEFAULT -1,dc VARCHAR DEFAULT NULL)
    RETURNS DECIMAL
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  decimalformat VARCHAR(50);
begin
  IF pr != -1 THEN
  	IF sc != -1 THEN 
	    decimalformat = CONCAT(repeat('9',pr),'D',repeat('9',sc));
	ELSE
		decimalformat = CONCAT(repeat('9',pr),'D');
	END IF;
	    raise notice 'Value: %', decimalformat;
		IF dc = '.' THEN 
	       RETURN TO_NUMBER(replace(expr, '.', ','),decimalformat);
		ELSE
		   RETURN TO_NUMBER(expr,decimalformat);
		END IF;
  ELSE 
        RETURN gwDecimal(expr,15,0);
  END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwDecimal(expr DATE,pr INT DEFAULT -1,sc INT DEFAULT -1)
    RETURNS DECIMAL
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  decimalnumber DECIMAL;
  decimalformat VARCHAR(50);
begin
  decimalnumber = EXTRACT(YEAR FROM expr)*10000+EXTRACT(MONTH FROM expr)*100++EXTRACT(DAY FROM expr);
  IF pr != -1 THEN
  	IF sc != -1 THEN 
	    RETURN gwDecimal(decimalnumber,pr,sc);
	ELSE
		RETURN gwDecimal(decimalnumber,pr,0);
	END IF;
  ELSE 
  	RETURN gwDecimal(decimalnumber,8,0);
  END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwDecimal(expr TIME,pr INT DEFAULT -1,sc INT DEFAULT -1)
    RETURNS DECIMAL
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  decimalnumber DECIMAL;
  decimalformat VARCHAR(50);
begin
  decimalnumber = EXTRACT(HOUR FROM expr)*10000+EXTRACT(MINUTE FROM expr)*100++EXTRACT(SECOND FROM expr);
  RAISE NOTICE 'i want to print %', decimalnumber;
  IF pr != -1 THEN
  	IF sc != -1 THEN 
	    RETURN gwDecimal(decimalnumber,pr,sc);
	ELSE
		RETURN gwDecimal(decimalnumber,pr,0);
	END IF;
  ELSE 
  	RETURN gwDecimal(decimalnumber,8,0);
  END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwDecimal(expr TIMESTAMP without time zone,pr INT DEFAULT -1,sc INT DEFAULT -1)
    RETURNS DECIMAL
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  decimalnumber DECIMAL;
  decimalformat VARCHAR(50);
begin
  decimalnumber = EXTRACT(YEAR FROM expr)*10000000000+EXTRACT(MONTH FROM expr)*100000000+EXTRACT(DAY FROM expr)*1000000+EXTRACT(HOUR FROM expr)*10000+EXTRACT(MINUTE FROM expr)*100++EXTRACT(SECOND FROM expr);
  RAISE NOTICE 'i want to print %', decimalnumber;
  IF pr != -1 THEN
  	IF sc != -1 THEN 
	    RETURN gwDecimal(decimalnumber,pr,sc);
	ELSE
		RETURN gwDecimal(decimalnumber,pr,0);
	END IF;
  ELSE 
  	RETURN gwDecimal(decimalnumber,8,0);
  END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwDecimal(expr TIMESTAMP with time zone,pr INT DEFAULT -1,sc INT DEFAULT -1)
    RETURNS DECIMAL
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  decimalnumber DECIMAL;
  decimalformat VARCHAR(50);
begin
  decimalnumber = EXTRACT(YEAR FROM expr)*10000000000+EXTRACT(MONTH FROM expr)*100000000+EXTRACT(DAY FROM expr)*1000000+EXTRACT(HOUR FROM expr)*10000+EXTRACT(MINUTE FROM expr)*100++EXTRACT(SECOND FROM expr);
  RAISE NOTICE 'i want to print %', decimalnumber;
  IF pr != -1 THEN
  	IF sc != -1 THEN 
	    RETURN gwDecimal(decimalnumber,pr,sc);
	ELSE
		RETURN gwDecimal(decimalnumber,pr,0);
	END IF;
  ELSE 
  	RETURN gwDecimal(decimalnumber,14,0);
  END IF;
END
$BODY$;