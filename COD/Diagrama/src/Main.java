
public class Main {
    public static void main(String[] args) {

        int n1 = 0;
        System.out.println(n1);
        int n2 = 1;
        System.out.println(n2);
        int ns ;

        int nveces = 2;

        for (int i = 0; i < nveces; i++) {

            ns = fibonacci(n1, n2);
            n1 = n2;
            n2 = ns;

        }
        recursiva("Hola");
    }
static void recursiva(String msg){
    System.out.println(msg);
   if(msg.length()<5) recursiva(msg+".");
        }

    /**
     * Fibonacci,suma dos numeros
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma
     */

static int fibonacci(int a, int b){

    int suma = a+b;

    System.out.println(suma);

    return suma;

        }
    }
