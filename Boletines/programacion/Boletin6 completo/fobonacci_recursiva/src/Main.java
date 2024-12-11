import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nveces;

        System.out.println("Introduce o número de veces que queres que se repita o código de Fibonacci:");
        nveces = sc.nextInt();

        for (int i = 0; i < nveces; i++) {
            long res = fibonacciRecursiva(i);
            System.out.println("Fibonacci(" + i + ") = " + res);
        }

        sc.close();
    }

    static long fibonacciRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2);
        }
    }
}
