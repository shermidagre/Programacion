import java.io.*;
import java.util.*;

public class ContarPalabras {
    public static void main(String[] args) {
        File archivo = new File("texto.txt");
        Map<String, Integer> contador = new TreeMap<>(); // TreeMap ordena automáticamente

        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine().toLowerCase();
                String[] palabras = linea.split("\\s+"); // Separar por cualquier espacio

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
            return;
        }

        // Mostrar resultado
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}