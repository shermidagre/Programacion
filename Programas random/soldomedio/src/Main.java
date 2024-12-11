package bnjb;

import java.util.Scanner;
 class soldotraballadores {
    public static void main(String[] args) {
        int soldo;
        int menosde1000=0;  int sueldomedio=0; int nsoldos=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el soldo del traballador(pon 0 para terminar la operacion): ");
        soldo = sc.nextInt();
        while (soldo!=0) {
            if (soldo < 0) System.out.println("no se permiten sueldos negativos");
            else {
                if (soldo < 1000) menosde1000++;
                if (soldo >= 1000 & soldo <= 1750) sueldomedio++;
                nsoldos++;
            }
            System.out.println("introduce el soldo del traballador(pon 0 para terminar la operacion): ");
            soldo = sc.nextInt();
        }
        int porcentaje= menosde1000*100/nsoldos;
        System.out.println("Hay " + sueldomedio + " trabajadores que cobran entre 1000 y 1750 y un " + porcentaje + "% que cobran menos de 1000.");
    }
}