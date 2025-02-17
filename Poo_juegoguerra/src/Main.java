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

            Punto p1 = new Punto(); // Punto en (0, 0)

            Punto p2 = new Punto(5); // Punto en (5, 5)

            Punto p3 = new Punto(3.5, 4.5); // Punto en (3.5, 4.5)

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

            Cilindro cilindro1= new Cilindro(2,6,3,6);

            System.out.println(cilindro1.toString());
            System.out.println("O volume do cilindro e "+cilindro1.calcularVolumen());
            System.out.println("O area do cilindro e "+cilindro1.calculoArea());
        }

    }

