create or replace procedure pmarcaproducto(nmarca varchar) language plpgsql as $$

Declare

resultado varchar='';
filam record;
vmarca varchar;
contadorp integer = 0;
totalprezo float =0;

Begin

SELECT codm INTO vmarca FROM marca WHERE nomm = nmarca; -- Metemos la variable codm dentro de una nueva y pedimos por teclado nmarca

    FOR filam IN (SELECT nome,prezo FROM produto WHERE codm = vmarca) LOOP -- Unimos el select anterior con este mediante el codm = vmarca

        contadorp = contadorp + 1;  

        totalprezo = totalprezo + filam.prezo;  

        resultado = resultado || E'\n'|| E'\n'|| filam.nome || E'\t'|| ' ' || filam.prezo;
       

	End loop;

    resultado = resultado || E'\n'|| 'El total de productos es: ' || contadorp || E'\n';

    resultado = resultado || 'El total es: ' || COALESCE(totalprezo, 0)|| E'\n'; 
    
    resultado = resultado || 'La media es: '|| totalprezo/contadorp|| E'\n';
    
    resultado = resultado || '------------------' || E'\n'|| E'\n'|| ':)';
    
    raise notice '%',resultado;


end;$$;

