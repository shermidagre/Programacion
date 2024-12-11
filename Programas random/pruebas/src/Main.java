import java.util.Scanner;

public class Main {
    static float dinero = 0;  // Hacer la variable 'dinero' accesible a todos los métodos
    static int azucar = 5;  // Hacer la variable 'azucar' accesible a todos los métodos
    static float precio = 0; // Hacer la variable 'precio' accesible a todos los metodos
    static int vasos = 1;  // Hacer la variable 'vasos' accesible a todos los métodos

    public static void main(String[] args) {
        System.out.println("¡Bienvenido a la cafetería!");
        System.out.println("Estos son los precios de nuestros productos:");
        precios();
        System.out.println("Introduce el dinero:");
        dinero();
        seleccionproducto();
        procesoazucar();
        colocacionvaso();
        vuelta();  // Se llama al método 'vuelta' pasando el precio del producto café
    }

    static void dinero() {
        Scanner sc = new Scanner(System.in);
        dinero = sc.nextInt();
        if (dinero >= 30F) {
            System.out.println("Seleccion de productos");
        } else {
            System.out.println("Dinero insuficiente!");
            dinero = sc.nextFloat();
        }
    }

    static void vuelta() {
        float vuelta = dinero - precio;
        System.out.println("La vuelta es de: " + vuelta + " euros");
    }

    static void menosazucar() {
        azucar--;
        System.out.println("Azúcar reducido a: " + azucar);
    }

    static void masazucar() {
        azucar++;
        System.out.println("Azúcar incrementado a: " + azucar);
    }

    static void nadaazucar() {
        azucar = 0;
        System.out.println("Sin azúcar.");
    }

    static void procesoazucar() {
        System.out.println("Si quieres menos azúcar pulsa (3), si quieres más azúcar pulsa (2), si no mas quieres azúcar pulsa (1), para continuar pulsa 0");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if (result == 3) {
            menosazucar();
        } else if (result == 2) {
            masazucar();
        } else if (result == 1) {
            nadaazucar();
        } else if (result == 0) {
        } else {
            System.out.println("Opción no válida.");
        }
    }


    static void seleccionproducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estas a punto de cambiar de opinion, Selecciona el producto: café (1), chocolate (2), té (3)");
        int result = sc.nextInt();

        if (result == 1) {
            procesoazucar();
            precio = 50f;
        } else if (result == 2) {
            procesoazucar();
            precio = 60f;
        } else if (result == 3) {
            procesoazucar();
            precio = 30f;
        } else {
            System.out.println("Producto no válido.");
        }
    }

    static void colocacionvaso() {

        System.out.println("Colocando el vaso...");
    }

    static void precios() {
        System.out.println("Precio café: 50 céntimos");
        System.out.println("Precio chocolate: 60 céntimos");
        System.out.println("Precio té: 30 céntimos");
    }
}

