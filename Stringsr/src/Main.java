package Strings;

class strings{

    class ContarVocales {

        static void main(String[] args) {

            String oracion = "Hola, ¿cómo estás?";

            int contadorVocales = 0;


            for (int i = 0; i < oracion.length(); i++) {

                char letra = oracion.charAt(i);

                if ("aeiouAEIOU".indexOf(letra) != -1) {

                    contadorVocales++;

                }

            }


            System.out.println("Número de vocales: " + contadorVocales);

        }

    }
    class QuitarEspacios {

        public static void main(String[] args) {

            String frase = "Hola, ¿cómo estás?";

            String sinEspacios = frase.replace(" ", "");

            System.out.println("Frase sin espacios: " + sinEspacios);

        }

    }
    class SustituirCaracteres {

        public static void main(String[] args) {

            String texto = "Hola, mundo!";

            String nuevoTexto = texto.replace("mundo", "Java");

            System.out.println("Texto modificado: " + nuevoTexto);

        }

    }

    class CambiosDePagina {

        public static void main(String[] args) {

            String texto = "Primera línea\n\tSegunda línea con tabulador";

            System.out.println(texto);

        }
    }

    class DesglosarPalabra {

        public static void main(String[] args) {

            String palabra = "programacion";

            for (int i = 0; i < palabra.length(); i += 4) {

                if (i + 4 <= palabra.length()) {

                    System.out.println(palabra.substring(i, i + 4));

                } else {

                    System.out.println(palabra.substring(i));

                }

            }

        }

    }
    class InvertirCadena {

        public static void main(String[] args) {

            String original = "Java";

            String invertida = new StringBuilder(original).reverse().toString();

            System.out.println("Cadena invertida: " + invertida);

        }

    }

    class MayusculasMinusculas {

        public static void main(String[] args) {

            String texto = "Hola Mundo";

            System.out.println("En mayúsculas: " + texto.toUpperCase());

            System.out.println("En minúsculas: " + texto.toLowerCase());

        }

    }

    class ContieneSubcadena {

        public static void main(String[] args) {

            String texto = "Hola, ¿cómo estás?";

            String subcadena = "cómo";

            if (texto.contains(subcadena)) {

                System.out.println("La cadena contiene la subcadena.");

            } else {

                System.out.println("La cadena no contiene la subcadena.");

            }

        }

    }

    class DividirCadena {

        public static void main(String[] args) {

            String frase = "Java,Python,C++,JavaScript";

            String[] lenguajes = frase.split(",");

            for (String lenguaje : lenguajes) {

                System.out.println(lenguaje);

            }

        }

    }

    class ReemplazarVocales {

        public static void main(String[] args) {

            String texto = "Hola Mundo";

            String nuevoTexto = texto.replaceAll("[aeiouAEIOU]", "*");

            System.out.println("Texto con vocales reemplazadas: " + nuevoTexto);

        }

    }

    class CompararCadenas {

        public static void main(String[] args) {

            String cadena1 = "Java";

            String cadena2 = "java";

            if (cadena1.equalsIgnoreCase(cadena2)) {

                System.out.println("Las cadenas son iguales (ignorando mayúsculas y minúsculas).");

            } else {

                System.out.println("Las cadenas son diferentes.");

            }

        }

    }

    class UltimaOcurrencia {

        public static void main(String[] args) {

            String texto = "programacion";

            char caracter = 'a';

            int indice = texto.lastIndexOf(caracter);

            System.out.println("La última aparición de '" + caracter + "' está en el índice: " + indice);

        }

    }

    class ContarPalabras {

        public static void main(String[] args) {

            String texto = "Hola, ¿cómo estás? Espero que estés bien.";

            String[] palabras = texto.split("\\s+"); // Divide por espacios en blanco

            System.out.println("Número de palabras: " + palabras.length);

        }

    }
    class LongitudPalabraMasLarga {

        public static void main(String[] args) {

            String texto = "Hola, ¿cómo estás? Espero que estés bien.";

            String[] palabras = texto.split("\\s+");

            int maxLength = 0;


            for (String palabra : palabras) {

                maxLength = Math.max(maxLength, palabra.length());

            }


            System.out.println("La longitud de la palabra más larga es: " + maxLength);

        }

    }

    class ReemplazarPalabra {

        public static void main(String[] args) {

            String texto = "Hola, ¿cómo estás? Espero que estés bien.";

            String nuevoTexto = texto.replace("bien", "excelente");

            System.out.println("Texto modificado: " + nuevoTexto);

        }

    }

    class ExtraerFrase {

        public static void main(String[] args) {

            String texto = "Hola, ¿cómo estás? Espero que estés bien.";

            int inicio = texto.indexOf("¿");

            int fin = texto.indexOf("?");



            if (inicio != -1 && fin != -1) {

                String frase = texto.substring(inicio + 1, fin);

                System.out.println("Frase extraída: " + frase);

            } else {

                System.out.println("No se encontró la frase.");

            }

        }

    }
}