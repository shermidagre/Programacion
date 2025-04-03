create or replace procedure p1_peliculaspersonaxes(vcodpel varchar) language plpgsql as $$

declare
filac record;
resultado varchar=E'\n'; -- Declaramos al resultado tipo varchar y con la n le dabamos un espacio
vtitulo varchar;
vnomper varchar;

begin

select titulo into vtitulo from peliculas where codpel=vcodpel; -- Metemos a titulo y codpel en variables

resultado=resultado||vtitulo|| E'\n';

for filac in select codper from interpretespel where codpel=vcodpel loop -- Metemos en fila a codper 

select nomper into vnomper from personaxes where codper=filac.codper; -- Al haberlo metido en fila al codigo primario podremos hacer la comprobacion comparando a codper con la fila codper

resultado=resultado||' '||vnomper||E'\n';

end loop;
raise notice '%',resultado;

end;$$;
