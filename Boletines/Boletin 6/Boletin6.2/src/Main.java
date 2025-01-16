import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        n1 = entradaTeclado.nextInt();
        System.out.println("Introduce el segundo número:");
        n2 = entradaTeclado.nextInt();

        comprendidos(n1, n2);


        entradaTeclado.close();
    }

    static void comprendidos(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
}
