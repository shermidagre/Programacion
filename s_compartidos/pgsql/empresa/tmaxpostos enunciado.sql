/*

tmaxpostos
impedir que un mesmo xestor poda xestionar mais de 7 postos

exemplos:

insert into postos values ('p19', 'disenador web', 3000,365,'pe2','e8','x1');

 este xestor xa xestiona 7 postos

insert into postos values ('p19', 'disenador web', 3000,365,'pe2','e8','x2');

 insercion aceptada
 \i
 
*/

drop trigger if exists tmaxpostos on postos;
create or replace function tmaxpostos()returns trigger language plpgsql as $$ 

declare

maximospuestos integer;

begin

select count(cod_xestor) into maximospuestos from postos where cod_xestor = new.cod_xestor;

    if maximospuestos >= 7 then

	RAISE EXCEPTION 'Insercion rexeitada';

    ELSE

        RAISE NOTICE 'Operación completada';

    END IF;
    
return new;
end;$$ ;

	create trigger tmaxpostos before insert on postos for each row execute procedure 		tmaxpostos(); 
