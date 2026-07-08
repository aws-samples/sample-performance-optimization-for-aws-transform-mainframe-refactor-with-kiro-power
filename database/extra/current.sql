CREATE OR REPLACE FUNCTION public.getCurrentTimestamp()
    RETURNS TIMESTAMP
    LANGUAGE 'plpgsql'
AS $BODY$
begin
  return statement_timestamp();
END
$BODY$;

CREATE OR REPLACE FUNCTION public.getCurrentTime()
    RETURNS TIME
    LANGUAGE 'plpgsql'
AS $BODY$
begin
  return statement_timestamp()::time;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.getCurrentDate()
    RETURNS DATE
    LANGUAGE 'plpgsql'
AS $BODY$
begin
  return statement_timestamp()::date;
END
$BODY$;