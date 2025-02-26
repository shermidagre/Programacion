
public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        frasemaius("Tres tristes tigres comen trigo en un trigal");
        System.out.println("-------------------------------------------");
        contarvogais("Esto es una frase de java y no se que poner");
        System.out.println("-------------------------------------------");

    }

    public static void frasemaius(String frase) {
        String nuevafrasemin = frase.toLowerCase();
        String nuevafrasemaiu = frase.toUpperCase();

        String nuevafrase2 = nuevafrasemin.replace(" ", "");
        System.out.println("A frase ou palabra original e: "+frase);
        System.out.println("A frase en minusculas e: " + nuevafrasemin);
        System.out.println("A frase en maiusculas e: " + nuevafrasemaiu);
        System.out.println("A frase en minusculas e sen espacios: " + nuevafrase2);

        String tuneada = nuevafrase2.replaceAll("a","*");
        String tuneada2 = tuneada.replaceAll("e","E");
        String tuneada3 = tuneada2.replaceAll("s","+");
        String tuneada4 = tuneada3.replaceAll("c","C");
        tuneada4.charAt(0);
        System.out.println("Frase tuneada: "+tuneada4);




    }


    static void contarvogais(String frase) {

        int contadorVocales = 0;


        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            if ("aeiouAEIOU".indexOf(letra) != -1) {

                contadorVocales++;

            }

        }

        System.out.println("A frase original e: " + frase);
        System.out.println("Número de vocales: " + contadorVocales);

    }

}

