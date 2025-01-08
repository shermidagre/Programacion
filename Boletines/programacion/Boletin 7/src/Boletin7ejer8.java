public class Boletin7ejer8 {
    public static void main(String[] args) {

       System.out.println("Este programa muestra los números pares y impares de una lista" );

        int[] numeros = {9, 20, 21, 30, 31};



        System.out.println("Los números en la matriz son:");

        novalista(numeros);

    }

    static void novalista(int[] numeros) {

        int lonxitude = numeros.length; // Obtenemos la longitud del array original


        // Creacion de nuevos arrays para almacenar números pares e impares

        int[] pares = new int[lonxitude]; // Array para números pares

        int[] impares = new int[lonxitude]; // Array para números impares

        int contadorPar = 0; // Contador para números pares (con esto se hara luego la comprobacion de cuantos pares hay en nuestra array)(

        int contadorImpar = 0; // Contador para números impares(con esto se hara luego la comprobacion de cuantos impares hay en nuestra array)()

        // Con este for lo que hace es comprobar numero a numero en la array numeros

        for (int numero : numeros) {

            if (numero % 2 == 0) { // Con este if lo que hacemos es decir que si el numero lo dividimos entre 2 y da resto 0 es par el 100 por cien de los casos

                pares[contadorPar] = numero; // Almacena el número par sacado de la array numeros

                contadorPar++; // Incrementa el contador de pares

            } else { // Si la condicion anterior no se cumple, es decir no da resto cero, el numero es impar

                impares[contadorImpar] = numero; // Almacena el número impar sacadp de la array numeros

                contadorImpar++; // Incrementa el contador de impares

            }

        }

        System.out.println("Números pares:");

        for (int i = 0; i < contadorPar; i++) { // Añadimos la condicion al contador de pares
            System.out.println(pares[i]);

        }

        System.out.println("Números impares:");

        for (int i = 0; i < contadorImpar; i++) { // Añadimos la condicion al contador de impares

            System.out.println(impares[i]);

        }
        System.out.println("A suma dos numeros pares es de :" +contadorPar);
        System.out.println("A suma dos numeros impares es de :" + contadorImpar);
    }
}
