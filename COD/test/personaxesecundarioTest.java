import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class personaxesecundarioTest {

private  personaxesecundario a;
    @BeforeEach
    void antesDenada(){
        personaxesecundario a = new personaxesecundario();
        a.setVida(1000);
        a = new personaxesecundario();
    }

    @Test

    @DisplayName("Numeros positivos")

    void valoresPositivos() {

        a.setVida(1000);

        int danho = 100;

        assertEquals(900, a.perdervida(danho));

    }



    @Test

    @DisplayName("Numeros negativos")

    void numeroNegativo() {

        a.setVida(1000);

        int danho = -100;

        assertEquals(1000, a.perdervida(danho));

    }

}