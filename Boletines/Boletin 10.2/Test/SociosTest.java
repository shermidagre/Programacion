import DataHora.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SociosTest {


    @Test

    public void testConstructorYGetters() {

        Socios socio = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertEquals("Calle Falsa", socio.getDireccion());

        assertEquals("Madrid", socio.getProvincia());

        assertEquals(50, socio.getCuota());

    }


    @Test

    public void testSetCuotaNegativa() {

        Socios socio = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertThrows(IllegalArgumentException.class, () -> {

            socio.setCuota(-10);

        });

    }


    @Test

    public void testCalcularGastosIngresos() {

        Socios socio = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertEquals(50, socio.calcularGastosIngresos());

    }


    @Test

    public void testACadea() {

        Socios socio = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        String expected = "DNI: 12345678A, Nombre: Juan, Fecha de Ingreso: , Dirección: Calle Falsa, Provincia: Madrid, Cuota: 50con data de alta " + new Data(1, 1, 2023).toString();

        assertTrue(socio.aCadea().contains("Dirección: Calle Falsa"));

    }

}