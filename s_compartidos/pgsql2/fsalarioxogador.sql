-- Funcion que devolsa o salario dun xogador a partir do seu codigo

create or replace function fsalarioxogador (vcodx varchar) returns varchar language plpgsql as $$ 

declare
resultado varchar;
r integer;
c varchar;
begin

select nomx,salario into c,r from xogador where codx=vcodx

resultado = p||r;

return resultado;


end;$$




