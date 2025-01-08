package boletin6;

import java.util.Scanner;

public class recursivaMCD {
    public static void main(String[] args) {
        System.out.println("dime 2 boletinIDK.numeros y te indico su maximo comun divisor: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("el resultado es: " + mcd(n1, n2));
        mcd(n1, n2);
    }
    /*
    estamos utilizando el algoritmo de euclides, donde vamos dividiendo el numero mayor con el menor y anotando el resto, luego
    el numero menor se convertira en nuestro numero mayor y el resto en nuestro menor, seguiremos así hasta que el resto sea 0
     */
    static int mcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return mcd(n2, n1 % n2);
    }
}
