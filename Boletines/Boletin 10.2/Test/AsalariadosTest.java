import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AsalariadosTest {


    @Test

    public void testConstructorYGetters() {

        Asalariados asalariado = new Asalariados("12345678A", "Juan", "01-01-2023", 3000, 15, "Desarrollador");

        assertEquals(3000, asalariado.getSueldo());

        assertEquals("Desarrollador", asalariado.getCargo());

    }


    @Test

    public void testSetSueldoNegativo() {

        Asalariados asalariado = new Asalariados("12345678A", "Juan", "01-01-2023", 3000, 15, "Desarrollador");

        asalariado.setSueldo(-100);

        assertEquals(0, asalariado.getSueldo());

    }


    @Test

    public void testCalcularGastosIngresos() {

        Asalariados asalariado = new Asalariados("12345678A", "Juan", "01-01-2023", 3000, 15, "Desarrollador");

        assertEquals(-3450, asalariado.calcularGastosIngresos());

    }


    @Test

    public void testACadea() {

        Asalariados asalariado = new Asalariados("12345678A", "Juan", "01-01-2023", 3000, 15, "Desarrollador");

        assertTrue(asalariado.aCadea().contains("Sueldo: 3000, Cargo: Desarrollador"));

    }

}