CREATE OR REPLACE PROCEDURE psalariosp(vtitulo VARCHAR) LANGUAGE plpgsql AS $$

DECLARE

    resultado varchar = E'\n'; 

    vcachehora INTEGER; -- Salario por hora

    filaca RECORD; -- Registro para almacenar filas de resultados

    cuenta INTEGER;

    vcodpel VARCHAR; -- Código de la película

BEGIN


    SELECT codpel INTO vcodpel FROM peliculas WHERE titulo = vtitulo;


    FOR filaca IN (SELECT horas, coda FROM interpretespel WHERE codpel = vcodpel) LOOP 


        SELECT cachehora INTO vcachehora FROM actores WHERE coda = filaca.coda;

        resultado = resultado || 'Actor: ' || filaca.coda || ', Horas: ' || coalesce(filaca.horas,0) || ', Salario: ' || vcachehora || E'\n';
        
        cuenta = COALESCE(filaca.horas, 0) * COALESCE(vcachehora, 0);

    END LOOP;
    
    RAISE NOTICE '%', resultado||cuenta;

END; $$;
