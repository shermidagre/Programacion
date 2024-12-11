import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
System.out.println("Este programa busca un numero en una lista de numeros aleatorios");
Scanner SC = new Scanner(System.in);
System.out.println("Introduce el numero que quieres comprar si esta en la lista ");
int num = SC.nextInt();

        int[] numerosrandom = new int[14];
        numerosrandom[0] = 30;
        numerosrandom[1] = 16;
        numerosrandom[2] = 45;
        numerosrandom[3] = 30;
        numerosrandom[4] = 65;
        numerosrandom[5] = 9;
        numerosrandom[6] = 44;
        numerosrandom[7] = 67;
        numerosrandom[8] = 89;
        numerosrandom[9] = 21;
        numerosrandom[10] = 11;
        numerosrandom[11] = 53;
        numerosrandom[12] = 45;
        numerosrandom[13] = 23;

for (int i =0; i < numerosrandom.length; i++) {
    if (numerosrandom[i] == num) {
        System.out.println("El numero " + num + " esta en la lista y su posicion es: " + (i));
        break;
    }
    else if (i == numerosrandom.length - 1) {
        System.out.println("-1");

    }
}


    }
}
