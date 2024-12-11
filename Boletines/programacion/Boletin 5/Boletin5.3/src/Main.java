import java.util.Scanner;


class Scratch {
    public static void main(String[] args) {
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        int base;
        int altura;
        int area;

        System.out.println("Introduce a altura do rectangulo");
        altura = entradaTeclado.nextInt();
        while
        (altura <= 0){
            System.out.println("Introduce un valor positivo");
            altura = entradaTeclado.nextInt();
        }

        System.out.println("Introduce a base do rectangulo");
        base = entradaTeclado.nextInt();

        while
        (base <=0){
            System.out.println("Introduce un valor positivo");
            base = entradaTeclado.nextInt();

        }

        area = base * altura;
        System.out.println("A area e" + area);
    }

}
