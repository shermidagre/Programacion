package Boletin13;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> conjunto2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> union = unir(conjunto1, conjunto2);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Unión: " + union);
    }

    // Método para unir dos conjuntos
    public static Set<Integer> unir(Set<Integer> c1, Set<Integer> c2) {
        Set<Integer> resultado = new HashSet<>(c1); // Copia del primero

        for (Integer num : c2) {
            resultado.add(num); // Añadimos los del segundo
        }

        return resultado;
    }
}