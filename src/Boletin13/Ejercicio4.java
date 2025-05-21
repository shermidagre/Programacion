package Boletin13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> positivos = new ArrayList<>();
        ArrayList<Double> negativos = new ArrayList<>();

        double numero;
        do {
            System.out.print("Introduce número (0 para salir): ");
            numero = sc.nextDouble();

            if (numero > 0) {
                positivos.add(numero);
            } else if (numero < 0) {
                negativos.add(numero);
            }

        } while (numero != 0);

        // Mostrar resultados
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        // Sumar
        double sumaPos = 0;
        for (double d : positivos) {
            sumaPos += d;
        }

        double sumaNeg = 0;
        for (double d : negativos) {
            sumaNeg += d;
        }

        System.out.println("Suma positivos: " + sumaPos);
        System.out.println("Suma negativos: " + sumaNeg);

        // Limpiar extremos
        ArrayList<Double> nuevosPos = new ArrayList<>();
        for (double d : positivos) {
            if (d <= 10) {
                nuevosPos.add(d);
            }
        }

        ArrayList<Double> nuevosNeg = new ArrayList<>();
        for (double d : negativos) {
            if (d >= -10) {
                nuevosNeg.add(d);
            }
        }

        System.out.println("Positivos limpios: " + nuevosPos);
        System.out.println("Negativos limpios: " + nuevosNeg);
    }
}