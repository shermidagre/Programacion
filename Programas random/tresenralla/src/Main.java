import java.util.Scanner;
public class Main {
    //Con esete programa pretenderemos realizaar un juego de tres en ralla
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Empezaremos realizando una array multidimensional de 3x3 para nuestro juego tres en ralla
        int num;
        int xogador1;//Asignacion 1 xogador
        int xogador2;//Asignacion 2 xogador
        int contador = 0; //Contador para verificar si se ha ganado o empatado


        System.out.println("Primero xogador introuce o numero 1 ou 0");
        xogador1 = sc.nextInt();
        if (xogador1<=1){
            System.out.println("Numero valido");
            //meteremos a funcion
        }
        else{
            System.out.println("Numero invalido");
            return;
        }
        System.out.println("Segundo xogador introuce o numero 1 ou 0");
        xogador2 = sc.nextInt();
        if (xogador2<=1){
            System.out.println("Numero valido");
            //meteremos a la funcion
        }
        else{
            System.out.println("Numero invalido");
            return;
        }


        int [][]tablero = {{0,0,0,},
        {0,0,0,},
        {0,0,0},
        {0,0,0}};

        }
        int asignacionalaarray(){

        }

    }


