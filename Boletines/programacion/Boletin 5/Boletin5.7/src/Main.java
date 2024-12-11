import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tamaño;
        System.out.println("dime el tamaño del triangulo: ");
        Scanner sc = new Scanner(System.in);
        tamaño = sc.nextInt();
        int espacios=tamaño-1;
        for (int i=0; i<tamaño;i++)
        {
            for (int k=espacios; k>0; k--) System.out.printf(" ");
            espacios--;
            for(int j=0; j<i; j++)
            {

                System.out.printf("* ");
            }

            System.out.println("* ");
        }
    }
}