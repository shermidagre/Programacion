CREATE OR REPLACE PROCEDURE pdescubridores()
AS $$

DECLARE

filades record;
filaacha record;
contador integer;
resultado varchar = E'\n';
    
BEGIN
	for filades in 
		select * from descubridores LOOP
   	 
    		resultado = resultado || ' ' ||'Nome: '|| filades.nomd ||', Especialidade: '|| filades.especialidade || E'\n';
    		contador = 0;
    
		for filaacha in 
			select noma,datacion from achados where codd = filades.codd LOOP
			
			contador = contador +1;
    
			resultado = resultado || ' ' || filaacha.noma ||','|| filaacha.datacion || E'\n'|| E'\n';
   	 
    		end LOOP;
   	 
	IF contador = 0 THEN
        	resultado = resultado || 'Sen achados ' || E'\n';
    	ELSE
        	resultado = resultado || 'O numero de achados de este descubridor e : ' || contador || E'\n'|| E'\n';
    END IF;
   	 
END LOOP;

	raise notice '%', resultado;

 
END;
$$ language plpgsql;
