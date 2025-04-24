package Ejemplos;
import java.time.LocalDate;
public class SumarDiasEnLocalDate {
        public static void main(String[] args) {
            // Crear un array de LocalDate
            LocalDate[] fechas = {
                    LocalDate.of(2023, 10, 1),
                    LocalDate.of(2023, 10, 15),
                    LocalDate.now()
            };

            // Sumar 7 días a cada fecha
            System.out.println("Fechas originales:");
            for (int i = 0; i < fechas.length; i++) {
                System.out.println(fechas[i]);
                fechas[i] = fechas[i].plusDays(7); // Sumar 7 días
            }

            // Mostrar las fechas modificadas
            System.out.println("\nFechas después de sumar 7 días:");
            for (LocalDate fecha : fechas) {
                System.out.println(fecha);
            }
        }
    }

