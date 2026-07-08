-----------------
-- DATE FUNCTIONS
-----------------

-- Set the default time format
-- To configure according your needs
CREATE OR REPLACE FUNCTION public.getDefaultFormatDate ()
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
begin
  -- return one of [LOCAL/ISO/EUR/JIS/USA]
  -- If LOCAL, think to implement date2char_local according your needs
    return 'ISO';
END
$BODY$;

-- To configure according your needs
CREATE OR REPLACE FUNCTION public.date2char_local (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
  localFormat text;
begin
  raise notice 'date2char_local';
  localFormat = 'yymmdd';
  dateformat = TO_CHAR(mydate, localFormat);
      
  return dateformat;
END
$BODY$;


CREATE OR REPLACE FUNCTION public.date2char_iso (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
  isoFormat text;
begin
  raise notice 'date2char_iso';
  isoFormat = 'yyyy-mm-dd';
  dateformat = TO_CHAR(mydate, isoFormat);
  return dateformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.date2char_eur (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
  eurFormat text;
begin
  raise notice 'date2char_eur';
  eurFormat = 'dd.mm.yyyy';
  dateformat = TO_CHAR(mydate, eurFormat);
  return dateformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.date2char_jis (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
  jisFormat text;
begin
  raise notice 'date2char_jis';
  jisFormat = 'yyyy-mm-dd';
  dateformat = TO_CHAR(mydate, jisFormat);
  return dateformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.date2char_usa (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
  usaFormat text;
begin
  raise notice 'date2char_usa';
  usaFormat = 'mm/dd/yyyy';
  dateformat = TO_CHAR(mydate, usaFormat);
  return dateformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.date2char_sequencial (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
begin
    raise notice 'date2char_sequencial';
    begin
       dateformat = date2char_iso(mydate);
   	exception
	   WHEN no_data_found then
	   dateformat = date2char_eur(mydate);
	   WHEN OTHERS THEN
	      -- handle any errors
	      begin
		      dateformat = date2char_eur(mydate);
		     
		      exception
			   WHEN no_data_found then
			   dateformat = date2char_jis(mydate);
			   WHEN OTHERS THEN
			      -- handle any errors
			      begin
			         dateformat = date2char_jis(mydate);
			        
			        exception
					   WHEN no_data_found then
					   dateformat = date2char_usa(mydate);
					  
					   WHEN OTHERS then
					     begin
						   dateformat = date2char_usa(mydate);
						   exception
							   WHEN no_data_found then
							   raise;
							  
							   WHEN OTHERS then
							   raise;
						  end;
				  end;
		 end;
    end;
 
  return dateformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.date2char (mydate DATE)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  dateformat text;
begin
  raise notice 'date2char';
  IF getDefaultFormatDate() = 'LOCAL' THEN 
  
    BEGIN
    dateformat = date2char_local(mydate);
   	exception
	   WHEN no_data_found then
	   dateformat = date2char_sequencial(mydate);
	   WHEN OTHERS THEN
	      -- handle any errors
	      dateformat = date2char_sequencial(mydate);
     end;
	
  else 
  
    BEGIN
    dateformat = date2char_sequencial(mydate);
   
	exception
	   WHEN no_data_found then
	   	dateformat = date2char_local(mydate);
	   WHEN OTHERS THEN
	     -- handle any errors
	     -- Can raise exception if date2char_local does not exist or failed
	     dateformat = date2char_local(mydate)    ;
	END;
	
  END IF;

  return dateformat;
END
$BODY$;

-----------------
-- TIME FUNCTIONS
-----------------

-- Set the default time format
-- To configure according your needs
CREATE OR REPLACE FUNCTION public.getDefaultFormatTime ()
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
begin
  -- return one of [LOCAL/ISO/EUR/JIS/USA]
  -- If LOCAL, think to implement time2char_local according your needs
    return 'ISO';
END
$BODY$;

-- To configure according your needs
CREATE OR REPLACE FUNCTION public.time2char_local (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
  localFormat text;
begin
  raise notice 'time2char_local';
  localFormat = 'HHMISS';
  timeformat = TO_CHAR(mytime, localFormat);
      
  return timeformat;
END
$BODY$;


CREATE OR REPLACE FUNCTION public.time2char_iso (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
  isoFormat text;
begin
  raise notice 'time2char_iso';
  isoFormat = 'HH24.MI.SS';
  timeformat = TO_CHAR(mytime, isoFormat);
  return timeformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.time2char_eur (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
  eurFormat text;
begin
  raise notice 'time2char_eur';
  eurFormat = 'HH24.MI.SS';
  timeformat = TO_CHAR(mytime, eurFormat);
  return timeformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.time2char_jis (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
  jisFormat text;
begin
  raise notice 'time2char_jis';
  jisFormat = 'HH24:MI:SS';
  timeformat = TO_CHAR(mytime, jisFormat);
  return timeformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.time2char_usa (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
  usaFormat text;
begin
  raise notice 'time2char_usa';
  usaFormat = 'HH12.MI AM';
  timeformat = TO_CHAR(mytime, usaFormat);
  return timeformat;
END
$BODY$;


CREATE OR REPLACE FUNCTION public.time2char_sequencial (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
begin
    raise notice 'time2char_sequencial';
    begin
       timeformat = time2char_iso(mytime);
   	exception
	   WHEN no_data_found then
	   timeformat = time2char_eur(mytime);
	   WHEN OTHERS THEN
	      -- handle any errors
	      begin
		      timeformat = time2char_eur(mytime);
		     
		      exception
			   WHEN no_data_found then
			   timeformat = time2char_jis(mytime);
			   WHEN OTHERS THEN
			      -- handle any errors
			      begin
			         timeformat = time2char_jis(mytime);
			        
			        exception
					   WHEN no_data_found then
					   timeformat = time2char_usa(mytime);
					  
					   WHEN OTHERS then
					     begin
						   timeformat = time2char_usa(mytime);
						   exception
							   WHEN no_data_found then
							   raise;
							  
							   WHEN OTHERS then
							   raise;
						  end;
				  end;
		 end;
    end;
 
  return timeformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.time2char (mytime TIME)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timeformat text;
begin
  raise notice 'time2char';
  IF getDefaultFormatTime() = 'LOCAL' THEN 
  
    BEGIN
    timeformat = time2char_local(mytime);
   	exception
	   WHEN no_data_found then
	   timeformat = time2char_sequencial(mytime);
	   WHEN OTHERS THEN
	      -- handle any errors
	      timeformat = time2char_sequencial(mytime);
     end;
	
  else 
  
    BEGIN
    timeformat = time2char_sequencial(mytime);
   
	exception
	   WHEN no_data_found then
	   	timeformat = time2char_local(mytime);
	   WHEN OTHERS THEN
	     -- handle any errors
	     -- Can raise exception if time2char_local does not exist or failed
	     timeformat = time2char_local(mytime)    ;
	END;
	
  END IF;

  return timeformat;
END
$BODY$;

----------------------
-- TIMESTAMP FUNCTIONS
----------------------

CREATE OR REPLACE FUNCTION public.timestamp2char (mytimestamp TIMESTAMP)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
  timestampformat text;
  localFormat text;
begin
  raise notice 'timestamp2char';
  localFormat = 'YYYY-MM-DD-HH24.MI.SS.US';
  timestampformat = TO_CHAR(mytimestamp, localFormat);
  return timestampformat;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.timestamp2char (mytimestamp TIMESTAMP with time zone)
    RETURNS text
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
begin
  return timestamp2char(mytimestamp::TIMESTAMP);
END
$BODY$;