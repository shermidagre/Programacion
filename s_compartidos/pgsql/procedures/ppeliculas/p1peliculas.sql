create or replace procedure p1_peliculas() as $$

declare
fila record;
resultado varchar= E'\n';

begin

for fila in (select codper,titulo,anolanz,director from peliculas) loop
resultado=resultado||fila.codpel|| ' ' ||fila.titulo||E'\n';

end loop;
raise notice '%',resultado;

end;$$ language plpgsql;
