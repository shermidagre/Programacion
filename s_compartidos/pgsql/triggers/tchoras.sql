-- Eliminar el trigger si ya existe

DROP TRIGGER IF EXISTS tchoras ON interpretesser;

CREATE OR REPLACE FUNCTION ftchoras() RETURNS TRIGGER LANGUAGE plpgsql AS $$

DECLARE

    counthtotales INTEGER;

    limitehoras INTEGER = 500; 

BEGIN

    SELECT COALESCE(SUM(horas), 0) INTO counthtotales FROM interpretesser WHERE cods = NEW.cods AND coda = NEW.coda;

    IF counthtotales + NEW.horas > limitehoras THEN 

        RAISE EXCEPTION 'No se puede agregar más horas, ya tiene % horas. Límite: %', counthtotales, limitehoras;

    ELSE

        RAISE NOTICE 'Operación completada: El intérprete puede tener mas horas, horas insertadas.';

    END IF;


    RETURN NEW;

END; $$;


-- Crear el trigger que llama a la función antes de insertar en interpretesser

CREATE TRIGGER tchoras BEFORE INSERT ON interpretesser FOR EACH ROW EXECUTE FUNCTION ftchoras();
