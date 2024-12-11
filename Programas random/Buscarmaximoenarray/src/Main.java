//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al aprograma que busca el numero mas grande en una array");
        int[] numeros = new int[5];
        int numMax = 0; // Inicializamos numMax con el primer número de la array
        i=0; // Inicializamos i con 0
        numeros[0] = 10;
        numeros[1] = 30;
        numeros[2] = 15;
        numeros[3] = 27;
        numeros[4] = 36;
if (numeros[i] > numMax) { // Si el número actual es mayor que numMax, actualizamos numMax a ese número.}
                numMax = numeros[i];
do {
    i++
}
//Mediante este bucle buscaremos el numero mayor en la array
        while(i < 5);{
             System.out.println("El numero mas grande es: " + numMax);
            }
        }

    }
}