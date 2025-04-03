/*

 th10 
 
impedir que se poida hospitalizar a un asegurado de 2ª categoría si o médico que realiza a hospitalización non esta adscrito a mesma area da que procede o paciente

insert into hosp2 values('h1','p11',1,'m1','1/1/1970','1/2/1970');
-- o médico  non esta adscrito a mesma area da que procede o paciente
insert into hosp2 values('h1','p1',1,'m1','1/1/1970','1/2/1970');
--asegurado non existente ou non de 2ª categoria
insert into hosp2 values('h1','p1',2,'m1','1/1/1970','1/2/1970');
-- inserción levada a cabo

*/

DROP TRIGGER IF EXISTS th10 ON hosp2;

CREATE OR REPLACE FUNCTION fth10() RETURNS TRIGGER LANGUAGE plpgsql AS $$ 

DECLARE

    contadorcodm INT;
    catasegurado int;


BEGIN

    SELECT numas INTO catasegurado FROM asegurado WHERE codp = NEW.codp;


    -- Si el asegurado no existe

    IF NOT FOUND THEN

        RAISE EXCEPTION 'Inserción rechazada: Asegurado no existente.';

    END IF;

    IF catasegurado = 2 THEN

        -- Comprobar si el médico está adscrito a la misma área que el paciente

        SELECT COUNT(*) INTO contadorcodm FROM medico WHERE codm = NEW.codm AND codm1 = (SELECT coda FROM asegurado WHERE codp = NEW.codp); 
        
       -- Si el médico no está adscrito a la misma área, lanzar excepción

        IF contadorcodm = 0 THEN

            RAISE EXCEPTION 'Inserción rechazada: El médico no está adscrito a la misma área que el paciente.';

        END IF;

    ELSE

        RAISE EXCEPTION 'Inserción rechazada: El asegurado no es de 2ª categoría.';

    END IF;


    RAISE NOTICE 'Operación completada: El asegurado puede ser insertado.';

    
    RETURN NEW;

END; $$;


CREATE TRIGGER th10 BEFORE INSERT ON hosp2 FOR EACH ROW EXECUTE FUNCTION fth10();

