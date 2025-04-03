/*Lista os titulos de todalas peliculas e para cada una dela os codigos e nomes dos personaxes que interveñen nela
*/


create or replace procedure p3_peliculas_personaxes() language plpgsql as $$

declare

fila record;
filat record;
resultado varchar=E'\n';

begin

for filat in select titulo from peliculas where codpel=vcodpel loop -- Añadimos peliculas a su respectiva fila

for fila in select codper from interpretespel where codpel=vcodpel loop -- Añadimos codper a su respectiva fila

resultado=resultado||' '||filat.titulo||' '||fila.codper||E'\n';

end loop;
end loop;
raise notice '%',resultado;

end;$$;
