package boletin6;

import java.util.Scanner;

public class amigos {
    public static void main(String[] args) {
        System.out.println("dime 2 boletinIDK.numeros enteros positivos y te digo si son amigos: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        amigosdea (a);//calculamos los divisores de a.
        amigosdeb (b);//calculamos los divisores de b.
        if (amigosdea (a)==b||amigosdeb(b)==a)//si la suma de alguno de estos es igual al posible amigo, pues lo son.
            System.out.println(a+" y "+b+" son amigos.");
    }
    static int amigosdea(int n1){
        int amigos=0;
        for (int i=1; i<n1; i++)//vamos viendo si cada uno de sus boletinIDK.numeros menores hasta 0 son divisores
        {
            if (n1%i==0) amigos=amigos+i;//los vamos sumando
        }
        return amigos;
    }
    static int amigosdeb(int n2){
        int amigos=0;
        for (int i=1; i<n2; i++)//aquihacemos lo mismo, sque el codigo de mi codigo de boletinIDK.numeros boletinIDK.primos
        {
            if (n2%i==0) amigos=amigos+i;
        }
        return amigos;
    }
}