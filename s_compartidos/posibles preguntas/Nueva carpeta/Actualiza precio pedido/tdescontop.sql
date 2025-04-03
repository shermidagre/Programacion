/*

tdesconto

trigger que actualiza o total dun pedido cando se engade un novo producto na composicion de dito pedido.

ter en conta que debe aplicarse un desconto do 10% ao total do pedido cando o total de dito pedido tendo en conta o novo producto  iguale ou supere os 90 euros :

nota1: observese que  que cando se engade un produto na composicion dun pedido o total deberia actualizarse no prezo de dito pedido  multiplicado  pola cantidade de unidades do mesmo (prezo * cantidade)

nota2: se alguen usa a coma decimal ter en cota que debe usarse '.' en lugar de coma, por exemplo para calcular o 10% de 90 podemos fariamos 90*0.10


insert into compon values ('p10','m1',1,5);  
desconto aplicado (o pedido p10 pasa a ter  por total o valor 82 cando deberia ser de 91)

facer rollback para deixar o pedido p10 en condicions iniciais antes de facer o insert que sigue

insert into compon values ('p10','m1',1,4);  
non se aplica desconto ( o pedido p10 pasa a ter por total o valor 89)


*/

DROP TRIGGER IF EXISTS tdescontop ON compon;

CREATE OR REPLACE FUNCTION ftdescontop() RETURNS TRIGGER LANGUAGE plpgsql AS $$


DECLARE

    totalinicial INTEGER;

    totalfinal INTEGER;

    precioproducto INTEGER;  

    cantidadproducto INTEGER;


BEGIN

    SELECT total INTO totalinicial FROM pedido WHERE codp = NEW.codp;

    SELECT prezo INTO precioproducto FROM produto WHERE codm = NEW.codm;  

    totalfinal = totalinicial + (precioproducto * new.cantidade);


    IF totalfinal >= 90 THEN

        totalfinal = totalfinal * 0.90; -- Aplicar un 10% de descuento

        RAISE NOTICE 'Descuento aplicado: nuevo/total es %', totalfinal;

    ELSE

        RAISE NOTICE 'No se aplica descuento: total es %', totalfinal;

    END IF;


    UPDATE pedido SET total = totalfinal WHERE codp = NEW.codp;


    RETURN NEW;


END; $$;


CREATE TRIGGER tdescontop AFTER INSERT ON compon FOR EACH ROW EXECUTE PROCEDURE ftdescontop();
