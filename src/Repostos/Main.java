package Repostos;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Cargar datos del archivo si existe
        Map<String, Repostos> repostos = cargarArquivo();

        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n--- GESTIÓN DE REPOSTOS ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Elige opción: ");

            int opcion = 0;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Opción inválida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    String codAnhadir = sc.nextLine().trim();
                    if (codAnhadir.isEmpty()) {
                        System.out.println("❌ El código no puede estar vacío.");
                        break;
                    }
                    if (repostos.containsKey(codAnhadir)) {
                        System.out.println("❌ Ya existe un producto con ese código.");
                        break;
                    }

                    System.out.print("Nombre: ");
                    String nome = sc.nextLine().trim();
                    if (nome.isEmpty()) {
                        System.out.println("❌ El nombre no puede estar vacío.");
                        break;
                    }

                    System.out.print("Cantidad: ");
                    String cantidadeStr = sc.nextLine().trim();
                    int cantidade;
                    try {
                        cantidade = Integer.parseInt(cantidadeStr);
                        if (cantidade < 0) {
                            System.out.println("❌ La cantidad no puede ser negativa.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ La cantidad debe ser un número válido.");
                        break;
                    }

                    engadirReposto(repostos, codAnhadir, nome, cantidade);
                    break;

                case 2:
                    System.out.print("Código a eliminar: ");
                    String codEliminar = sc.nextLine().trim();
                    eliminarReposto(repostos, codEliminar);
                    break;

                case 3:
                    System.out.print("Código a modificar: ");
                    String codModificar = sc.nextLine().trim();
                    System.out.print("Nueva cantidad: ");
                    String nuevaCantidadeStr = sc.nextLine().trim();
                    int nuevaCantidade;
                    try {
                        nuevaCantidade = Integer.parseInt(nuevaCantidadeStr);
                        if (nuevaCantidade < 0) {
                            System.out.println("❌ La cantidad no puede ser negativa.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ La cantidad debe ser un número válido.");
                        break;
                    }
                    modificaCantidade(repostos, codModificar, nuevaCantidade);
                    break;

                case 4:
                    visualizar(repostos);
                    break;

                case 5:
                    escribirArquivo(repostos);
                    System.out.println("💾 Datos guardados. Adiós.");
                    sair = true;
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }
        }
    }

    /**
     * Carga los datos desde el archivo "datos.dat"
     */
    public static Map<String, Repostos> cargarArquivo() {
        Map<String, Repostos> r = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("datos.dat"))) {
            String linha = br.readLine();

            while (linha != null) {
                String[] pedazos = linha.split(";");
                if (pedazos.length == 3) {
                    String cod = pedazos[0];
                    String nome = pedazos[1];

                    try {
                        int cantidade = Integer.parseInt(pedazos[2]);
                        r.put(cod, new Repostos(nome, cantidade));
                    } catch (NumberFormatException e) {
                        System.out.println("Error al parsear cantidad en línea: " + linha);
                    }
                } else {
                    System.out.println("Línea ignorada (formato incorrecto): " + linha);
                }
                linha = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Se creará uno nuevo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        return r;
    }

    /**
     * Guarda los datos actuales en el archivo "datos.dat"
     */
    public static void escribirArquivo(Map<String, Repostos> repostos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos.dat"))) {
            for (Map.Entry<String, Repostos> entry : repostos.entrySet()) {
                String linha = entry.getKey() + ";" +
                        entry.getValue().getNome() + ";" +
                        entry.getValue().getCantidade();

                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }

    /**
     * Añade un nuevo repostaje si el código no existe ya
     */
    public static void engadirReposto(Map<String, Repostos> lista,
                                      String codigo,
                                      String nome,
                                      int cantidade) {
        if (lista.containsKey(codigo)) {
            System.out.println("❌ Error: Ya existe un producto con el código " + codigo);
        } else {
            lista.put(codigo, new Repostos(nome, cantidade));
            System.out.println("✅ Producto '" + nome + "' añadido con código " + codigo);
        }
    }

    /**
     * Elimina un repostaje por código
     */
    public static void eliminarReposto(Map<String, Repostos> lista,
                                       String codigo) {
        if (lista.containsKey(codigo)) {
            lista.remove(codigo);
            System.out.println("🗑️ Producto con código " + codigo + " eliminado.");
        } else {
            System.out.println("❌ No se encontró ningún producto con el código " + codigo);
        }
    }

    /**
     * Modifica la cantidad de un producto existente
     */
    public static void modificaCantidade(Map<String, Repostos> lista,
                                         String codigo,
                                         int cantidadeNova) {
        if (lista.containsKey(codigo)) {
            lista.get(codigo).setCantidade(cantidadeNova);
            System.out.println("✏️ Cantidad actualizada para el producto " + codigo + ": " + cantidadeNova);
        } else {
            System.out.println("❌ No se encontró ningún producto con el código " + codigo);
        }
    }

    /**
     * Muestra todos los productos por consola
     */
    public static void visualizar(Map<String, Repostos> lista) {
        System.out.println("\n--- Lista de repostos ---");
        System.out.printf("%-10s | %-20s | %s\n", "Codigo", "Nombre", "Cantidad");

        if (lista.isEmpty()) {
            System.out.println("❌ No hay productos registrados.");
        } else {
            for (Map.Entry<String, Repostos> entry : lista.entrySet()) {
                System.out.printf("%-10s | %-20s | %d\n",
                        entry.getKey(),
                        entry.getValue().getNome(),
                        entry.getValue().getCantidade());
            }
        }
    }
}