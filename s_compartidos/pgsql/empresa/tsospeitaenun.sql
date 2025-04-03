/*

tsospeita

valor : 2.5 puntos

trigger que rexeite  entrevistar a unha persoa para un posto si o xestor de dito posto ten os mesmos apelidos que a persoa entrevistada 

ex: insert into entrevista values('p18',8,'f','f');
ERROR:  non podes entrevistar a esta persoa para dito posto pois o xestor do posto ten os seus apelidos

ex: insert into entrevista values('p9',23,'f','f');
NOTICE:   entrevista aceptada pois a persoa non ten os apelidos do xestor do posto


*/


drop trigger if exists tsospeita on entrevista;
create or replace function tsospeita()returns trigger language plpgsql as $$

declare

a1x varchar;
a2x varchar;
a1p varchar;
a2p varchar;
codx varchar;

begin

SELECT cod_xestor INTO codx FROM postos WHERE cod_posto = NEW.cod_posto;

select ap1_xestor,ap2_xestor into a1x,a2x from xestores where cod_xestor=codx;

select ap1_persoa,ap2_persoa into a1p,a2p from persoas where num_persoa = new.num_persoa;


	IF a1x IS NULL OR a2x IS NULL OR a1p IS NULL OR a2p IS NULL THEN

        	RAISE EXCEPTION 'Error: Non se atoparon os apellidos do xestor ou da persoa.';

    	END IF;
 	
 	IF a1x = a1p OR a1x = a2p OR a2x = a1p OR a2x = a2p THEN

	RAISE EXCEPTION 'Insercion rexeitada';

 	else
 	
        RAISE NOTICE 'entrevista aceptada pois a persoa non ten os apelidos do xestor do posto';

    END IF;
    
return new;
end;$$ ;
	create trigger tsospeita before insert on entrevista for each row execute function 		tsospeita();

