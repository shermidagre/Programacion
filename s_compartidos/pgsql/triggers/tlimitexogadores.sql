/* Crear un trigger chamdop t_limite xogadores,que cuando codpar tenga una cuenta mayor a 5 no deje insertar, y cuando sea menor si

insert into xoga values ('x20','p1',4,6);

*/

drop trigger if exists tlimitexogadores on xoga;
create or replace function f_tlimitexogadores()returns trigger language plpgsql as $$ 

declare

xogadoresactuais integer;

begin

select count(*) into xogadoresactuais from xoga where codpar = new.codpar;

    if xogadoresactuais>=5 then

	RAISE EXCEPTION 'Insercion rexeitada'

 else
        RAISE NOTICE 'Operación completada: O xogador pode ser inserido.';

    END IF;
    
return new;
end;$$ ;
	create trigger tlimitexogadores before insert on xoga for each row execute function 		f_tlimitexogadores(); 

