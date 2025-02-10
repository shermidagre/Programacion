CREATE OR REPLACE FUNCTION fcomparadousnumeros(a integer,b integer) 

RETURNS VARCHAR AS $$

DECLARE

    resultado VARCHAR(90);  -- Variable para almacenar el resultado

BEGIN

    IF b = a THEN

        resultado := 'Son iguales';  -- Asigna el mensaje si son iguales

    ELSE 

        resultado := 'Son distintos';  -- Asigna el mensaje si son distintos

    END IF;
   
resultado='o numero'||b||'e'||resultado||'ao numero'||a;


    RETURN resultado;  -- Devuelve el resultado

END;

$$ LANGUAGE plpgsql;
