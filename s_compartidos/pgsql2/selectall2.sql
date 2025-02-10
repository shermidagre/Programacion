-- Funcion que devolsa o salario dun xogador a partir do seu codigo

create or replace function fsalarioxogador2 (vcodx varchar) returns varchar language plpgsql as $$ 

declare
x xogador%rowtype;
resultado varchar;
begin

select * into x from xogador where codx=vcodx;

resultado= x.nomx||' '||coalesce(x.salario::TEXT,null,'salario descoñecido')||' '||coalesce(x.codequ::TEXT,null,'codigo descoñecido')||' '||coalesce (x.comision::TEXT,null,'comision descoñecida')||' '||x.datan;

return resultado;

end;$$




