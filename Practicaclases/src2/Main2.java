
Interfaz IVehiculo

Define los métodos que deben implementar todos los vehículos.

java

interface IVehiculo {

    String obtenerPropiedades();

    double masaMaximaAutorizada();

}

Clase Abstracta Vehiculo

Contiene propiedades comunes y un método de validación.

java

abstract class Vehiculo implements IVehiculo {

    String numeroFlota;

    String matricula;

    double potencia;

    double co2Emitido;

    double peso;

    double pma; // Peso Máximo Autorizado

    int numeroEjes;

    boolean ganchoRemolque;


    protected void validarDatos() {

        if (pma <= 0 || peso < 0) {

            throw new IllegalArgumentException("PMA y peso deben ser positivos.");

        }

    }


    // Método para verificar el formato del número de flota

    public boolean verificarFormatoNumeroFlota(String numeroFlota) {

        // Expresión regular para el formato ttNNNaaaae

        String regex = "^(fr|tr|cm|tm)\\d{3}[a-zA-Z]{4}[a-zA-Z]$";

        return numeroFlota.matches(regex);

    }

}

 Clase Furgoneta

Hereda de Vehiculo y añade propiedades específicas.

java

class Furgoneta extends Vehiculo {

    String tipo; // cerrada o abierta

    double capacidadCarga; // en m³


    @Override

    public String obtenerPropiedades() {

        return "Furgoneta: " + numeroFlota + ", Matrícula: " + matricula + ", Tipo: " + tipo + ", Capacidad: " + capacidadCarga + " m³";

    }


    @Override

    public double masaMaximaAutorizada() {

        validarDatos();

        return pma - peso;

    }

}

Clase Camion

También hereda de Vehiculo y tiene sus propias propiedades.

java

class Camion extends Vehiculo {

    String tipo; // rígido o articulado

    double capacidadCarga; // en m³


    @Override

    public String obtenerPropiedades() {

        return "Camión: " + numeroFlota + ", Matrícula: " + matricula + ", Tipo: " + tipo + ", Capacidad: " + capacidadCarga + " m³";

    }


    @Override

    public double masaMaximaAutorizada() {

        validarDatos();

        return pma - peso;

    }

}

 Clase Trailer

Hereda de Camion y añade propiedades específicas para el remolque.

java

class Trailer extends Camion {

    String matriculaRemolque;

    String fechaInspeccion;


    @Override

    public String obtenerPropiedades() {

        return super.obtenerPropiedades() + ", Remolque: " + matriculaRemolque + ", Fecha de Inspección: " + fechaInspeccion;

    }

}
 Clase Main

Clase Main

Ejemplo de uso del programa, incluyendo ejemplos de uso de cadenas.

java

public class Main {

    public static void main(String[] args) {

        try {

            // Ejemplo de uso de Furgoneta

            Furgoneta furgoneta = new Furgoneta();

            String numeroFlotaFurgoneta = "fr123abcdX"; // Ejemplo de número de flota


            if (furgoneta.verificarFormatoNumeroFlota(numeroFlotaFurgoneta)) {

                furgoneta.numeroFlota = numeroFlotaFurgoneta;

            } else {

                System.out.println("Formato de número de flota de furgoneta inválido.");

                return;

            }


            furgoneta.matricula = "ABC123";

            furgoneta.pma = 3500;

            furgoneta.peso = 2000;

            furgoneta.tipo = "Cerrada";

            furgoneta.capacidadCarga = 10;


            System.out.println(furgoneta.obtenerPropiedades());

            System.out.println("Masa máxima autorizada: " + furgoneta.masaMaximaAutorizada());


            // Ejemplo de uso de Camion

            Camion camion = new Camion();

            String numeroFlotaCamion = "cm456efghY"; // Ejemplo de número de flota


            if (camion.verificarFormatoNumeroFlota(numeroFlotaCamion)) {

                camion.numeroFlota = numeroFlotaCamion;

            } else {

                System.out.println("Formato de número de flota de camión inválido.");

                return;

            }


            camion.matricula = "XYZ789";

            camion.pma = 8000;

            camion.peso = 5000;

            camion.tipo = "Rígido";

            camion.capacidadCarga = 20;


            System.out.println(camion.obtenerPropiedades());

            System.out.println("Masa máxima autorizada: " + camion.masaMaximaAutorizada());


            // Ejemplo de uso de Trailer

            Trailer trailer = new Trailer();

            String numeroFlotaTrailer = "tm789ijklZ"; // Ejemplo de número de flota


            if (trailer.verificarFormatoNumeroFlota(numeroFlotaTrailer)) {

                trailer.numeroFlota = numeroFlotaTrailer;

            } else {

                System.out.println("Formato de número de flota de trailer inválido.");

                return;

            }


            trailer.matricula = "LMN456";

            trailer.pma = 12000;

            trailer.peso = 7000;

            trailer.tipo = "Articulado";

            trailer.capacidadCarga = 30;

            trailer.matriculaRemolque = "REM123";

            trailer.fechaInspeccion = "2023-10-01";


            System.out.println(trailer.obtenerPropiedades());

            System.out.println("Masa máxima autorizada: " + trailer.masaMaximaAutorizada());


            // Ejemplo de uso de cadenas

            String mensaje = "El vehículo con número de flota " + furgoneta.numeroFlota + " tiene una capacidad de carga de " + furgoneta.capacidadCarga + " m³.";

            System.out.println(mensaje);


            // Ejemplo de manipulación de cadenas

            String matricula = "ABC123";

            String matriculaMayuscula = matricula.toUpperCase();

            System.out.println("Matrícula en mayúsculas: " + matriculaMayuscula);


            String matriculaSinNumeros = matricula.replaceAll("[0-9]", "");

            System.out.println("Matrícula sin números: " + matriculaSinNumeros);


        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

} */