import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al cafeteria!)";
        System.out.println("Estos son los precios de nuestros productos");
        precios();
        System.out.println("Introduce el dinero ");
dinero();
       seleccionproducto();
       procesoazucar();
       colocacionvaso();

    }
static void dinero() {
        Scanner sc = new Scanner(System.in);
        int dinero = sc.nextInt();
        if (dinero >= 60) {
            System.out.println("Disfruta tu café!");
        }
}
    static void vuelta() {


        float vueltate = dinero() - 30F;
        System.out.println("La vuelta es de: " + vueltate + " euros");
        float vueltachocolate = dinero() -60f;
        float vueltacafe = dinero() - 50f;
    }
static  void menosazucar(){
       int azucar = 5;
        int decrementar--
}
    static void masazucar() {
        int azucar =5;
            int incrementar++
    }
static void nadaazucar() {
       int  azucar =0 ;
}
    static void procesoazcucar() {

        System.out.println("Si quieres menos azucar pulsa (3) si quieres mas azucar pulsa (2) si no quieres azucar pulsa (1)");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if (result==3)
            menosazucar();

        if (result == 2) {
            masazucar();
        }
        if (result == 1) {
            nadaazucar();
        }
    }
    static  void seleccionproducto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el producto cafe(1) chocolate(2) te(3)");
        int result = sc.nextInt();

        if (result == 1)
            procesoazcucar();
            vuelta();
        if (result == 2)
            procesoazcucar();
            vuelta();
        if (result == 3)
            procesoazcucar();
            vuelta();
    }
    static void colocacionvaso() {

    }
    static void precios() {
        System.out.println("Precio cafe: 50 centimos");
        System.out.println("Precio chocolate: 60 centimos");
        System.out.println("Precio te: 30 centimos");
    }
}

