package EjemploConProductos;
import java.io.*;
import java.util.*;

public class GestionProductosColecciones {
    private List<Producto> listaProductos;  // Ordenada por inserción
    private Set<Producto> conjuntoUnicos;   // Sin duplicados
    private Set<Producto> conjuntoOrdenado; // Orden alfabético
    private File archivo = new File("productos.txt");

    public GestionProductosColecciones() {
        listaProductos = new ArrayList<>();
        conjuntoUnicos = new HashSet<>();
        conjuntoOrdenado = new TreeSet<>(Comparator.comparing(p -> p.nombre));
    }

    // Cargar datos del archivo si existe
    public void cargarDesdeArchivo() {
        if (!archivo.exists()) return;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String nombre = partes[0];
                    double precio = Double.parseDouble(partes[1]);
                    Producto p = new Producto(nombre, precio);
                    añadirProductoDirecto(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    // Guardar todos los productos en archivo
    public void guardarEnArchivo() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
            for (Producto p : conjuntoUnicos) {
                escritor.write(p.toString());
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }

    // Añadir producto a todas las colecciones
    public void añadirProducto(String nombre, double precio) {
        Producto nuevo = new Producto(nombre, precio);
        añadirProductoDirecto(nuevo);
        System.out.println("Producto '" + nombre + "' añadido.");
    }

    private void añadirProductoDirecto(Producto p) {
        listaProductos.add(p);
        conjuntoUnicos.add(p);
        conjuntoOrdenado.add(p);
    }

    // Buscar producto por nombre
    public Producto buscarProducto(String nombre) {
        for (Producto p : conjuntoUnicos) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    // Eliminar producto por nombre
    public boolean eliminarProducto(String nombre) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            listaProductos.remove(p);
            conjuntoUnicos.remove(p);
            conjuntoOrdenado.remove(p);
            return true;
        }
        return false;
    }

    // Actualizar precio de un producto
    public boolean actualizarPrecio(String nombre, double nuevoPrecio) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            p.precio = nuevoPrecio;
            return true;
        }
        return false;
    }

    // Mostrar lista completa
    public void mostrarLista() {
        System.out.println("\n=== Lista (ArrayList) ===");
        for (Producto p : listaProductos) {
            System.out.println(p.mostrarBonito());
        }
    }

    // Mostrar únicos
    public void mostrarConjuntoUnicos() {
        System.out.println("\n=== Conjunto único (HashSet) ===");
        for (Producto p : conjuntoUnicos) {
            System.out.println(p.mostrarBonito());
        }
    }

    // Mostrar ordenados
    public void mostrarOrdenados() {
        System.out.println("\n=== Ordenados alfabéticamente (TreeSet) ===");
        for (Producto p : conjuntoOrdenado) {
            System.out.println(p.mostrarBonito());
        }
    }

    // Menú principal
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- GESTIÓN DE PRODUCTOS ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Ver lista completa");
            System.out.println("3. Ver productos únicos");
            System.out.println("4. Ver productos ordenados");
            System.out.println("5. Buscar producto");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Actualizar precio");
            System.out.println("8. Guardar datos");
            System.out.println("9. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    añadirProducto(nombre, precio);
                    break;

                case 2:
                    mostrarLista();
                    break;

                case 3:
                    mostrarConjuntoUnicos();
                    break;

                case 4:
                    mostrarOrdenados();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    Producto encontrado = buscarProducto(buscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado.mostrarBonito());
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (eliminarProducto(eliminar)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Nombre del producto: ");
                    String prod = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    if (actualizarPrecio(prod, nuevoPrecio)) {
                        System.out.println("Precio actualizado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 8:
                    guardarEnArchivo();
                    System.out.println("Datos guardados.");
                    break;

                case 9:
                    guardarEnArchivo();
                    System.out.println("Adiós.");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método main
    public static void main(String[] args) {
        GestionProductosColecciones app = new GestionProductosColecciones();
        app.cargarDesdeArchivo();

        // Datos iniciales de ejemplo
        app.añadirProducto("Manzanas", 1.50);
        app.añadirProducto("Leche", 1.20);
        app.añadirProducto("Pan", 0.80);

        // Mostrar menú interactivo
        app.mostrarMenu();
    }
}