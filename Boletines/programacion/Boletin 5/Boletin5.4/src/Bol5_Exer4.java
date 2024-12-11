
import java.util.Scanner;


public class Bol5_Exer4 {

    public static void main(String[] args) {
        int numero;
        int resultado;
        int multiplicador = 1;
        int cerrar = 1;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduzca el numero deseado para realizar su tabla de multipicar");
        numero = entradaTeclado.nextInt();
        while (cerrar != 0) {
            resultado = numero * multiplicador;
            multiplicador++;
            System.out.println(resultado);
            System.out.println("Si quiere salir de la tabla de multiplicacion pulse 0");
            cerrar = entradaTeclado.nextInt();


        }

    }
}
