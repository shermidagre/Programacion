public class Boletin7ejer7 {


    public static void main(String[] args) {

        //Creamos un array con algunos números randoms enteros

        int[] numeros = {9, 20, 21, 30, 31};

        System.out.println("Los números en la matriz son:");

        int lonxitude = numeros.length; // Numeros.length sirve para calcular la longitud de todos los datos que tiene dentro nuestra array

        int[] novalista = new int[lonxitude]; // Crear un nuevo array con la misma longitud

        // Mediante este bucle copiamos los elementos del array original al nuevo array "novalista"
        for (int i = 0; i < lonxitude; i++) {

            novalista[i] = numeros[i];

        }
        // Esto realiza un recorrido por cada numero de la array "novalista" y los imprime por pantalla
        for (int numero : novalista) {

            System.out.println(numero);

        }

    }
}





