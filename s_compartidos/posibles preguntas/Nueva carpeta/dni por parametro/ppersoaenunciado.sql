/*
ppersoa

procedemento chamdo ppersoa que amose para unha persoa cuxo dni se pasa por parámetro o seu nome e os postos para os que se lle fixeron entrevistas e o nome e apelidos do xestor que llas fixo 


call ppersoa('36555555');

persoa: elisa,bermudez,bastos
postos e xestor que o xestionou:
p1 : ricardo,leiro,suarez
p342 : eva,bastos,boullosa
p14 : ricardo,leiro,suarez

*/

CREATE OR REPLACE PROCEDURE ppersoa(vdni VARCHAR) AS $$

DECLARE

filae record;

filapos record;

filax record;

    resultado varchar = '';

    contador INTEGER = 0;

    vnumpersoa INTEGER;
    
        vnom_persoa VARCHAR;

        vap1_persoa VARCHAR;

        vap2_persoa VARCHAR;

BEGIN

    IF vdni IS NULL THEN

        RAISE NOTICE 'El DNI no puede ser NULL';

        RETURN;

    END IF;


    SELECT num_persoa INTO vnumpersoa FROM persoas WHERE dni = vdni;


    IF vnumpersoa IS NULL THEN

        RAISE NOTICE 'No se ha encontrado la persona con DNI %', vdni;

        RETURN;

    END IF;

    BEGIN

        SELECT nom_persoa, ap1_persoa, ap2_persoa INTO vnom_persoa, vap1_persoa, vap2_persoa

        FROM persoas WHERE num_persoa = vnumpersoa;

        resultado = resultado|| E'\n'||'persoa: ' || vnom_persoa || ', ' || vap1_persoa || ', ' || vap2_persoa || E'\n';
        resultado = resultado|| 'Postos e xestor que o xestionou'|| E'\n';

    END;


    FOR filae IN (SELECT cod_posto FROM entrevista WHERE num_persoa = vnumpersoa) LOOP

        FOR filapos IN (SELECT cod_posto, cod_xestor FROM postos WHERE cod_posto = filae.cod_posto) LOOP
		
            FOR filax IN (SELECT cod_xestor, nom_xestor, ap1_xestor, ap2_xestor FROM xestores WHERE cod_xestor = filapos.cod_xestor) LOOP


		
                resultado = resultado|| filapos.cod_posto || ' : ' || filax.nom_xestor || ', ' || filax.ap1_xestor || ', ' || filax.ap2_xestor || E'\n';

                contador = contador + 1;

            END LOOP;

        END LOOP;

    END LOOP;


    IF contador > 0 THEN

        RAISE NOTICE '%', resultado;

    ELSE

        RAISE NOTICE 'No se encontraron entrevistas para la persona con DNI %', vdni;

    END IF;


END; $$ LANGUAGE plpgsql;

