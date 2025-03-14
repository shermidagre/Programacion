import DataHora.Data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DataTest {


    @Test

    public void testConstructorPorDefecto() {

        Data data = new Data();

        assertEquals(1, data.getdia());

        assertEquals(1, data.getmes());

        assertEquals(0, data.getaño());

    }


    @Test

    public void testConstructorConParametros() {

        Data data = new Data(29, 2, 2020); // Año bisiesto

        assertEquals(29, data.getdia());

        assertEquals(2, data.getmes());

        assertEquals(2020, data.getaño());

    }


    @Test

    public void testAjustarFechaDiaInvalido() {

        Data data = new Data(32, 1, 2023); // Día inválido

        data.ajustarFecha();

        assertEquals(31, data.getdia()); // Debería ajustarse al máximo permitido

    }


    @Test

    public void testAjustarFechaMesInvalido() {

        Data data = new Data(1, 13, 2023); // Mes inválido

        data.ajustarFecha();

        assertEquals(1, data.getmes()); // Debería ajustarse al mínimo permitido

        assertEquals(2024, data.getaño()); // Debería incrementar el año

    }


    @Test

    public void testAjustarFechaDiaNegativo() {

        Data data = new Data(-5, 1, 2023); // Día negativo

        data.ajustarFecha();

        assertEquals(1, data.getdia()); // Debería ajustarse al mínimo permitido

    }


    @Test

    public void testComprobarFormato() {

        Data data = new Data(1, 1, 2023);

        data.comprobarformato(1, 1, 2023, "01-01-2023");

        assertEquals("A data é 01-01-2023", data.toString());

    }


    @Test

    public void testDataIgual() {

        Data data1 = new Data(1, 1, 2023);

        Data data2 = new Data(1, 1, 2023);

        assertTrue(data1.dataigual(data2.getdia(), data2.getmes(), data2.getaño()));

    }


    @Test

    public void testToString() {

        Data data = new Data(1, 1, 2023);

        assertEquals("A data é 01/01/2023 tiene distinto formato a 01-01-2023 tiene distinto formato a 01,01,2023", data.toString());

    }

}