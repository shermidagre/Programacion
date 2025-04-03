/*
insert into non_estructuras values('a4','s');
*/



DROP TRIGGER IF EXISTS tclas ON non_estructuras;


CREATE OR REPLACE FUNCTION ftclas() RETURNS TRIGGER LANGUAGE plpgsql AS $$

DECLARE

    countestructura INTEGER;

    countnoestructura INTEGER;

BEGIN


    SELECT COUNT(*) INTO countestructura FROM estructuras WHERE coda = new.coda;


    SELECT COUNT(*) INTO countnoestructura FROM non_estructuras WHERE coda = new.coda;


    IF countestructura = 1 THEN

        RAISE EXCEPTION 'este codigo ya esta en estructuras';


    ELSIF countnoestructura = 1 THEN    

        RAISE EXCEPTION 'Este codigo ya esta en non estructuras';

    ELSE

        RAISE NOTICE 'Operación completada';

    END IF;


    RETURN NEW;

END; $$;

CREATE TRIGGER tclas BEFORE INSERT ON non_estructuras FOR EACH ROW  EXECUTE FUNCTION ftclas();
