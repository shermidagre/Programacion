package Boletin13;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Lista original con posibles duplicados
        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 10);

        System.out.println("Lista original: " + lista);

        // Para contar cuántas veces aparece cada número
        Map<Integer, Integer> contador = new HashMap<>();

        for (int num : lista) {
            if (contador.containsKey(num)) {
                contador.put(num, contador.get(num) + 1);
            } else {
                contador.put(num, 1);
            }
        }

        // Conjuntos para resultados
        Set<Integer> sinRepetir = new HashSet<>();
        Set<Integer> soloUnaVez = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            int clave = entry.getKey();
            int valor = entry.getValue();

            sinRepetir.add(clave); // Todos los elementos sin repetir

            if (valor == 1) {
                soloUnaVez.add(clave); // Solo aparece una vez
            } else {
                repetidos.add(clave); // Se repite más de una vez
            }
        }

        // Mostrar resultados
        System.out.println("Sin repetir: " + sinRepetir);
        System.out.println("Repetidos: " + repetidos);
        System.out.println("Solo una vez: " + soloUnaVez);
    }
}