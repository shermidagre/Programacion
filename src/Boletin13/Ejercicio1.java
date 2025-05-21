package Boletin13;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Crear un nuevo array del tamaño correcto
        int[] resultado = new int[array1.length + array2.length];

        // Copiar el primer array
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i];
        }

        // Copiar el segundo array después del primero
        for (int i = 0; i < array2.length; i++) {
            resultado[array1.length + i] = array2[i];
        }

        // Mostrar el resultado
        System.out.print("Resultado: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}