

import java.util.ArrayList;

import java.util.List;


public class Main {
    static void main(String[] args) {

        String[] hab = {"Saltar", "Xray", "Correr", "Nadar", "Volar", "Esquivar"};

        Personaxe personaje = new Personaxe();

        personaje.setHabilidades(hab); // Establece las habilidades

        String[] habilidadesPersonaje = personaje.getHabilidades(); // Obtiene las habilidades


        // Imprime las habilidades

        System.out.println("Las  habilidades son: ");
        for (String habilidad : habilidadesPersonaje) {

            System.out.println(habilidad);

        }
        System.out.println("-------------------------------------");

        String[] equ = {"escudo", "lanza", "granada"};
        personaje.setequipamiento(equ); // Establece el equipamiento

        String[] equipamientoPersonaje = personaje.getEquipamento(); // Obtiene el equipamiento

        // Imprime el equipamiento

        System.out.println("El equipamiento es: ");


        for (String equipamiento : equipamientoPersonaje) {

            System.out.println(equipamiento);

        }

        System.out.println("-----------------------------");

        // Crear instancias de la clase Punto

        Punto p1 = new Punto(3); // Punto en (0, 0)

        Punto p2 = new Punto(5); // Punto en (5, 5)

        Punto p3 = new Punto(3.5); // Punto en (3.5, 4.5)

        Punto p4 = new Punto(2, 3); // Punto en (2.0, 3.0)


        // Imprimir las coordenadas de los puntos

        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");

        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Punto 3: (" + p3.getX() + ", " + p3.getY() + ")");

        System.out.println("Punto 4: (" + p4.getX() + ", " + p4.getY() + ")");


        // Modificar las coordenadas del Punto 1

        p1.setX(-1); // Intentar establecer un valor negativo

        p1.setY(2); // Establecer un valor positivo

        System.out.println("Punto 1 después de modificar: (" + p1.getX() + ", " + p1.getY() + ")");


        //Imprimir circulo

        Circulo circulo1 = new Circulo(3, 4, 5);

        System.out.println(circulo1);

        System.out.println("Diámetro: " + circulo1.calculoDiametro());

        System.out.println("Área: " + circulo1.calculoArea());

        System.out.println("Perímetro: " + circulo1.calculoPerimetro());

        //Imprimir cilindro

        Cilindro cilindro1 = new Cilindro(2, 6, 3, 6);

        System.out.println(cilindro1.toString());
        System.out.println("O volume do cilindro e " + cilindro1.calculoSuperficie());
        System.out.println("O area do cilindro e " + cilindro1.calculoArea());

        //Imprimir prisma

        Prisma prima1 = new Prisma(2, 7, 3, 3, 2);

        System.out.println(prima1.toString());

        System.out.println("O volume do prisma e " + prima1.calcularVolumen());


        // Llamamos a creacion de conta


        List<String> titulares = new ArrayList<>(); // Si no llamamos a la array de titulares antes de crear la cuenta no nos va a dejar llamarla por parametros


        // Realizamos el caso de la creacion de dos titulares ficticios


        titulares.add("Juan Pérez");


        titulares.add("Ana Gómez");


        // Aqui ya podremos realizar la creacion de la nueva cuenta


        Contacorrente cuenta = new Contacorrente(titulares, "12345678901234567890", "12345678A", 1000);


        // Mostrar información de la cuenta


        cuenta.mostrarInformacion();


        // Realizar un depósito


        cuenta.ingresarDinero(500);


        System.out.println("Después del depósito:"); // Se actualiza el valor automaticamente y se sobreescribe por lo cual procedemos a llamar a la informacion actual


        cuenta.mostrarInformacion();


        // Realizar un retiro


        cuenta.sacarDinero(200);


        System.out.println("Después del retiro:"); // Se actualiza el valor automaticamente y se sobreescribe por lo cual procedemos a llamar a la informacion actual


        cuenta.mostrarInformacion();


        // Intentar establecer un nuevo número de cuenta


        try {

            cuenta.setnConta("09876543210987654321");


            System.out.println("Número de cuenta actualizado: " + cuenta.getnConta());


        } catch (IllegalArgumentException e) { // En caso de que sea erroneo mostrara un argumento ilegal


            System.out.println(e.getMessage());


        }


        // Intentar establecer un nuevo número de cuenta no valido

        try {


            cuenta.setnConta("09876543210987ç'i4321");


            System.out.println("Número de cuenta actualizado: " + cuenta.getnConta());


        } catch (IllegalArgumentException e) { // Se quedara el numero de cuenta anterior anterior y lanzara error


            System.out.println(e.getMessage());


        }


        // Intentar establecer un nuevo NIF

        try {


            cuenta.setNif("12345678B"); // Este NIF es válido


            System.out.println("NIF actualizado: " + cuenta.getNif());


        } catch (IllegalArgumentException e) { // En caso de que sea erroneo mostrara un argumento ilegal


            System.out.println(e.getMessage());


        }


        // Intentar establecer un NIF no válido

        try {


            cuenta.setNif("1234567"); // Este NIF no es válido


            System.out.println("NIF actualizado: " + cuenta.getNif());


        } catch (IllegalArgumentException e) { // Se quedara el nif anterior y lanzara error


            System.out.println(e.getMessage());


        }

        Lista2 l = new Lista2(new Node(1, null));

        l.engadirPrimeiron(15);
        l.engadirUltimo(20);
        l.obterUltimo();
        l.obterPrimeiro();
        l.eliminarprimeiro();
        l.mostrarvalores();
    }

}



