
/**
 *
 */
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner entradaTeclado = new Scanner(System.in);
       System.out.println("Introduce o numero do cal queiras realizar seu factorial");
       int factorial = entradaTeclado.nextInt();
       factorialRecursiva(factorial);
       System.out.println("O factorial e : " + factorialRecursiva(factorial));
       System.out.println("Ahora vamos a calcular o elevado dun numero");
       System.out.println("Introduce el numero que quieras elevar");
       int numero = entradaTeclado.nextInt();
       System.out.println("Introduce el numero elevado");
       int elevado = entradaTeclado.nextInt();
       entradaTeclado.close();
       mElevadoN(numero,elevado);
       System.out.println("O elevado de este numero e : " + mElevadoN(numero,elevado));
        }


    static long factorialRecursiva(int factorial){

        long res;
        if (factorial==0)
            res = 1;
        else
            res= factorial * factorialRecursiva(factorial-1);
        return res;
    }

static long mElevadoN (int numero, int elevado){

       long res;
       if (elevado==0)
           res=1;
       else res = numero * mElevadoN(numero, elevado-1);
       return res;

}
}