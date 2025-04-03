/* Crear un triger llamado tocupaposto que haga que no se puedan añadir puestos iguales en los mismos partidos

*/

drop trigger if exists tactualizanumx on xogador;

create or replace function ftactualizanumx()returns trigger language plpgsql as $$

declare

begin

update equipo set numx= coalesce(numx,0)+1 where codequ = new.codequ;
    
return new;
end;$$ ;
create trigger tactualizanumx before insert on xogador for each row execute function 		ftactualizanumx();

