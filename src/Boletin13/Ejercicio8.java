package Boletin13;

import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> conjunto2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> interseccion = intersectar(conjunto1, conjunto2);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Intersección: " + interseccion);
    }

    // Método para encontrar la intersección
    public static Set<Integer> intersectar(Set<Integer> c1, Set<Integer> c2) {
        Set<Integer> resultado = new HashSet<>();

        for (Integer num : c1) {
            if (c2.contains(num)) {
                resultado.add(num); // Si está en ambos, lo añadimos
            }
        }

        return resultado;
    }
}