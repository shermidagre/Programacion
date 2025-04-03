/*
tperfil:

realizar un trigger  chamado tperfil que comprobe que cando se entrevista a unha persona para un posto , dita persoa ten o mesmo perfil que corresponde o puesto.

Cando o perfil do posto e persona coincidan debe realizarse a insercion lanzandose a mensaje : entrevista insertada perfiles coincidentes. Si o perfil de posto e persona non coinciden a mensaxe debe ser : perfiles de posto e persoa non coincidentes.


insert into entrevista values('p14',14,'f','f');
ERROR:  perfiles de posto e persoa non coincidentes

insert into entrevista values('p14',15,'f','f');
NOTICE:   entrevista insertada perfiles coincidentes

*/

drop trigger if exists tperfil on entrevista;
create or replace function tperfil()returns trigger language plpgsql as $$ 

declare

perfilpersoas varchar;
perfilposto varchar;

begin

select  cod_perfil into perfilpersoas from persoas where num_persoa = new.num_persoa;

select cod_perfil into perfilposto from postos where cod_posto = new.cod_posto;


	    IF perfilpersoas IS NULL OR perfilposto IS NULL THEN

        	RAISE EXCEPTION 'Error: num_persoa o cod_posto no existen.';

    	    END IF;


   if perfilpersoas = perfilposto then

	RAISE EXCEPTION 'Entrevista insertada: perfiles coincidentes.';

    ELSE

        RAISE NOTICE 'ERROR:  perfiles de posto e persoa non coincidentes';

    END if;
    
return new;
end;$$ ;

	create trigger tperfil before insert on entrevista for each row execute procedure 		tperfil(); 

