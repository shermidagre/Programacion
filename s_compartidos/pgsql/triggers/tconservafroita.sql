/* Crear un triger llamado tconservafroita que impida gardar como froita un produto que xa esta fardado como conserva

*/

drop trigger if exists tconservafroita on froitas;
create or replace function f_tconservafroita()returns trigger language plpgsql as $$ 

declare

conta integer;

begin

if(select count(*) from froitas.conservas right join froitas on froitas.new.codm=conservas.new.codm into conta where codm=new.comd) and
    IF new.codm != m1 THEN

        RAISE EXCEPTION 'Inserción rechazada: este prodcuto xa esta gardado como conserva.';

    ELSE

        RAISE NOTICE 'Operación completada: El jugador puede ser insertado.';

    END IF;
    
return new;
end;$$ ;
	create trigger tconservafroita before insert on froitas for each row execute function 		f_tconservafroita(); 


