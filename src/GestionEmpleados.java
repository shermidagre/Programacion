import java.io.*;
import java.util.*;

public class GestionEmpleados {
    public static void main(String[] args) {
        File archivo = new File("empleados.dat");
        List<Empleado> empleados = cargarDatos(archivo);

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Salario: ");
                    double salario = sc.nextDouble();

                    empleados.add(new Empleado(nombre, salario));
                    break;

                case 2:
                    System.out.println("\nLista de empleados:");
                    for (Empleado e : empleados) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    guardarDatos(empleados, archivo);
                    System.out.println("Datos guardados. Adiós.");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método para cargar datos desde archivo
    private static List<Empleado> cargarDatos(File archivo) {
        if (!archivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Empleado>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No se pudieron cargar los datos.");
            return new ArrayList<>();
        }
    }

    // Método para guardar datos al salir
    private static void guardarDatos(List<Empleado> empleados, File archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }
}

// Clase Empleado serializable
class Empleado implements Serializable {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre + " - $" + salario;
    }
}