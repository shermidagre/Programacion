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

DROP FUNCTION IF EXISTS fth10;


CREATE OR REPLACE FUNCTION fth10() RETURNS TRIGGER LANGUAGE plpgsql AS $$ 


DECLARE

    contadorcodm INT=0;

    catasegurado INT;


BEGIN


    SELECT numas INTO catasegurado FROM asegurado WHERE codp = NEW.codp;


    IF NOT FOUND THEN

        RAISE EXCEPTION 'Inserción rechazada: Asegurado no existente.';

    END IF;
    

    SELECT COUNT(*) INTO contadorcodm FROM medico WHERE codm = NEW.codm AND coda in (SELECT coda FROM asegurado WHERE codp = NEW.codp); 

    IF contadorcodm = 0 THEN

        RAISE EXCEPTION 'Inserción rechazada: El médico no está adscrito a la misma área que el paciente.';

    END IF;

    IF catasegurado = 1 THEN

        RAISE NOTICE 'El asegurado es de 1ª categoría, la inserción es permitida.';

    ELSIF catasegurado = 2 THEN

        RAISE NOTICE 'Inserción permitida.';

    END IF; 


    RETURN NEW;


END; $$;


CREATE TRIGGER th10 BEFORE INSERT ON hosp2 FOR EACH ROW EXECUTE FUNCTION fth10();

