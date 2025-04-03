/*

trexeita
valor : 2'5 puntos

trigger que impida entrevistar a unha persoa para un posto si dita persoa e rexeitada 
pola empresa a  que corresponde dito posto.


insert into entrevista values('p9',20,'f','f');

'non podes entrevistar a esta persoa para dito posto pois e rexeitada por a empresa que lle corresponde a dito posto'

insert into entrevista values('p90',7,'f','f');
 non existe a persoa ou o posto

insert into entrevista values('p9',70,'f','f');
 non existe a persoa ou o posto

insert into entrevista values('p9',6,'f','f');
entrevista aceptada

*/


drop trigger if exists trexeita on entrevista;
create or replace function trexeita()returns trigger language plpgsql as $$

declare

codpp varchar;

nump integer;

code varchar;

nume integer;

begin

SELECT cod_posto INTO codpp FROM postos WHERE cod_posto = new.cod_posto;

select cod_empresa,num_persoa into code,nume from rexeita where num_persoa=new.num_persoa;

select num_persoa into nump from persoas where num_persoa = new.num_persoa;


	IF nump IS NULL OR codpp IS NULL THEN

        	RAISE EXCEPTION 'non existe a persoa ou o posto';

    	END IF;
 	
 	IF code = codpp and nume = nump THEN

	RAISE EXCEPTION 'non podes entrevistar a esta persoa para dito posto pois e rexeitada por a empresa que lle corresponde a dito posto';

 	else
 	
        RAISE NOTICE 'entrevista aceptada';

    END IF;
    
return new;
end;$$ ;
	create trigger trexeita before insert on entrevista for each row execute function 		trexeita();
