CREATE OR REPLACE FUNCTION ffactorial(a numeric) 

RETURNS integer AS $$

DECLARE

    r integer;

BEGIN
	
	FOR i iN 1..a  loop
	
		r=a+i; 
	
	END loop;

return r;

END;

$$ LANGUAGE plpgsql;
