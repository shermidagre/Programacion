

import java.util.Scanner;
class Boletin5_8 {
    public static void main(String[] args) {
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        int suma = 0;
        int num;
        for (int i=0; i<10; i++){

            System.out.println("Si quieres salir introduce el numero 999");
            num=entradaTeclado.nextInt();
            if (num==999)
                break;
            suma = suma+num;

        }
        System.out.println(suma);
    }
}