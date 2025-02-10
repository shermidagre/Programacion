CREATE OR REPLACE PROCEDURE plistasalariosequipos() AS $$


DECLARE 

    filae RECORD;

    filax RECORD;
    
    filag RECORD;
    
    partidos INTEGER;
    
    golestotales INTEGER;

    resultado VARCHAR = E'\n';

    totalsalarios INTEGER;

    mediasalariosr FLOAT;  -- Media real (solo con salarios)

    mediasalariosf FLOAT;   -- Media ficticia (incluye todos los jugadores)

    mediaxogadores INTEGER;  -- Total de jugadores

    mediaxogadoresconsalario INTEGER;  -- Jugadores con salario


BEGIN

    FOR filae IN (SELECT * FROM equipo) LOOP

        resultado = resultado ||'---------------------------------'||E'\n'||' '||'Codigo do equipo: '||filae.codequ || E'\n\n'||' Nome do equipo: '||filae.nomequ || E'\n' || E'\n'|| E'\n';


        totalsalarios = 0;

        mediasalariosr = 0;

        mediasalariosf = 0;

        mediaxogadores = 0;

        mediaxogadoresconsalario = 0; 

        FOR filax IN (SELECT * FROM xogador WHERE codequ = filae.codequ) LOOP

            resultado = resultado || ' ' ||E'\t\t Codigo do xogador: '||'  '||filax.codx || ' ' ||E'\t\t Nome do xogador: '||'  '||filax.nomx || ' ' || E'\t\t Equipo do xogador: '||'  '||

                         COALESCE(filax.codequ, 'sen equipo') || ' ' ||E'\t\t Salario do xogador: '||

                         COALESCE(filax.salario::TEXT, 'sen salario') || E'\n';


            totalsalarios = totalsalarios + COALESCE(filax.salario, 0);

	    -- Goles totales del jugador

	SELECT SUM(goles) INTO golestotales FROM xoga WHERE codx = filax.codx;


            -- Contador de los partidos junto con los goles

	SELECT COALESCE(COUNT(*), 0) INTO partidos FROM xoga WHERE codx = filax.codx;


    		IF partidos > 0 THEN

        		resultado = resultado ||E'\n'|| E'\t\t Partidos: ' || partidos ||

                     E'\t\t Goles: ' || golestotales || E'\n'||E'\n';

    		ELSE 

        		resultado = resultado ||E'\n'|| E'\t\t No ha jugado partidos :( (Tryhard de la banquilla derecha)' || E'\n'|| E'\n';

    END IF;
                       
            
            -- Contador

            mediaxogadores = mediaxogadores + 1;


            -- Contar solo los jugadores con salario 

            IF filax.salario IS NOT NULL AND filax.salario > 0 THEN

                mediaxogadoresconsalario = mediaxogadoresconsalario + 1; 

            END IF;

        END LOOP;

	IF filax.codequ IS NOT NULL THEN  -- En caso de que el equipo tenga jugadores, imprimira todos los datos

        -- Calcular la media real (solo con salarios)

        IF mediaxogadoresconsalario > 0 THEN

            mediasalariosr = totalsalarios::FLOAT / mediaxogadoresconsalario;

        ELSE

            mediasalariosr = 0; 

        END IF;


        -- Calcular la media ficticia (incluye todos los jugadores)

        IF mediaxogadores > 0 THEN

            mediasalariosf = totalsalarios::FLOAT / mediaxogadores;

        ELSE

            mediasalariosf = 0; 

        END IF;


        resultado = resultado || E'\n' ||' '|| 'Media de xogadores con salario: ' || mediaxogadoresconsalario || 

                     E'\n' ||E'\n' ||' '|| 'Media de xogadores ficticia: ' || mediaxogadores || 

                     E'\n' ||E'\n' ||' '|| 'Suma de todos os salarios: ' || totalsalarios || 

                     E'\n' ||E'\n' ||' '|| 'Media real dos salarios: ' || mediasalariosr || 

                     E'\n' ||E'\n' ||' '|| 'Media ficticia dos salarios: ' || mediasalariosf || E'\n' || -- Contando nulos
                      
                     E'\n' ||' '||E'\n' || ':)' || E'\n' ||'---------------------------------';
                     
	ELSE -- En caso de que no tenga jugadores imprime que no tiene jugadores
	
		resultado = resultado ||' '||'Sen xogadores'|| E'\n' || E'\n'||' '||':/'|| E'\n' ||E'\n' ||'---------------------------------';
		
	END IF;
	

	
    END LOOP;


    RAISE NOTICE '%', resultado; 


END; 


$$ LANGUAGE plpgsql;
