import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TraballadoresTest {


    @Test

    public void testConstructorYGetters() {

        Traballadores trabajador = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertEquals("12345678A", trabajador.getDNI());

        assertEquals("Juan", trabajador.getNome());

    }


    @Test

    public void testGetFecha() {

        Traballadores trabajador = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertEquals("01-01-2023", trabajador.getFecha());

    }


    @Test

    public void testCalcularGastosIngresos() {

        Traballadores trabajador = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertEquals(-3, trabajador.calcularGastosIngresos());

    }


    @Test

    public void testACadea() {

        Traballadores trabajador = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertTrue(trabajador.aCadea().contains("Edad: 30"));

    }

}