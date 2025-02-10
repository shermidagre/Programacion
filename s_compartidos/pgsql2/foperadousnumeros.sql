CREATE OR REPLACE FUNCTION foperadousnumeros(operacion VARCHAR, a INTEGER, b INTEGER) 

RETURNS VARCHAR AS $$

DECLARE

    ropera NUMERIC;  -- Cambia el tipo a NUMERIC para permitir resultados decimales

    resultado VARCHAR(90) := 'conocido';  

BEGIN

    IF operacion = '+' THEN

        ropera := a + b; 

    ELSIF operacion = '-' THEN

        ropera := b - a;

    ELSIF operacion = '*' THEN

        ropera := a * b;

    ELSIF operacion = '/' THEN

        IF a = 0 THEN

            resultado := 'Error: División por cero';  -- Mensaje de error al dividir entre 0

            RETURN resultado;  -- Devuelve el resultado

        ELSE

            ropera := ROUND(b::NUMERIC / a, 2);  -- Este round lo que hace es redondear los decimales a dos caracters

        END IF;

    ELSE 

        resultado := 'Operación desconocida'; -- En caso de que la operacion no tenga numeros saca por pantalla que no reconoce esta operacion

    END IF;

    

    IF resultado = 'conocido' THEN

        resultado := 'El resultado de la operación ' || operacion || ' es ' || ropera;

    END IF;


    RETURN resultado;  -- Saca por pantalla el resultado

END;

$$ LANGUAGE plpgsql;
