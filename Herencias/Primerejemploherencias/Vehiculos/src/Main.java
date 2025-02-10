class Persona {


    String nombre;

    String apellido;


    // Constructor

    public Persona(String nombre, String apellido) {

        this.nombre = nombre;

        this.apellido = apellido;

    }


    // Método para mostrar la información de la persona

    public String obtenerInformacion() {

        return nombre + " " + apellido;

    }

}

class Vehiculo {


    int numeroRegistro;

     Persona propietario; // Suponiendo que se ha definido una clase Persona


    void transferirPropiedad(Persona nuevoPropietario) {

        this.propietario = nuevoPropietario;

    }

}


class Coche extends Vehiculo {


    int numeroPuertas;


    // Métodos y propiedades adicionales específicos para Coche

}


class Camion extends Vehiculo {


    int numeroEjes;


    // Métodos y propiedades adicionales específicos para Camión

}


class Motocicleta extends Vehiculo {


    boolean tieneSidecar;


    // Métodos y propiedades adicionales específicos para Motocicleta

}


// Vehículos acuáticos

class Barco extends Vehiculo {


    int capacidadPasajeros;

    double longitud;


    void navegar() {

        // Implementación de navegación

    }


    void anclar() {

        // Implementación de anclaje

    }

}


class Velero extends Barco {


    double areaVela;


    void ajustarVela() {

        // Implementación para ajustar la vela

    }

}


// Vehículos terrestres

class Bicicleta extends Vehiculo {


    boolean tieneCambios;


    void pedalear() {

        // Implementación de pedalear

    }


    void frenar() {

        // Implementación de frenar

    }

}


class Autobus extends Vehiculo {


    int capacidadPasajeros;


    void recogerPasajeros() {

        // Implementación para recoger pasajeros

    }

}


class Camioneta extends Vehiculo {


    double capacidadCarga;


    void cargar() {

        // Implementación para cargar

    }


    void descargar() {

        // Implementación para descargar

    }

}
public class Main {

    public static void main(String[] args) {

        // Crear personas

        Persona propietario1 = new Persona("Juan", "Pérez");

        Persona propietario2 = new Persona("María", "Gómez");


        // Mostrar información de las personas

        System.out.println("Propietario 1: " + propietario1.obtenerInformacion());

        System.out.println("Propietario 2: " + propietario2.obtenerInformacion());

        /*    // Crear una persona

        Persona propietario1 = new Persona("Juan", "Pérez");

        Persona propietario2 = new Persona("María", "Gómez");

        */

        // Crear un coche

        Coche coche = new Coche();

        coche.numeroRegistro = 12345;

        coche.propietario = propietario1;

        coche.numeroPuertas = 4;


        // Transferir propiedad del coche

        coche.transferirPropiedad(propietario2);

        System.out.println("El propietario del coche ahora es: " + coche.propietario.nombre);


        // Crear un camión

        Camion camion = new Camion();

        camion.numeroRegistro = 67890;

        camion.propietario = propietario1;

        camion.numeroEjes = 6;


        // Crear una motocicleta

        Motocicleta motocicleta = new Motocicleta();

        motocicleta.numeroRegistro = 54321;

        motocicleta.propietario = propietario2;

        motocicleta.tieneSidecar = true;


        // Crear un barco

        Barco barco = new Barco();

        barco.numeroRegistro = 11111;

        barco.propietario = propietario1;

        barco.capacidadPasajeros = 10;

        barco.longitud = 30.5;


        // Navegar y anclar el barco

        barco.navegar();

        barco.anclar();


        // Crear un velero

        Velero velero = new Velero();

        velero.numeroRegistro = 22222;

        velero.propietario = propietario2;

        velero.capacidadPasajeros = 5;

        velero.longitud = 15.0;

        velero.areaVela = 50.0;


        // Ajustar la vela del velero

        velero.ajustarVela();


        // Crear una bicicleta

        Bicicleta bicicleta = new Bicicleta();

        bicicleta.numeroRegistro = 33333;

        bicicleta.propietario = propietario1;

        bicicleta.tieneCambios = true;


        // Pedalear y frenar la bicicleta

        bicicleta.pedalear();

        bicicleta.frenar();


        // Crear un autobús

        Autobus autobus = new Autobus();

        autobus.numeroRegistro = 44444;

        autobus.propietario = propietario2;

        autobus.capacidadPasajeros = 50;


        // Recoger pasajeros

        autobus.recogerPasajeros();


        // Crear una camioneta

        Camioneta camioneta = new Camioneta();

        camioneta.numeroRegistro = 55555;

        camioneta.propietario = propietario1;

        camioneta.capacidadCarga = 1000.0;


        // Cargar y descargar la camioneta

        camioneta.cargar();

        camioneta.descargar();

    }

}