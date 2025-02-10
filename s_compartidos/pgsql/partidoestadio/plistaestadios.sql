 create or replace procedure plistaestadios() language plpgsql as $$
declare 
filae record;
resultado varchar=E'\n';

begin

for filae in (select codest, nomest from estadio) loop
    resultado=resultado||filae.codest||' '||filae.nomest||E'\n';
end loop;

raise notice '%',resultado; 

end;$$ 
