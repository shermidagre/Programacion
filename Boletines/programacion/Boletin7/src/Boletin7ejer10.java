import java.util.Scanner;
public class Boletin7ejer10 {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        System.out.println("Quieres introducir un numero? (S/N)");

        int[] numerosdesordenados = new int[10];
        numerosdesordenados[0] = 10;
        numerosdesordenados[1] = 15;
        numerosdesordenados[2] = 7;
        numerosdesordenados[3] = 34;
        numerosdesordenados[4] = 6;
        numerosdesordenados[5] = 23;
        numerosdesordenados[6] = 67;
        numerosdesordenados[7] = 21;
        numerosdesordenados[8] = 18;
        numerosdesordenados[9] = 1;

        int[] numerosordenados = new int[10];
        numerosordenados[0] = 1;
        numerosordenados[1] = 6;
        numerosordenados[2] = 7;
        numerosordenados[3] = 10;
        numerosordenados[4] = 15;
        numerosordenados[5] = 18;
        numerosordenados[6] = 21;
        numerosordenados[7] = 23;
        numerosordenados[8] = 34;
        numerosordenados[9] = 67;

        int lonxitudedesordenados = numerosdesordenados.length;
        contadoposicion(numerosordenados, 15);
    }

    static void borradoelementosarray() {

    }

    static void contadoposicion(int[] numerosordenados, int num) {
        for (int i = 0; i < numerosordenados.length; i++) {
            if (numerosordenados[i] == num) {
                System.out.println("El numero " + num + " esta en la lista y su posicion es: " + (i));
                break;
            }
        }
    }
}