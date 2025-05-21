package Boletin13;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce temperatura: ");
                    double temp = sc.nextDouble();
                    temperaturas.add(temp);
                    System.out.println("Registrada.");
                    break;

                case 2:
                    System.out.println("Registros:");
                    for (double t : temperaturas) {
                        System.out.println(t + " ºC");
                    }
                    break;

                case 3:
                    if (temperaturas.isEmpty()) {
                        System.out.println("No hay registros.");
                    } else {
                        double max = Collections.max(temperaturas);
                        double min = Collections.min(temperaturas);
                        double promedio = 0;
                        for (double t : temperaturas) {
                            promedio += t;
                        }
                        promedio /= temperaturas.size();

                        System.out.println("Máximo: " + max);
                        System.out.println("Mínimo: " + min);
                        System.out.println("Promedio: " + promedio);
                    }
                    break;

                case 4:
                    salir = true;
                    guardarDatos(temperaturas);
                    System.out.println("Datos guardados. Adiós.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Guardar datos en archivo binario
    public static void guardarDatos(List<Double> temperaturas) {
        try {
            String fecha = new SimpleDateFormat("yyyyMMdd").format(new Date());
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("registros" + fecha + ".dat"));

            oos.writeObject(temperaturas);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }
}