/* Crear un triger llamado tocupaposto que haga que no se puedan añadir puestos iguales en los mismos partidos

*/

drop trigger if exists tocupaposto on xoga;
create or replace function f_tocupaposto()returns trigger language plpgsql as $$

declare

postoactual integer;

begin

select posto into postoactual from xoga where posto = new.posto;

    if new.posto != posto then

	RAISE EXCEPTION 'Insercion rexeitada'

 else
        RAISE NOTICE 'Operación completada: O xogador pode ser inserido.';

    END IF;
    
return new;
end;$$ ;
	create trigger tocupaposto before insert on xoga for each row execute function 		f_tocupaposto();

