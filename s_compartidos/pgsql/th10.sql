/*

 th10 
 
impedir que se poida hospitalizar a un asegurado de 2� categor�a si o m�dico que realiza a hospitalizaci�n non esta adscrito a mesma area da que procede o paciente

insert into hosp2 values('h1','p11',1,'m1','1/1/1970','1/2/1970');
-- o m�dico  non esta adscrito a mesma area da que procede o paciente
insert into hosp2 values('h1','p1',1,'m1','1/1/1970','1/2/1970');
--asegurado non existente ou non de 2� categoria
insert into hosp2 values('h1','p1',2,'m1','1/1/1970','1/2/1970');
-- inserci�n levada a cabo

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

        RAISE EXCEPTION 'Inserci�n rechazada: Asegurado no existente.';

    END IF;

    IF catasegurado = 2 THEN

        -- Comprobar si el m�dico est� adscrito a la misma �rea que el paciente

        SELECT COUNT(*) INTO contadorcodm FROM medico WHERE codm = NEW.codm AND codm1 = (SELECT coda FROM asegurado WHERE codp = NEW.codp); 
        
       -- Si el m�dico no est� adscrito a la misma �rea, lanzar excepci�n

        IF contadorcodm = 0 THEN

            RAISE EXCEPTION 'Inserci�n rechazada: El m�dico no est� adscrito a la misma �rea que el paciente.';

        END IF;

    ELSE

        RAISE EXCEPTION 'Inserci�n rechazada: El asegurado no es de 2� categor�a.';

    END IF;


    RAISE NOTICE 'Operaci�n completada: El asegurado puede ser insertado.';

    
    RETURN NEW;

END; $$;


CREATE TRIGGER th10 BEFORE INSERT ON hosp2 FOR EACH ROW EXECUTE FUNCTION fth10();

