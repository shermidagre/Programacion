import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEjemplo {
    public static void main(String[] args) {
        // Crear un mapa para almacenar nombres de alumnos y sus notas
        Map<String, Integer> mapaNotas = new HashMap<>();

        // Crear un objeto Scanner para recibir entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Variable para controlar la entrada de alumnos
        String nombre;
        int nota;

        // Bucle para ingresar varios alumnos
        while (true) {
            System.out.print("Introduce el nombre del alumno (o escribe 'salir' para terminar): ");
            nombre = sc.nextLine();

            // Si el nombre es "salir", terminamos el bucle
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            // Pedir la nota del alumno
            System.out.print("Introduce la nota de " + nombre + ": ");
            nota = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer de entrada

            // Insertar el nombre y la nota en el mapa
            mapaNotas.put(nombre, nota);
        }

        // Mostrar el mapa completo de alumnos y sus notas
        System.out.println("\nLista completa de alumnos y sus notas:");
        for (Map.Entry<String, Integer> entry : mapaNotas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Consultar la nota de un alumno específico
        System.out.print("\nIntroduce el nombre de un alumno para consultar su nota: ");
        String nombreConsulta = sc.nextLine();

        if (mapaNotas.containsKey(nombreConsulta)) {
            // Si el nombre existe, mostramos la nota
            System.out.println("La nota de " + nombreConsulta + " es: " + mapaNotas.get(nombreConsulta));
        } else {
            // Si el nombre no existe en el mapa
            System.out.println("El alumno no está registrado.");
        }

        // Cerrar el Scanner
        sc.close();
    }
}