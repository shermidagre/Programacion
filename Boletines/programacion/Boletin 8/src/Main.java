import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        mostrarfrase();
        System.out.println("---------------------------------------------------------------------------------------");
        investirfrase();
        System.out.println("---------------------------------------------------------------------------------------");
        eliminarespaciosenfrases();
        System.out.println("---------------------------------------------------------------------------------------");
        contavocaisconsonanteseespacios();
    }

    public static void mostrarfrase() {

        System.out.println("Aqui mostraremos unha frase e como se separan os seus caracteres");
        String frase = "Isto e java!";
        System.out.println(frase);
        // Convertir la cadena en un arreglo de caracteres
        // El método toCharArray() devuelve un arreglo de caracteres que contiene cada carácter de la cadena.
        char[] caracteres = frase.toCharArray();
        // Imprimir todos los caracteres en una sola línea

        System.out.println("Los caracteres de la frase son: " + Arrays.toString(caracteres));

    }

    public static void investirfrase() {

        System.out.println("Investiremos a frase Java dende 0");

        String frase = "Java dende 0";

        System.out.println("Frase original: " + frase);

        // Invertir la cadena
        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        // Imprimir la frase invertida
        System.out.println("Frase invertida: " + fraseInvertida);

        // Convertir la cadena invertida en un arreglo de caracteres
        char[] caracteresInvertidos = fraseInvertida.toCharArray();

        // Imprimir todos los caracteres de la frase invertida en una sola línea
        System.out.println("Los caracteres de la frase invertida son: " + Arrays.toString(caracteresInvertidos));

    }

    public static void eliminarespaciosenfrases() {
        System.out.println("Eliminaremos os espacios en blanco de una frase");
        String frase = "James Gosling Created Java";
        System.out.println("Frase original: " + frase);
        // Eliminar los espacios en blanco con el método replace()
        String fraseSinEspacios = frase.replace(" ", "");
        // Imprimir la frase sin espacios en blanco
        System.out.println("Frase sin espacios en blanco: " + fraseSinEspacios);
    }

    public static void contavocaisconsonanteseespacios() {
        System.out.println("Aqui contaremos as vocais, as consonantes e os espacios de unha frase");
        String frase = "java java java";

        // Iterar sobre cada carácter de la cadena
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Verificar si el carácter es una letra
            if (Character.isLetter(caracter)) {
                System.out.print(caracter + " "); // Separar letras con un espacio

            } else {
                // Si no es una letra, puedes hacer otra cosa, como imprimirlo directamente
                System.out.print("[" + caracter + "] "); // Separar otros caracteres con corchetes

            }

        }

    }
}