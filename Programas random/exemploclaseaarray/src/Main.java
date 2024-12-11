import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] numeros = {8, 13, 15, 29, 56, 57, 61};
        int[] numeros4 = {8, 13, 15, 29, 56, 57, 61};
        int indice = Arrays.binarySearch(numeros, 30);

        if (indice >= 0) {
            System.out.println("El número 30 se encuentra en la posición: " + indice);
        } else System.out.println("El número no esta en la tabla");

        int[] numeros2 = Arrays.copyOf(numeros, numeros.length);
        System.out.println(numeros2);
        int[] numeros3 = Arrays.copyOfRange(numeros, 0, 7);
        for (int n : numeros3)
            System.out.println(n);

System.out.println(compararmatrices(numeros4, numeros));
    }

    static boolean compararmatrices(int[] a, int[] b) {

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}