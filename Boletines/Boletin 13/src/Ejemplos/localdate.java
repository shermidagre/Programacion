package Ejemplos;
import java.time.LocalDate;

public class localdate {
   public static void main(String[] args) {
            // Crear un array de LocalDate
            LocalDate[] fechas = new LocalDate[5];

            // Asignar valores al array
            fechas[0] = LocalDate.of(2023, 10, 1); // 1 de octubre de 2023
            fechas[1] = LocalDate.of(2023, 10, 15); // 15 de octubre de 2023
            fechas[2] = LocalDate.now(); // Fecha actual
            fechas[3] = LocalDate.parse("2023-12-25"); // Usando parse para una fecha en formato ISO
            fechas[4] = LocalDate.of(2024, 1, 1); // 1 de enero de 2024

            // Mostrar las fechas
            System.out.println("Fechas en el array:");
            for (LocalDate fecha : fechas) {
                System.out.println(fecha);
            }
        }
    }
