package boletin6;

import java.util.Scanner;

public class segundos {
    public static void main(String[] args) {
        System.out.println("dime un numerod e dias, horas y minutos respectivamente y te dire cuantos segundos son: ");
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        sc.close();
        tiempoaSegundos(dias,horas,minutos);}
    static void tiempoaSegundos(int dias,int horas,int minutos){
        int segundos=((dias*24+horas)*60+minutos)*60;
        System.out.println("la cantidad de segundos es de: "+segundos);
    }


}