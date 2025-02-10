create or replace procedure plistaestadiojugado(vcodest varchar) as $$
declare 
fila record;
resultado varchar=E'\n';
begin

for fila in (select codpar,nompar,data from partido where codest=vcodest)loop

resultado=resultado||fila.codpar||fila.nompar||fila.data||E'/n';

end loop;
raise notice '%',resultado; 

end;$$ language plpgsql
