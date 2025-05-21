package Boletin13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        do {
            System.out.print("Introduce número (-1 para salir): ");
            numero = sc.nextInt();

            if (numero > 0) {
                numeros.add(numero);
            }

        } while (numero != -1);

        System.out.println("Números guardados:");

        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Índice " + i + ": " + (numeros.get(i) * 100));
            }
        }
    }
}