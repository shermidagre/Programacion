package Boletin13;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        // Rellenamos la lista
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        System.out.println("Original: " + lista);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            int valor = it.next();
            if (valor == 5 || valor == 7) {
                it.remove(); // Eliminamos con el iterador
            }
        }

        System.out.println("Después de eliminar: " + lista);
    }
}
/*
package Boletin13;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {

    public static void main(String[] args) {
        // 1. Crear la lista original
        ArrayList<Integer> listaOriginal = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listaOriginal.add(i);
        }

        System.out.println("Lista original: " + listaOriginal);

        // 2. Eliminar los valores 5 y 7 usando Iterator
        ArrayList<Integer> listaFiltrada = new ArrayList<>(listaOriginal);
        Iterator<Integer> it = listaFiltrada.iterator();
        while (it.hasNext()) {
            int valor = it.next();
            if (valor == 5 || valor == 7) {
                it.remove();
            }
        }

        System.out.println("Después de eliminar: " + listaFiltrada);

        // 3. Guardar ambas listas en archivos
        guardarListaEnArchivo(listaOriginal, "original.txt");
        guardarListaEnArchivo(listaFiltrada, "filtrado.txt");

        // 4. Leer los archivos y mostrarlos por consola
        System.out.println("\n--- Leyendo archivos ---");
        System.out.println("Lista original desde archivo:");
        leerYMostrarArchivo("original.txt");

        System.out.println("\nLista filtrada desde archivo:");
        leerYMostrarArchivo("filtrado.txt");
    }

    /**
     * Guarda una lista de enteros en un archivo, línea por línea


public static void guardarListaEnArchivo(ArrayList<Integer> lista, String nombreArchivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        for (Integer num : lista) {
            writer.write(num.toString());
            writer.newLine();
        }
        System.out.println("✅ Archivo '" + nombreArchivo + "' guardado.");
    } catch (IOException e) {
        System.out.println("❌ Error al guardar el archivo: " + nombreArchivo);
    }
}

/**
 * Lee y muestra el contenido de un archivo línea a línea



public static void leerYMostrarArchivo(String nombreArchivo) {
    try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
    } catch (IOException e) {
        System.out.println("❌ Error al leer el archivo: " + nombreArchivo);
    }
}
}

  */