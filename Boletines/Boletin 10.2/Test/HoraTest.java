import DataHora.Hora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HoraTest {


    @Test

    public void testConstructorPorDefecto() {

        Hora hora = new Hora();

        assertEquals(0, hora.getHoras());

        assertEquals(0, hora.getMinutos());

        assertEquals(0, hora.getSegundos());

    }


    @Test

    public void testConstructorConParametros() {

        Hora hora = new Hora(14, 30, 45, "VINTECATRO");

        assertEquals(14, hora.getHoras());

        assertEquals(30, hora.getMinutos());

        assertEquals(45, hora.getSegundos());

    }


    @Test

    public void testSetHorasInvalidas() {

        Hora hora = new Hora();

        hora.setHoras(25);

        assertEquals(0, hora.getHoras()); // Debe ajustarse a 0

    }


    @Test

    public void testToStringFormato24() {

        Hora hora = new Hora(14, 30, 45, "VINTECATRO");

        assertEquals("A hora é 14:30:45", hora.toString());

    }


    @Test

    public void testToStringFormato12() {

        Hora hora = new Hora(14, 30, 45, "DOCE");

        assertEquals("A hora é 02:30:45 PM", hora.toString());

    }

}