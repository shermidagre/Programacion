import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VoluntariosTest {


    @Test

    public void testConstructorYGetters() {

        Voluntarios voluntario = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertEquals(30, voluntario.getEdad());

        assertEquals("Ingeniero", voluntario.getProfesion());

        assertEquals(10, voluntario.getHorasTrabajo());

    }


    @Test

    public void testSetEdadNegativa() {

        Voluntarios voluntario = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertThrows(IllegalArgumentException.class, () -> {

            voluntario.setEdad(-5);

        });

    }


    @Test

    public void testSetEdadMayorQue130() {

        Voluntarios voluntario = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertThrows(IllegalArgumentException.class, () -> {

            voluntario.setEdad(150);

        });

    }


    @Test

    public void testCalcularGastosIngresos() {

        Voluntarios voluntario = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        assertEquals(-3, voluntario.calcularGastosIngresos());

    }


    @Test

    public void testACadea() {

        Voluntarios voluntario = new Voluntarios("12345678A", "Juan", "01-01-2023", 30, "Ingeniero", 10);

        String expected = "DNI: 12345678A, Nombre: Juan, Fecha de Ingreso: , Edad: 30, Profesión: Ingeniero, Horas de Trabajo: 10";

        assertTrue(voluntario.aCadea().contains("Edad: 30"));

    }

}