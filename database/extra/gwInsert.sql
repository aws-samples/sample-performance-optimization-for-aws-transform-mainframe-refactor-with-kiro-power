CREATE OR REPLACE FUNCTION public.gwInsert (src CHAR, start int, length int, insertStr CHAR, format CHAR)
    RETURNS CHAR 
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  s bytea;
begin
	
	if format = 'OCTETS' then
		-- default
	elsif format = 'CODEUNITS16' or format = 'CODEUNITS32' then 
		RAISE EXCEPTION 'Format % unexpected' ,format USING HINT = 'Not yet supported for CODEUNITS16 and CODEUNITS32';
	else
		RAISE EXCEPTION 'Format % unexpected' ,format USING HINT = 'Please use OCTETS or CODEUNITS16 or CODEUNITS32';
	end if;
   -- convert_to(convert_from()) enable to decode string hexa format '\xFF'
   return public.gwInsert(convert_to(convert_from(src::bytea,'UTF8')::text, 'UTF8')::bytea, start, length, insertStr);
   
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwInsert (src bytea, start int, length int, insertStr CHAR)
    RETURNS text 
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  result text;
begin
	
	-- If any argument can be null, the result can be null; if any argument is null, the result is the null value.
	if src = null or start = null or length = null or insertStr = null then
		return null;
	end if;

	if LENGTH(src) = 0 then
		if start != 1 then
			RAISE EXCEPTION 'src is empty and start should be 1' USING HINT = 'Please ensure src is not empty or start different than 1';
		end if;
	end if;

	result = convert_from((SUBSTRING (src,0,start)  || insertStr::bytea ||  SUBSTRING (src,start + length))::bytea, 'LATIN1') ;
	return result;
END
$BODY$;