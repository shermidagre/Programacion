import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceme una palabra para sacar sus primeros dos caracteres y sus ultimos 3 caracteres");
        imprimirprimerosDoscaracteresyultimosdoscaracteres();
        obtenerCaracteresConSaltores();
        invertirPalabrares();
    }
        public static void imprimirprimerosDoscaracteresyultimosdoscaracteres () {
            Scanner sc = new Scanner(System.in);
            String frase = sc.next();
            if (frase.length() >= 2) {

                // Obtenemos los primeros dos caracteres

                String primerosDosCaracteres = frase.substring(0, 2);

                // Imprimimos los primeros dos caracteres

                System.out.println("Los primeros dos caracteres son: " + primerosDosCaracteres);

            } else {

                System.out.println("El string es demasiado corto.");

            }
            if (frase.length() >= 2) {

                // Obtenemos los últimos dos caracteres

                String ultimosDosCaracteres = frase.substring(frase.length() - 3);

                // Imprimimos los últimos dos caracteres

                System.out.println("Los últimos dos caracteres son: " + ultimosDosCaracteres);

            } else {

                System.out.println("El string es demasiado corto.");

            }
            // Cerramos el scanner

        }

        public static void obtenerCaracteresConSaltores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme una palabra para hacer un salto de caracter despues de cada caracter");
        String palabra = sc.next();

        String resultado = obtenerCaracteresConSalto(palabra);

        System.out.println("La palabra resultante es: " + resultado);

        }


    public static String obtenerCaracteresConSalto(String palabra) {

        StringBuilder nuevaPalabra = new StringBuilder();
        // Iteramos sobre la palabra, tomando cada segundo carácter

        for (int i = 0; i < palabra.length(); i++) {

            // Solo añadimos el carácter si el índice es par

            if (i % 2 == 0) {

                nuevaPalabra.append(palabra.charAt(i));

            }

        }

        return nuevaPalabra.toString();


    }
    public static void invertirPalabrares() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme una palabra para sacarla por pantalla junto a su copia al reves");
        String palabra = sc.next();
        String resultado = invertirPalabra(palabra);

        System.out.println("La palabra resultante es: " +palabra+resultado);

    }
    public static String invertirPalabra(String palabra) {

        StringBuilder resultado = new StringBuilder();

        // Iteramos desde el último carácter hasta el primero

        for (int i = palabra.length() - 1; i >= 0; i--) {

            resultado.append(palabra.charAt(i));

        }

        return resultado.toString();

    }

}


