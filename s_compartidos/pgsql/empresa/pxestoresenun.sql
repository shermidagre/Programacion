--pxestores 
--valor: 2'5 puntos
--procedimiento que devolva para cada codigo de xestor os postos e a 
--descripcion dos mesmos que xestionou dito xestor, asi como o numero total de postos
-- xestionados por dito xestor.
--si o xestor non xestionou ningun posto debe lanzarse 
--a mensaxe 'este xestor non xestionou ningun posto'
--call pxestores()

/*
resultado:
xestor: x1
p1----direc. dep. informatica
p8----vendedor senora
p11----disenador aplicacions
p14----vendedor caballero
p15----vendedor neno
p16----vendedor viaxes
p17----vendedor plantas
total: 7

xestor: x10
este xestor non xestionou ningun posto

xestor: x2
p2----barrendeiro
p7----xefe iluminacion
p9----xefe xardineiros
p10----instalador software
p12----revisor ascensores
total: 5

xestor: x3
p3----limpador colexios
p6----perforador pozos
p13----coidador parques
total: 3

xestor: x4
p4----instalador ordenadores
total: 1

xestor: x5
p342----empregado biblioteca
total: 1

xestor: x6
p5----limpador instalaciones
total: 1

xestor: x7
este xestor non xestionou ningun posto

xestor: x8
este xestor non xestionou ningun posto

xestor: x9
p18----vendedor plantas
total: 1

*/


CREATE OR REPLACE PROCEDURE ppersoa() AS $$

DECLARE

filap record;
resultado varchar = '';
vcodxestor varchar;
contador integer;

BEGIN


    for  vcodxestor IN (select cod_xestor FROM xestores) LOOP
    
     resultado = resultado||'xestor : '|| vcodxestor || E'\n';
     contador=0;
     
     for filap in(select cod_posto,des_posto from postos where cod_xestor=vcodxestor) LOOP
     
               	contador = contador +1;
               	resultado = resultado || filap.cod_posto || ':' || filap.des_posto || 'contador' || contador ||E'\n' ;
               	
     end loop;
        
    
        IF contador > 0 THEN

            resultado = resultado || 'total: ' || contador || E'\n'|| E'\n';

        ELSE

            resultado = resultado || 'este xestor non xestionou ningun posto' || E'\n'|| E'\n';

        END IF;
        

     end loop;
     
            	RAISE NOTICE '%', resultado;
            	
END; $$ LANGUAGE plpgsql;
    
    
    
    
    
    
    
    
    
