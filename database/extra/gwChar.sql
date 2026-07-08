CREATE OR REPLACE FUNCTION public.gwChar(expr NUMERIC,dc VARCHAR DEFAULT '')
    RETURNS VARCHAR
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
    IF dc <> '' THEN
	    return REPLACE(expr::varchar(255),'.',dc);
	ELSE
		return expr::varchar(255);
	END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwChar(expr VARCHAR,len INT DEFAULT -1)
    RETURNS VARCHAR
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
    IF len > 0 THEN
	    return left(expr,len);
	ELSE
		return expr;
	END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwChar(expr boolean)
    RETURNS VARCHAR
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
    IF expr THEN
	    return 'TRUE ';
	ELSE
		return 'FALSE';
	END IF;
END
$BODY$;