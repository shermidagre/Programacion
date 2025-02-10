-- Funcion que devolta todos os codigos dun xogador

create or replace function fselectall (vcodx varchar) returns varchar language plpgsql as $$ 

declare
vnomx varchar;
vcodequ varchar;
vsalario integer;
vcomision integer;
vdatan date;
resultado varchar;
BEGIN

select nomx,salario,codequ,comision,datan into vnomx,vsalario,vcodequ,vcomision,vdatan from xogador where codx=vcodx;

resultado= vnomx||' '||coalesce (vsalario::TEXT,null,'salario descoñecido')||' '||coalesce (vcodequ::TEXT,null,'codigo descoñecido')||' '||coalesce (vcomision::TEXT,null,'comision descoñecida')||' '||vdatan;

return resultado;

END; 

$$;


