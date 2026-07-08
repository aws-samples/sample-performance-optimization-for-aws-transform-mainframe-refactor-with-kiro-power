CREATE OR REPLACE FUNCTION public.char2date(datevalue text)
    RETURNS DATE
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
begin
  -- Use postgres capacity to create DATE with any format
  return DATE(datevalue);
END
$BODY$;

CREATE OR REPLACE FUNCTION public.char2time(timevalue text)
    RETURNS TIME
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
  return TO_TIMESTAMP('0001-01-01 ' || timevalue,'YYYY-MM-DD-HH24.MI.SS')::TIME;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.char2timestamp(timestampvalue text)
    RETURNS TIMESTAMP
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
  return TO_TIMESTAMP(timestampvalue,'YYYY-MM-DD-HH24.MI.SS.US');
END
$BODY$;