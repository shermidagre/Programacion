package Boletin13;

import java.io.*;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File archivo = new File("productos.dat");
        Map<String, Integer> inventario = cargarInventario(archivo);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Dar de alta producto");
            System.out.println("2. Dar de baja producto");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Visualizar productos");
            System.out.println("5. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.next();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    inventario.put(codigo, cantidad);
                    System.out.println("Producto agregado.");
                    break;

                case 2:
                    System.out.print("Código a eliminar: ");
                    String codDel = sc.next();
                    if (inventario.containsKey(codDel)) {
                        inventario.remove(codDel);
                        System.out.println("Eliminado.");
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 3:
                    System.out.print("Código a actualizar: ");
                    String codAct = sc.next();
                    if (inventario.containsKey(codAct)) {
                        System.out.print("Nueva cantidad: ");
                        int nueva = sc.nextInt();
                        inventario.put(codAct, nueva);
                        System.out.println("Actualizado.");
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 4:
                    System.out.println("Inventario:");
                    for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;

                case 5:
                    guardarInventario(inventario, archivo);
                    System.out.println("Datos guardados. Adiós.");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Cargar datos del archivo si existe
    public static Map<String, Integer> cargarInventario(File archivo) {
        if (!archivo.exists()) return new HashMap<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
            @SuppressWarnings("unchecked")
            Map<String, Integer> mapa = (Map<String, Integer>) ois.readObject();
            ois.close();
            return mapa;
        } catch (Exception e) {
            System.out.println("Error al leer archivo.");
            return new HashMap<>();
        }
    }

    // Guardar datos al salir
    public static void guardarInventario(Map<String, Integer> inventario, File archivo) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(inventario);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }
}