import java.util.Scanner;


class MenuExample {


    // Códigos ANSI para colores

    public static final String ANSI_GREEN = "\u001B[32m"; // Verde

    public static final String ANSI_RED = "\u001B[31m";   // Rojo

    public static final String ANSI_RESET = "\u001B[0m";  // Restablecer color


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("¿Eres g4y?");

        System.out.println("1. si");

        System.out.println("2. no");


        int choice = scanner.nextInt();


        switch (choice) {

            case 1:

                System.out.println(ANSI_GREEN + "Confirmado, eres chemari" + ANSI_RESET);

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

                System.out.println("BIIIENN, gana el sistema");

                System.out.println("-------------------------------------------------");

                System.out.println(ANSI_RED + "Bromita, se esta eliminando del todo mientras lees esto, pd eres un pussilanime" + ANSI_RESET);

                break;


            default:

                System.out.println("Opción no válida. Por favor, elige 1 o 2.");

                break;

        }


        scanner.close();

    }

}