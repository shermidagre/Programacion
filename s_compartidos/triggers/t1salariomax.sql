/* Crear un trigger chamdop t1_salariomax que impid inserir un novo xogador na tabla xogador que cobre mais que os do equipo onde queremos por ao novo xogador 

insert into xogador values ('x20','ana','e1',2001,10,null);  ten que negala
insert into xogador values ('x20','ana','e1',2000,10,null);  ten que aceptala

*/

drop trigger if exists t1_salariomax on xogador;
create or replace function ft1_salariomax()returns trigger language plpgsql as $$ 



declare

salariomaximoactual integer;

begin

select max(salario) into salariomaximoactual from xogador where codequ = new.codequ;

    if new.salario>salariomaximoactual then

	RAISE EXCEPTION 'Insercion rexeitada: O salario do novo xogador (% euros) é maior que o salario máximo do equipo (% euros)', new.salario, salariomaximoactual;

    ELSE

        RAISE NOTICE 'Operación completada: O xogador pode ser inserido.';

    END IF;
    
return new;
end;$$ ;
	create trigger t1_salariomax before insert on xogador for each row execute procedure 		ft1_salariomax(); 

