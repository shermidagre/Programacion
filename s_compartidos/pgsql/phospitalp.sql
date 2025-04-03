/*
phospitalp

procedimento que, pasandolle o nome dun hospital, imprima os nomes dos asegurados de 1ª categoria que foron hospitalizados nel .

 Se non ten asegurados de primeira categoria hospitalizados debe imprimirse a mensaxe 'este hospital non ten asegurados de 1º categoria hospitalizados'  
 
 Se o hospital non existe debe imprimirse a mensaxe adecuada (mediante tratamento de excepcions) .

call phospitalp ('povisa');
andrea
dorotea

call phospitalp ('sonic');
este hospital non ten asegurados de 1º categoria hospitalizados


call phospitalp ('roma');
este hospital non existe


*/
CREATE OR REPLACE PROCEDURE phospitalp(nnomh VARCHAR) LANGUAGE plpgsql AS $$


DECLARE

    vcodh VARCHAR;

    vnomas VARCHAR;

    vcodp VARCHAR;

    asegurados varchar = '';
    
    cuentaasegurados int=0;
    
    vnumas int;


BEGIN

/*

	Comprobacion de la existencial del hospital

*/

    SELECT codh INTO vcodh FROM hospital WHERE nomh = nnomh ;


    IF NOT FOUND THEN

        RAISE NOTICE 'este hospital non existe';

        RETURN;

    END IF;
	
	-- Aqui debemos de realizar consulta a la tabla asegurado, y una segunda consulta a hospitalizados 1 para asi poder unir su codp
	
    FOR vnomas IN SELECT nomas FROM asegurado WHERE codp IN (SELECT codp FROM hosp1 WHERE codh = vcodh) and numas=1 
    
    LOOP

            asegurados = asegurados || vnomas || E'\n';

            cuentaasegurados = cuentaasegurados + 1;  -- Incrementar el contador


    END LOOP;
    
    
        IF cuentaasegurados > 0  THEN

        	RAISE NOTICE 'Asegurados de %: %', nnomh,asegurados;

   	 ELSE

       	 	RAISE NOTICE 'Este hospital no tiene asegurados de 1º categoría hospitalizados';

    	END IF;



END; $$;

