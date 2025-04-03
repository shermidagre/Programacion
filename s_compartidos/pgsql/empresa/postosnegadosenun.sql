
/*

procedemento postosnegados  que dado o dni dunha persoa devolte a lista dos postos de traballo para os que non  poderia  ser entrevistada debido a que algunhas empresas rexeitan a dita persoa.

call postosnegados('36202020');

p2
p9
p13
p8
p14
p15
p16
p17

esta persoa e rexeitada para un total de 8 postos

execute postosnegados('36222222');

esta persoa e entrevistable para calquera posto de calqueira empresa

*/

CREATE OR REPLACE PROCEDURE postosnegados(vdni varchar) AS $$

DECLARE


	filar record;
	filap record;

    resultado varchar = '';

    contador integer = 0;	--Contador para posteriormente sacarlo po rpantalla

    vnumpersoa integer;

BEGIN

-- En caso de que el dni pasado por parametro sea invalido mandara mensaje de que es invalido

    IF vdni IS NULL THEN

        RAISE NOTICE 'El DNI no puede ser NULL';

        RETURN;

    END IF;

-- Realizamos el primer select para igual el dni de personas al pillado por parametro y para coger el numero de persona que posteriormente vamos a utilizar


    SELECT num_persoa INTO vnumpersoa FROM persoas WHERE dni = vdni;

--Realizamos comprobacion en caso de que haya un num_persoa null (no deberia)

    IF vnumpersoa IS NULL THEN

        RAISE NOTICE 'No se ha encontrado la persona con DNI %', vdni;

        RETURN;

    END IF;

-- Recorremos la relacion rexeita para asi coger el codigo principal y el num persona que tienen en comun personas y rexeita

    FOR filar IN (SELECT cod_empresa FROM rexeita WHERE num_persoa = vnumpersoa) LOOP
    
-- Recorremos la entidad postos para asi coger el codigo principal y el num persona que tienen en comun personas, rexeita y postos

        FOR filap IN (SELECT cod_posto FROM postos WHERE cod_empresa = filar.cod_empresa) LOOP

            resultado = resultado || filap.cod_posto || E'\n';

            contador = contador + 1;
            
            -- En caso de que todo se cumpla llamamos al contador, gracias al cod_posto saldran por pantalla todos los codigos que cumplan las condiciones anteriores

        END LOOP;

    END LOOP;

-- En caso de que si que haya concurrencias se mandara el mensaje deseado y en caso de que no , la persona con ese dni, puede entrar en empresas

    IF contador > 0 THEN

        RAISE NOTICE 'Esta persona es rechazada para un total de % puestos:', contador;

        RAISE NOTICE '%', E'\n'|| resultado || E'\n';

    ELSE

        RAISE NOTICE 'Esta persona es entrevistable para cualquier puesto de cualquier empresa';

    END IF;


END; $$ LANGUAGE plpgsql;

