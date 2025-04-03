

drop trigger if exists tmuseo on museos;
create or replace function ftmuseo()returns trigger language plpgsql as $$

declare
vcodpa varchar;
codmu2 varchar;
begin

select codpa into vcodpa  from museos where codmu = new.codmu2;

    if new.codpa != vcodpa  then

     	raise notice 'Aceptada';
 	
 	else
 	
        RAISE exception 'denegada';

    END IF;
    
return new;
end;$$ ;
	create trigger tmuseo before insert on museos for each row execute function 		ftmuseo();

