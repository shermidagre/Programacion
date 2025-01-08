import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Especificame si quieres saber el area(1) o el volumen(2)");
        int result = entradaTeclado.nextInt();
        System.out.println("dime el lado: ");
        int lado = entradaTeclado.nextInt();
        entradaTeclado.close();
        if (result==1)
            volumen(lado);
        if (result==2)
            area(lado);
        if (result!=2&&result!=1)
            System.out.println("elegiste ninguno de los 2");

        }
    static void volumen (int lado){
        int volumen=lado*lado*lado;
        System.out.println("el volumen del cubo es de: "+volumen);
    }
    static void area (int lado){
        int area=lado*lado;
        System.out.println("el area del cubo es de: "+area);
    }

}
