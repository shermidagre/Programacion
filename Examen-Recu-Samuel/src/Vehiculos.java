import javax.imageio.ImageTranscoder;
import java.util.Scanner;
public class Vehiculos implements PrezuUso{

    int autonomia;
    int velocidademaxima;
    double consumo;
    String tecnoloxiademovilizacion;
    int matricula;
    int numeroautorizacion;

    public Vehiculos(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion) {

        this.autonomia = autonomia;
        this.velocidademaxima = velocidademaxima;
        this.consumo = consumo;
        this.tecnoloxiademovilizacion = tecnoloxiademovilizacion;
        this.matricula = matricula;
        this.numeroautorizacion = numeroautorizacion;


    }

    @Override
    public void prezoUso( int horas, int combustible, int enerxia, int combustion, double cantidadamas) {

    }

    public static void teñennumero() {
        // Esta matricula debera de ter un formato tttNNNaaaa

        // ttt se referira a el  tipo asi como para electrico ou gasolina

        // NNN se referira a depende si es terres o aereo, si es 1 sera terrestre si es mas sera aereo

        // aaaa sera para el ano de matriculacion de entre 1965 a 2025 java.util.Date ten o metodo getYear
    }

     void teñentipo() {

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Especificame si quieres saber si es electrico(1) o a combustion(2), se non queres especificar pulsa 0");
        int result = entradaTeclado.nextInt();

        while (result == 0) {

        }
        if (result == 1) {
            System.out.println("Es un coche electrico");
        }

        if (result == 2) {
            System.out.println("Es un coche a combustion");
        }
    }

    void calculoCusteViaxe(double enerxiacombustible, double horasdistancia) {

    }
    public boolean verificarnumero(String numero) {

        String regex = "^(pt)\\d{3}[a-zA-Z]{4}[a-zA-Z]$";

        return numero.matches(regex);
    }
        public String aCadea(){
        return "Estas son as suas caracteristicas";
    }


}




