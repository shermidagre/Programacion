import DataHora.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AsociacionTest {


    @Test

    public void testConstructorYGetters() {

        Asociacion asociacion = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertEquals("12345678A", asociacion.getDNI());

        assertEquals("Juan", asociacion.getNome());

    }


    @Test

    public void testSetDniConValorNulo() {

        Asociacion asociacion = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertThrows(IllegalArgumentException.class, () -> {

            asociacion.setDni(null);

        });

    }


    @Test

    public void testSetDniConValorVacio() {

        Asociacion asociacion = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertThrows(IllegalArgumentException.class, () -> {

            asociacion.setDni("");

        });

    }


    @Test

    public void testACadea() {

        Asociacion asociacion = new Socios("12345678A", "Juan", "Calle Falsa", "Madrid", new Data(1, 1, 2023), 50);

        assertEquals("DNI: 12345678A, Nombre: Juan, Fecha de Ingreso: ", asociacion.aCadea());

    }

}