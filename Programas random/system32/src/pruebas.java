import java.util.Random;

import java.util.Scanner;


class Example {


    // Códigos ANSI para colores

    public static final String ANSI_GREEN = "\u001B[32m"; // Verde

    public static final String ANSI_RED = "\u001B[31m";   // Rojo

    public static final String ANSI_BLUE = "\u001B[34m";  // Azul

    public static final String ANSI_RESET = "\u001B[0m";  // Restablecer color


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        // Array de curiosidades

        String[] curiosidades = {

                "Los pulpos tienen tres corazones.",

                "Las abejas pueden reconocer rostros humanos.",

                "Los flamencos son rosas debido a su dieta de camarones.",

                "Los canguros no pueden caminar hacia atrás.",

                "Las hormigas pueden levantar hasta 50 veces su propio peso.",

                "Los gatos tienen más huesos que los humanos.",

                "El corazón de un camarón está en su cabeza.",

                "Los delfines tienen nombres para cada uno de sus compañeros.",

                "Las vacas tienen amigos y se estresan cuando están separados.",

                "Los humanos y los delfines son las únicas especies que tienen sexo por placer."

        };


        int choice = 0; // Declarar choice fuera del bucle


        while (true) {

            System.out.println("¿Eres g4y?");

            System.out.println("1. si");

            System.out.println("2. no");

            System.out.println("3. Curiosidades");

            System.out.println("4. Salir");


            try {

                choice = scanner.nextInt();

            } catch (Exception e) {

                System.out.println(ANSI_RED + "Entrada no válida. Por favor, elige un número." + ANSI_RESET);

                scanner.next(); // Limpiar el buffer

                continue; // Volver al inicio del bucle

            }


            switch (choice) {

                case 1:

                    System.out.println(ANSI_GREEN + "Confirmado, eres chemari" + ANSI_RESET);

                    // Si elige "1", el bucle se repite

                    break;


                case 2:

                    System.out.println(ANSI_RED + "ERROR" + ANSI_RESET);

                    System.out.println("-------------------------------------------------");

                    System.out.println(ANSI_RED + "Deleting system32..." + ANSI_RESET);

                    System.out.println(ANSI_RED + "Por favor, espera..." + ANSI_RESET);


                    // Simulación de un proceso de eliminación

                    try {

                        Thread.sleep(2000); // Simula un retraso de 2 segundos

                    } catch (InterruptedException e) {

                        Thread.currentThread().interrupt();

                    }


                    System.out.println(ANSI_RED + "Eliminando archivos..." + ANSI_RESET);

                    try {

                        Thread.sleep(2000); // Simula otro retraso

                    } catch (InterruptedException e) {

                        Thread.currentThread().interrupt();

                    }


                    System.out.println(ANSI_RED + "¡Error crítico! No se puede eliminar 'system32'." + ANSI_RESET);

                    System.out.println(ANSI_GREEN + "El sistema se ha protegido contra la eliminación de archivos críticos." + ANSI_RESET);

                    System.out.println("-------------------------------------------------");

                    System.out.println(ANSI_BLUE + "BIIIENN, gana el sistema" + ANSI_RESET);

                    System.out.println(ANSI_BLUE + "Comprobando archivos" + ANSI_RESET);

                    try {

                        Thread.sleep(2000); // Simula otro retraso

                    } catch (InterruptedException e) {

                        Thread.currentThread().interrupt();

                    }


                    System.out.println("-------------------------------------------------");

                    System.out.println(ANSI_RED + "Bromita, se está eliminando del todo mientras lees esto, pd eres un pussilanime" + ANSI_RESET);

                    break;


                case 3:

                    // Mostrar una curiosidad aleatoria

                    int randomIndex = random.nextInt(curiosidades.length);

                    System.out.println(ANSI_BLUE + "Curiosidad: " + curiosidades[randomIndex] + ANSI_RESET);

                    break;


                case 4:

                    System.out.println(ANSI_GREEN + "Saliendo del programa. ¡Hasta luego!" + ANSI_RESET);

                    scanner.close();

                    return; // Salir del programa


                default:

                    System.out.println(ANSI_RED + "Opción no válida. Por favor, elige 1, 2, 3 o 4." + ANSI_RESET);

                    break;

            }
        }
    }
}


            // Si el usuario selecciona "1", el bucle se repetirá.

            // Si selecciona "2", "3" o