package Boletin13;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        // Añadimos algunos números
        for (int i = 1; i <= 10; i++) {
            lista.add(i); // Del 1 al 10
        }

        System.out.println("Original: " + lista);

        // Creamos una nueva lista sin 5 ni 7
        ArrayList<Integer> nuevaLista = new ArrayList<>();

        for (Integer num : lista) {
            if (num != 5 && num != 7) {
                nuevaLista.add(num);
            }
        }

        System.out.println("Sin 5 ni 7: " + nuevaLista);
    }
}