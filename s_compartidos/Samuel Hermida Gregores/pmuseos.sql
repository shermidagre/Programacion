CREATE OR REPLACE PROCEDURE pmuseos(vnommu varchar) language plpgsql
AS $$

DECLARE

filavisitantes record;
filavisitan record;
contador integer;
resultado varchar = E'\n';
vcodmu varchar;
    
BEGIN
select codmu into vcodmu from museos where nommu = vnommu;
contador= 0;
for filavisitan in 
		
	select * from visitan where vcodmu = codmu LOOP
	
	resultado = resultado || ' ' || filavisitan.datavi ||',';
	
	for filavisitantes in 

		select * from visitantes where filavisitan.codpa = codpa and filavisitan.n = n LOOP
		
		resultado = resultado || filavisitantes.nomv|| E'\n' ;
		
			contador = contador +1;

    		end LOOP;
   END LOOP;	
    
	IF contador = 0 THEN
        	resultado = resultado || 'Sen visitantes ' || E'\n';
    	ELSE
        	resultado = resultado || 'O numero de visitantes de este museo e : ' || contador || E'\n';
    	END IF;
    	
    	RAISE NOTICE '%', resultado;

	

end;$$;

