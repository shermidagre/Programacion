import java.util.Scanner;

class Raizcuadrada_samuelhermida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Pedimos el numero por teclado del cual queremos saber su raiz
        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
        double num = sc.nextDouble();

        //Calculamos la raíz cuadrada del numero echo por teclado
        double raiz = Math.sqrt(num);

        System.out.printf("La raíz cuadrada de "+ num+ " es " +raiz+ "%n" );

        //Comprobacion de si es una raiz entera
        //Si la raiz es entera, es un número real, si no, es un número complejo.

        if (raiz == Math.floor(raiz)) {
            System.out.println("La raíz es un número real");
        } else {
            System.out.println("La raíz es un número complejo");
        }
    }
}
