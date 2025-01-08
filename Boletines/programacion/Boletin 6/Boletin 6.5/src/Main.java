package boletin6;

import java.util.Scanner;

public class diferenciaHoras {
    public static void main(String[] args) {
        System.out.println("dime 2 horas(incluidos los minutos) y te diré la diferencia: ");
        Scanner sc = new Scanner(System.in);
        int hora1 = sc.nextInt();
        int minuto1 = sc.nextInt();
        int hora2 = sc.nextInt();
        int minuto2 = sc.nextInt();
        sc.close();
        diferenciaMin (hora1,minuto1,hora2,minuto2);
        System.out.println("La diferencia entre las dos horas es: " + diferenciaMin (hora1,minuto1,hora2,minuto2) + " minutos.");
    }
    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){
        int diferencia= (hora1*60+minuto1)-(hora2*60+minuto2);
        if (diferencia<0) diferencia=-diferencia;
        return diferencia;
    }
}
