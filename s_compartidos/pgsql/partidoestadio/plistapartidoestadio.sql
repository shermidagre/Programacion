create or replace procedure plistapartidoestadio() as $$
declare 
filae record;
filap record;
resultado varchar=E'\n';
begin

for filae in (select codest, nomest from estadio) loop
    resultado=resultado||filae.codest||' '||filae.nomest||E'\n';
    
    for filap in (select codpar, nompar,data,codest from partido where codest=filae.codest)  loop
    resultado=resultado||filap.codpar||' '||filap.nompar||' '||filap.data||' '||filap.codest||E'\n';
    end loop;

end loop;
raise notice '%',resultado; 

end;$$ language plpgsql
