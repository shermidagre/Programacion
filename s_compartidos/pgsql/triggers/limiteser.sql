
DROP TRIGGER IF EXISTS tlimiteser ON interpretesser;

CREATE OR REPLACE FUNCTION ftlimiteser() RETURNS TRIGGER LANGUAGE plpgsql AS $$

DECLARE

    seriesmax INTEGER;

BEGIN

    SELECT COUNT(DISTINCT cods) INTO seriesmax FROM interpretesser WHERE coda = NEW.coda ;


    IF seriesmax > 4 THEN 

        RAISE EXCEPTION 'Non se pode inserir: o actor xa traballa en % series distintas.', seriesmax;

	else 
	
        	RAISE NOTICE 'Operación completada: Rexistro inserido.';
    END IF;


    RETURN NEW;

END; $$;


CREATE TRIGGER tlimiteser after INSERT ON interpretesser FOR EACH ROW EXECUTE FUNCTION ftlimiteser();

/*

DROP TRIGGER IF EXISTS tlimiteser ON interpretesser;

CREATE OR REPLACE FUNCTION ftlimiteser() RETURNS TRIGGER LANGUAGE plpgsql AS $$

DECLARE

    seriesmax INTEGER;

BEGIN

    SELECT COUNT(DISTINCT cods) INTO seriesmax FROM interpretesser WHERE coda = NEW.coda and cods<>new.cods;


    IF seriesmax= 4 THEN 

        RAISE EXCEPTION 'Non se pode inserir: o actor xa traballa en % series distintas.', seriesmax;

	else 
	
        	RAISE NOTICE 'Operación completada: Rexistro inserido.';
    END IF;


    RETURN NEW;

END; $$;


CREATE TRIGGER tlimiteser before INSERT ON interpretesser FOR EACH ROW EXECUTE FUNCTION ftlimiteser();

*/
