import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Hora {


    @Test

    public void testAjustarHoraConSegundosPositivos() {

        Hora hora = new Hora(0, 0, 65);

        assertEquals("00:01:05", hora.ajustarhora());

    }


    @Test

    public void testAjustarHoraConSegundosNegativos() {

        Hora reloj = new Hora(0, 0, -5);

        assertEquals("23:59:55", reloj.ajustarhora());

    }


}