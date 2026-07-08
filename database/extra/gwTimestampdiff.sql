CREATE OR REPLACE FUNCTION public.gwTimestampdiff(units INT, end_t TIMESTAMP with time zone , start_t TIMESTAMP with time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
     diff_years INT = 0;
   BEGIN
     IF units IN ( 256 , 128 , 64 ) THEN
       diff_years = DATE_PART('year', end_t) - DATE_PART('year', start_t);
	   -- timestampdiff unit : YEARS 
       IF units = 256 THEN
         RETURN extract(year from age(end_t, start_t));
	   -- timestampdiff unit : QUARTERS 
	   ELSEIF units = 128 THEN
		 RETURN (diff_years * 4 + EXTRACT(QUARTER FROM end_t)) - 1 QUARTER;
	   -- timestampdiff unit : MONTHS
       ELSE 
         RETURN diff_years * 12 + (DATE_PART('month', end_t) - DATE_PART('month', start_t)); 
       END IF;
     END IF;

     diff_interval = end_t - start_t;
 
     diff = diff + DATE_PART('day', diff_interval);
	 -- timestampdiff unit : WEEKS
     IF units = 32 THEN
       diff = diff/7;
       RETURN diff;
     END IF;
	 -- timestampdiff unit : DAYS
     IF units = 16 THEN
       RETURN diff;
     END IF; 
	 -- timestampdiff unit : HOURS
     diff = diff * 24 + DATE_PART('hour', diff_interval); 

     IF units = 8 THEN
        RETURN diff;
     END IF;
	 -- timestampdiff unit : MINUTES
     diff = diff * 60 + DATE_PART('minute', diff_interval);
 
     IF units = 4 THEN
        RETURN diff;
     END IF;
	 -- timestampdiff unit : SECONDS 
     diff = diff * 60 + DATE_PART('second', diff_interval);
	 IF units = 2 THEN
		RETURN diff;
	 END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwTimestampdiff(units INT, end_t TIMESTAMP without time zone , start_t TIMESTAMP WITHOUT time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
     diff_years INT = 0;
   BEGIN
     IF units IN ( 256 , 128 , 64 ) THEN
       diff_years = DATE_PART('year', end_t) - DATE_PART('year', start_t);
	   -- timestampdiff unit : YEARS 
       IF units = 256 THEN
         RETURN extract(year from age(end_t, start_t));
	   -- timestampdiff unit : QUARTERS 
	   ELSEIF units = 128 THEN
		 RETURN (diff_years * 4 + EXTRACT(QUARTER FROM end_t)) - 1 QUARTER;
	   -- timestampdiff unit : MONTHS
       ELSE 
         RETURN diff_years * 12 + (DATE_PART('month', end_t) - DATE_PART('month', start_t)); 
       END IF;
     END IF;

     diff_interval = end_t - start_t;
 
     diff = diff + DATE_PART('day', diff_interval);
	 -- timestampdiff unit : WEEKS
     IF units = 32 THEN
       diff = diff/7;
       RETURN diff;
     END IF;
	 -- timestampdiff unit : DAYS
     IF units = 16 THEN
       RETURN diff;
     END IF; 
	 -- timestampdiff unit : HOURS
     diff = diff * 24 + DATE_PART('hour', diff_interval); 

     IF units = 8 THEN
        RETURN diff;
     END IF;
	 -- timestampdiff unit : MINUTES
     diff = diff * 60 + DATE_PART('minute', diff_interval);
 
     IF units = 4 THEN
        RETURN diff;
     END IF;
	 -- timestampdiff unit : SECONDS 
     diff = diff * 60 + DATE_PART('second', diff_interval);
	 IF units = 2 THEN
		RETURN diff;
	 END IF;
END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwTimestampdiff(units INT, end_t TIME with time zone , start_t TIME with time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
   BEGIN
	    diff_interval = end_t - start_t;
		
		-- timestampdiff unit : HOURS
		diff = diff * 24 + DATE_PART('hour', diff_interval); 
	 
		 IF units = 8 THEN
			RETURN diff;
		 END IF;
		 -- timestampdiff unit : MINUTES
		 diff = diff * 60 + DATE_PART('minute', diff_interval);
	 
		 IF units = 4 THEN
			RETURN diff;
		 END IF;
		 -- timestampdiff unit : SECONDS 
		 diff = diff * 60 + DATE_PART('second', diff_interval);
		 IF units = 2 THEN
			RETURN diff;
		 END IF;

END
$BODY$;

CREATE OR REPLACE FUNCTION public.gwTimestampdiff(units INT, end_t TIME without time zone , start_t TIME WITHOUT time zone)
    RETURNS INT
    LANGUAGE 'plpgsql'
    IMMUTABLE 
AS $BODY$
DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
   BEGIN
	 	    diff_interval = end_t - start_t;
		
		-- timestampdiff unit : HOURS
		diff = diff * 24 + DATE_PART('hour', diff_interval); 
	 
		 IF units = 8 THEN
			RETURN diff;
		 END IF;
		 -- timestampdiff unit : MINUTES
		 diff = diff * 60 + DATE_PART('minute', diff_interval);
	 
		 IF units = 4 THEN
			RETURN diff;
		 END IF;
		 -- timestampdiff unit : SECONDS 
		 diff = diff * 60 + DATE_PART('second', diff_interval);
		 IF units = 2 THEN
			RETURN diff;
		 END IF;
END
$BODY$;