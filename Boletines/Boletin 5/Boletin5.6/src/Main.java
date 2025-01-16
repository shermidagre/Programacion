
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero;
        int factorial=1;
        System.out.println("mete el numero del que quieras saber su Factorial: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        for (int i=1; i<=numero; i++)
        {
            factorial=factorial*i;
        }
        System.out.println("o Factorial do numero " + numero + " es de: " + factorial + ".");
    }
}