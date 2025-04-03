/*
tactxog.sql

trigger que impida cambiar el salario de un jugador a mas del doble de su salario actual:
*/

DROP TRIGGER IF EXISTS tactxog ON xogador;


CREATE OR REPLACE FUNCTION ftactxog() RETURNS TRIGGER LANGUAGE plpgsql AS $$


DECLARE

    salarioinicial INTEGER;

    salariofinal INTEGER;

BEGIN

    SELECT salario INTO salarioinicial FROM xogador WHERE codx = OLD.codx;

    salariofinal = NEW.salario;

    IF salariofinal > salarioinicial * 2 THEN

        RAISE EXCEPTION 'No se puede subir el salario a más del doble de su salario actual';

    END IF;

    RETURN NEW;

END; $$;


CREATE TRIGGER tactxog BEFORE UPDATE ON xogador FOR EACH ROW EXECUTE PROCEDURE ftactxog();
