import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce 10 numeros enteiro");



        int cero,positivos,negativos;
        cero=0;
        positivos=0;
        negativos=0;

        for(int i=0; i<10; i++) {
            int numero = entradaTeclado.nextInt();

            if
            (numero == 0) ;
            {
                cero++;

            }if
            (numero > 1) ;
            {
                positivos++;

            }if
            (numero < -1);
            {
                negativos++;

            }
        }
        System.out.println("A cantidade de ceros e"+cero+"a cantidade de positivos e"+positivos+" a cantidade de negativos e"+negativos);

        entradaTeclado.close();

    }
}