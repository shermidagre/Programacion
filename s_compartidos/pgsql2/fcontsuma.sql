CREATE OR REPLACE FUNCTION fcontsuma() 

RETURNS INTEGER AS $$

DECLARE

    c INTEGER := 0;  -- Inicializa c

    resultado INTEGER;  -- Variable para almacenar el resultado

BEGIN

    RAISE NOTICE '-------------------------';  -- Cuerpo del bloque


    c := 0;  -- Inicializa c

    c := c + 1;  -- Incrementa c

    c := c + 1;  -- Incrementa c

    resultado := 5;  -- Asigna 5 a resultado

    resultado := resultado + c;  -- Suma c a resultado (7)

    c := c + 1;  -- Incrementa c (c=3)

    resultado := 5;  -- Asigna 5 a resultado nuevamente

    resultado := resultado + c;  -- Suma c a resultado nuevamente (5) + (3)


    RAISE NOTICE 'El resultado es: %', resultado;  -- Mensaje de aviso con el valor de resultado

    

    RETURN resultado;  -- Devuelve el valor de resultado

END;

$$ LANGUAGE plpgsql;
