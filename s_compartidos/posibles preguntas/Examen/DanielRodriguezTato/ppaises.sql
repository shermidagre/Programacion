CREATE OR REPLACE PROCEDURE ppaises()
AS $$

DECLARE

fila record;
aenome varchar;
contador integer;
resultado varchar := E'\n';
    
BEGIN
	for fila in 
		select * from paises LOOP
   	 
    		resultado := resultado || ' ' ||'pais: '|| fila.nomep || E'\n';
    		contador = 0;
    
		for aenome in 
			select nomea from aeroportos where codigop = fila.codigop LOOP
			contador = contador +1;
    
			resultado := resultado || ' ' || aenome || E'\n';
   	 
    		end LOOP;
   	 
	IF contador = 0 THEN
        	resultado := resultado || ' pais sen aeroportos' || E'\n';
    	ELSE
        	resultado := resultado || ' o numero de aeroportos deste pais e : ' || contador || E'\n';
    END IF;
   	 
END LOOP;

	raise notice '%', resultado;

 
END;
$$ language plpgsql;

/*
amose os nomes de todos os paises e para cada un deles os nomes dos aeropotos que ten, o numero todal de aropotos de dito paies .
se o paises non ten aeorportos imprimir mensaxe 'pais sen aeroporos0
call ppaises()
*/
