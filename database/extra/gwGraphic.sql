CREATE OR REPLACE FUNCTION public.gwGraphic(expr CHAR,len INT DEFAULT -1)
    RETURNS CHAR
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
    IF len > 0 THEN
	    return SUBSTR(expr,1,len);
	ELSE
		return SUBSTR(expr,1,LENGTH (expr));
	END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwGraphic(expr VARCHAR,len INT DEFAULT -1)
    RETURNS VARCHAR
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
    IF len > 0 THEN
	    return SUBSTR(expr,1,len);
	ELSE
        return SUBSTR(expr,1,LENGTH (expr));
	END IF;
END
$BODY$;