CREATE OR REPLACE FUNCTION foperadousnumeros(operacion VARCHAR, a INTEGER, b INTEGER) 

RETURNS VARCHAR AS $$

DECLARE

    ropera NUMERIC;  -- Cambia el tipo a NUMERIC para permitir resultados decimales

    resultado VARCHAR(90) := 'conocido';  -- Variable para almacenar el resultado


BEGIN

    IF operacion = '+' THEN

        ropera := a + b; 

    ELSIF operacion = '-' THEN

        ropera := b - a;

    ELSIF operacion = '*' THEN

        ropera := a * b;

    ELSIF operacion = '/' THEN

        IF a = 0 THEN

            resultado := 'Error: División por cero';  -- Manejo de división por cero

            RETURN resultado;  -- Devuelve el resultado

        ELSE

            ropera := ROUND(b::NUMERIC / a, 2);  -- Redondea a 2 decimales

        END IF;

    ELSE 

        resultado := 'Operación desconocida';

    END IF;

    

    IF resultado = 'conocido' THEN

        resultado := 'El resultado de la operación ' || operacion || ' es ' || ropera;

    END IF;


    RETURN resultado;  -- Devuelve el resultado

END;

$$ LANGUAGE plpgsql;
