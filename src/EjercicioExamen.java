import java.io.*;
import java.util.*;

public class EjercicioExamen {
    public static void main(String[] args) {
        // Colección para almacenar nombre y nota de los alumnos
        Map<String, Double> calificaciones = new HashMap<>();

        // Ruta del archivo
        File archivo = new File("calificaciones.txt");

        // Si el archivo no existe, lo creamos con datos iniciales
        if (!archivo.exists()) {
            try {
                archivo.createNewFile(); // Creamos el archivo vacío

                // Usamos FileOutputStream + BufferedWriter para escribir
                FileOutputStream fos = new FileOutputStream(archivo);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter escritor = new BufferedWriter(osw);

                // Datos iniciales
                escritor.write("Ana,8.5");
                escritor.newLine();
                escritor.write("Luis,4.2");
                escritor.newLine();
                escritor.write("María,7.0");
                escritor.newLine();
                escritor.write("Carlos,3.8");
                escritor.newLine();

                escritor.close();

                System.out.println("Archivo creado con datos iniciales.\n");

            } catch (IOException e) {
                System.out.println("Error al crear el archivo.");
                return;
            }
        }

        // Leer el archivo con FileInputStream + BufferedReader
        try (
                FileInputStream fis = new FileInputStream(archivo);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader lector = new BufferedReader(isr)
        ) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");

                if (partes.length == 2) {
                    String nombre = partes[0];
                    double nota = Double.parseDouble(partes[1]);

                    calificaciones.put(nombre, nota);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
            return;
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato incorrecto en alguna línea del archivo.");
            return;
        }

        // Mostrar cantidad de alumnos
        int totalAlumnos = calificaciones.size();
        System.out.println("Total de alumnos: " + totalAlumnos);

        // Calcular nota media
        double sumaNotas = 0;
        for (double nota : calificaciones.values()) {
            sumaNotas += nota;
        }

        double notaMedia = totalAlumnos > 0 ? sumaNotas / totalAlumnos : 0;
        System.out.printf("Nota media del grupo: %.2f%n", notaMedia);

        // Mostrar alumnos suspensos
        System.out.println("Alumnos suspensos:");
        boolean haySuspensos = false;

        for (Map.Entry<String, Double> entry : calificaciones.entrySet()) {
            if (entry.getValue() < 5.0) {
                System.out.println("- " + entry.getKey());
                haySuspensos = true;
            }
        }

        if (!haySuspensos) {
            System.out.println("No hay ningún alumno suspenso.");
        }
    }


    public static void leerArchivo() {

        try (BufferedReader br = new BufferedReader(new FileReader("datos.dat"))) {

            // System.out.println(br.readLine());
            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);

                linea = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void escribir() {

        try (BufferedWriter bw = new BufferedWriter( new FileWriter("datos.dat", true))) {
            bw.append("hola");

            bw.newLine();
            bw.append("hola");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}