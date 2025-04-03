/* Crear un triger llamado tocupaestadio que nun mesmo estadio poda adestrar outro equipo no mesmo ano
E dicir hai que impedir que si un estadio xa esta ocupado nun ano determinado ningun outro equipo poda adestrar nese estadio
*/

drop trigger if exists tocupaestadio on adestra;
create or replace function f_tocupaestadio()returns trigger language plpgsql as $$ 

declare

conta integer;

begin

select count(*) into conta from adestra where ano = new.ano and codest.new.codest;


    IF conta > 0 THEN

        RAISE EXCEPTION 'Inserción rechazada';

    ELSE

        RAISE NOTICE 'Operación completada';

    END IF;
    
return new;
end;$$ ;
	create trigger tocupaestadio before insert on xoga for each row execute function 		f_tocupaestadio(); 

