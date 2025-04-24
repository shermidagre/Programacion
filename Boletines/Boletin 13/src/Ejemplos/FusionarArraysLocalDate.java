package Ejemplos;
import java.time.LocalDate;
import java.util.Arrays;

public class FusionarArraysLocalDate {
    public static void main(String[] args) {
        // Crear dos arrays de LocalDate
        LocalDate[] array1 = {
                LocalDate.of(2023, 10, 1),
                LocalDate.of(2023, 10, 15)
        };
        LocalDate[] array2 = {
                LocalDate.now(),
                LocalDate.of(2024, 1, 1)
        };

        // Fusionar los arrays
        LocalDate[] arrayFusionado = fusionarArrays(array1, array2);

        // Mostrar el resultado
        System.out.println("Array fusionado:");
        for (LocalDate fecha : arrayFusionado) {
            System.out.println(fecha);
        }
    }

    // Método genérico para fusionar arrays
    public static <T> T[] fusionarArrays(T[] array1, T[] array2) {
        @SuppressWarnings("unchecked")
        T[] resultado = (T[]) java.lang.reflect.Array.newInstance(
                array1.getClass().getComponentType(), array1.length + array2.length);

        System.arraycopy(array1, 0, resultado, 0, array1.length);
        System.arraycopy(array2, 0, resultado, array1.length, array2.length);

        return resultado;
    }
}