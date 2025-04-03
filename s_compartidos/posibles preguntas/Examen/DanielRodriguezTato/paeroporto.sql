CREATE OR REPLACE PROCEDURE paeroporto(vcodigoa varchar) 
AS $$

DECLARE

fila record;
fila1 record;
contadore integer;
contadora integer;
resultado varchar := E'\n';
    
BEGIN
			
select count(*) into contadora from aeroportos where codigoa = vcodigoa;
if contadora = 0 then 
	resultado = resultado || 'aeroporto inexistente ' || E'\n';
	
	else
	
	select count(*) into contadore from escalas where codigoa = vcodigoa;
	if contadore = 0 then
		resultado = resultado || 'aeroporto sen voos con escalas ' || E'\n';
	else
		
	for fila in  	
		select * from escalas where codigoa = vcodigoa LOOP
		contadore = 0;
		
    			for fila1 in 
			select codigov, datav, horav from voos where codigov = fila.codigov LOOP
			
    			resultado = resultado || ' ' || fila1.codigov || ' ' || fila1.datav || 
    			' ' || fila1.horav || E'\n'; 		    
    		END LOOP;
   	    END LOOP;
   	 end if;
end if;
	raise notice '%', resultado;
END;
$$ language plpgsql;

/*
pasandolle  codigo dun aeroporto devolte o codigo data e horas dos voos que fan escala nel.
Se no aeropoto non hai voos que fagan escala debe imprimirse a mensaxe 'aeropoto sen voos
con escalas'
se o aeropoto non existe debe imprimirse a mensaxe 'aeropoto inexistente'
call paeroporto('a7');
call paeroporto('a1'); sen voos con escalas
call paeroporto('a13'); aeroporto inexistete
*/
