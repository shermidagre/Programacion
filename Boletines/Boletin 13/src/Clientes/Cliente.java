package  Clientes;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente> {
    String dni;
    String nome;
    LocalDate dataNacemento; //clase para trabajar con datas

    public Cliente(String dni, String nome, String dataNacemento){
        this.dni = dni;
        this.nome = nome;
        /*
        La clase DateTimeFormatter permite crear un formato de estructura para una data o fecha
        y utilizando el metodo ofPattern es como le damos un formato sencillo siguiendo cierto patrón(especificado en la documentación)
         */
        DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Proporciona un formato específico a la data que introduciremos
        /*
        El utilizar el metodo parse lo que hacemos es darle a la propiedad "dataNacemento" el formato creado anteriormente
         */
        this.dataNacemento = LocalDate.parse(dataNacemento,formatoDatas);//a la "dataNacemento" se le aplicará el forma creando anteriormente
    }//end constructor

    int edade(){
        return (int) dataNacemento.until(LocalDate.now(),ChronoUnit.YEARS);
    }
    /**
     * Compara dos clientes, si por ejemplo el cliente anteriormente creado tiene una edad mayor mostrará una cosa con respecto a si tiene la misma edad
     * o una edad menor.
     * En coso de que sea un dni el compareTo lo verificará de manera distinta
     * @param outro cliente nuevo con el que se comparará
     * @return
     */
    @Override
    public int compareTo(Cliente outro) {
        int res;
        if (edade() > outro.edade()) {
            res = 1;
        } else if (edade() < outro.edade()) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }

    public String toString() {
        DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dni + " " + nome + " " + dataNacemento.format(formatoDatas);
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345678A", "Juan Pérez", "15/05/1990");
        Cliente cliente2 = new Cliente("87654321B", "Ana López", "20/08/1985");

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("Comparacion de edades : " + cliente1.compareTo(cliente2)); // Salida: Comparación: -1

        // Obtener la fecha y hora actual en una zona horaria específica
        ZonedDateTime madrid = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

        // Formatear las fechas para que sean más legibles
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
        System.out.println("\nLugares con diferentes datas:");
        System.out.println("Madrid: " + madrid.format(formato));
        System.out.println("Nueva York: " + newYork.format(formato));

        // Obtener todas las zonas horarias disponibles
        //         ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }

}