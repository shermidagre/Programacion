create or replace procedure plistapartidos() language plpgsql as $$
declare 
fila record;
resultado varchar=E'\n';

begin

for fila in (select codpar, nompar,data,codest from partido) loop
    resultado=resultado||fila.codpar||' '||fila.nompar||' '||fila.data||' '||fila.codest||E'\n';
end loop;

raise notice '%',resultado; 

end;$$ 
