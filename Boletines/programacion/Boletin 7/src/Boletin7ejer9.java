

public class Boletin7ejer9 {
    public static void main(String[] args) {
        System.out.println("Este programa busca un numero en una lista de numeros aleatorios y elimina los numeros repetidos");
        int[] numerosrandom = new int[14];
        numerosrandom[0] = 30;
        numerosrandom[1] = 16;
        numerosrandom[2] = 45;
        numerosrandom[3] = 30;
        numerosrandom[4] = 65;
        numerosrandom[5] = 9;
        numerosrandom[6] = 44;
        numerosrandom[7] = 67;
        numerosrandom[8] = 89;
        numerosrandom[9] = 21;
        numerosrandom[10] = 11;
        numerosrandom[11] = 53;
        numerosrandom[12] = 45;
        numerosrandom[13] = 23;

        System.out.println("Array original:");

        for (int numero : numerosrandom) {

            System.out.print(numero + " ");

        }

        int lonxitude = numerosrandom.length; // Numeros.length sirve para calcular la longitud de todos los datos que tiene dentro nuestra array

        int[] novalista = new int[lonxitude]; // Crear un nuevo array con la misma longitud

        // Mediante este bucle copiamos los elementos del array original al nuevo array "novalista"
        for (int i = 0; i < lonxitude; i++) {

            novalista[i] = numerosrandom[i];

        }

        int contador= 0;

        System.out.println("...Eliminando repetidos...");

        // Este for realiza un recorrido por cada numero de la array "novalista" y los imprime por pantalla

        for (int numero : novalista) { // Mientras se haga el recorrido por la array , antes de sacarla for pantalla hace la siguiente comprobacion
            boolean repetido = false;
            for (int i = 0; i < contador; i++) {
                if (numero == novalista[i]) {// Hace la comprobacion de si el numero de la array novalista es igual a ella misma se hace una funcion boleana de repetido = verdadero por lo cual si es repetido no se suma al contador.
                    repetido = true;
                    break;
                }
            }
            if (!repetido) { // Si el numero no es repetido se hace incremento en uno de una nueva array llamada contador
                novalista[contador] = numero;
                contador++;
            }
        }
        System.out.println("Array sin repetidos:");
        for (int i = 0; i < contador; i++) { // Este for imprime los elementos del nuevo array que no estan repetidos
            System.out.print(novalista[i] + " ");
        }
        }
    }


