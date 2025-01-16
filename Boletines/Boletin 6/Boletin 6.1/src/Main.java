import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num = entradaTeclado.nextInt();
        Eco("Eco", num);
        entradaTeclado.close();
    }

    static void Eco(String msg, int num) {
        System.out.println(msg);
        if (msg.length() <= num+1) {
            Eco(msg + "o", num);
        }
    }
}
