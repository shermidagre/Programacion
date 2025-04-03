/* 

trepartepedido

impedir que un repartidor cargue pedidos que sean de clientes de zonas distintas as que el esta asignado

insert into carga values ('p13','z1',1,2,'12/7/11',18);
 este pedido non  corresponde repartilo a este repartidor


insert into carga values ('p13','z2',1,2,'12/7/11',18);
 pedido cargado


*/

DROP TRIGGER IF EXISTS trepartep ON carga;


CREATE OR REPLACE FUNCTION ftrepartep() RETURNS TRIGGER LANGUAGE plpgsql AS $$

DECLARE

    zonarepartidor VARCHAR;

    zonacliente VARCHAR;

BEGIN

    -- Obtener la zona del repartidor

    SELECT codz INTO zonarepartidor FROM repartidor WHERE codz = new.codz; 

    SELECT codz INTO zonacliente FROM cliente WHERE nif = (SELECT nif FROM pedido WHERE codp = NEW.codp); 


    IF zonarepartidor = zonacliente THEN

        RAISE NOTICE 'Pedido cargado';

        RETURN NEW; -- Permitir la inserción

    ELSE

        RAISE EXCEPTION 'No se puede cargar el pedido, zonas diferentes.';

    END IF;

END; $$;


CREATE TRIGGER trepartep BEFORE INSERT ON carga FOR EACH ROW EXECUTE FUNCTION ftrepartep();
