-- Eliminar el trigger si ya existe

DROP TRIGGER IF EXISTS tlimitesoldp ON personaxes;

CREATE OR REPLACE FUNCTION ftlimitesoldp() RETURNS TRIGGER LANGUAGE plpgsql AS $$

DECLARE

    graduacionxefe TEXT;

BEGIN

    -- Graduación del jefe que se está intentando asignar

    SELECT graduacion INTO jefegraduacion FROM personaxes WHERE codper = NEW.codper2;

    -- Verificar si el nuevo personaje es un soldado y si su jefe también es un soldado

    IF NEW.graduacion = 'soldado' AND graduacionxefe = 'soldado' THEN 

        RAISE EXCEPTION 'Este personaxe é un soldado e non debe ter por xefe a outro soldado';

    ELSE

        RAISE NOTICE 'Operación completada: Rexistro inserido.';

    END IF;


    RETURN NEW;

END; $$;


-- Crear el trigger que llama a la función antes de insertar en personaxes

CREATE TRIGGER tlimitesoldp BEFORE INSERT ON personaxes FOR EACH ROW EXECUTE FUNCTION ftlimitesoldp();
