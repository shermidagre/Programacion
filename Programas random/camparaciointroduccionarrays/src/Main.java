import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int eleccion;
    int [] listanumeros ={1,3,7,19,80,150};
    int indice = Arrays.binarySearch(listanumeros, 20);
    if (indice>=0) {
        System.out.println("El número se encuentra en la posición " + indice);
    }
    else {
        System.out.println("El número no se encuentra en la lista");
        System.out.println("¿Quieres añadir el numero a la lista? Si(1) No(0)");
        eleccion = sc.nextInt();
    }
    if (eleccion==1){


    }
    }

}