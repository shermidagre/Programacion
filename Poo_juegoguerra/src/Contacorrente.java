// Juego con las clases , creacion de una cuenta corrente basica
import java.util.ArrayList;

import java.util.List;


public class Contacorrente {


    private double saldo;

    private List<String> titulares; // Cambiado a una lista para múltiples titulares

    private String nConta;

    private String nif;

    private static int contadorContas;


    public Contacorrente() {

        this.saldo = 1000;

        this.titulares = new ArrayList<>();

        this.titulares.add("Juan"); // Agregar un titular por defecto

        this.nConta = "19210783";

        this.nif = "12893KOAOIPDJA8N";

        this.nif = this.nif.toUpperCase(); // Asegurarse de que el NIF esté en mayúsculas

        contadorContas++;

    }


    public Contacorrente(List<String> titulares, String nConta, String nif, double saldo) {

        this.titulares = new ArrayList<>();

        setTitulares(titulares); // Usar el método para validar los titulares

        this.nConta = nConta;

        setNif(nif); // Usar el método para validar el NIF

        setSaldo(saldo); // Usar el método para validar el saldo

        contadorContas++;

    }


    public void sacarDinero(double valor) {

        if (valor > saldo) {

            System.out.println("Saldo insuficiente.");

        } else {

            saldo -= valor;

            System.out.println("Retiro de " + valor + " realizado. Saldo actual: " + saldo);

        }

    }


    public void ingresarDinero(double valor) {

        saldo += valor;

        System.out.println("Depósito de " + valor + " realizado. Saldo actual: " + saldo);

    }


    public void mostrarInformacion() {

        System.out.println("Titulares: " + String.join(", ", titulares));

        System.out.println("Número da Conta: " + nConta);

        System.out.println("NIF: " + nif);

        System.out.println("Saldo: " + saldo);

    }

    // Set y gett Titulares

    public void setTitulares(List<String> nuevosTitulares) {

        if (nuevosTitulares == null || nuevosTitulares.isEmpty()) {

            throw new IllegalArgumentException("La lista de titulares no puede ser nula o vacía");

        }


        for (String titular : nuevosTitulares) {

            if (!esTitularValido(titular)) {

                throw new IllegalArgumentException("Titular no válido: " + titular);

            }

        }


        this.titulares = nuevosTitulares;

    }



    private boolean esTitularValido(String titular) {

        return titular != null && !titular.trim().isEmpty();

    }

    // gett and sett del DNI

    public void setNif(String nif) {

        if (nif == null || nif.length() != 15) { // El NIF tiene que tener 15 caracteres por lo cual realizamos la comprobacion

            throw new IllegalArgumentException("NIF no válido");

        }

        this.nif = nif.toUpperCase(); // Asegurarse de que el NIF esté en mayúsculas ya que si no tambien es no valido

    }

    // Sett y get saldo

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        if (saldo < 0) {

            throw new IllegalArgumentException("El saldo no puede ser negativo al crearcuenta");

        }

        this.saldo = saldo;

    }

    // Sett y gett numero de cuenta

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {

        /*

           Verifica si cuenta es null,
           Verifica si la cuenta tiene una longitud distinta a la que necesitamos(esto se elegira dependiendo en el pais que te encuentres, pondremos la establecida en españa)
           Y por ultimo comprueba matches verifica si la cadena está compuesta únicamente por números.

         */

        if (nConta == null || nConta.length() != 20 || !nConta.matches("\\d+")) {

            throw new IllegalArgumentException("Número de cuenta no válido. Debe tener "+nConta.length()+" dígitos.");

        }

        this.nConta = nConta;
    }

    // Set y gett nif

    public String getNif() {
        return nif;
    }

    private boolean esNifValido(String nif) {

        // Comprobar que el NIF no sea nulo y tenga la longitud correcta (9) (8 numeros, 1 letra)

        if (nif == null || nif.length() != 9) {

            return false;

        }

        String numeros = nif.substring(0, 8); // Comprobar que los primeros 8 caracteres sean dígitos

        String letra = nif.substring(8, 9).toUpperCase(); // De nuevo establecemos la letra a mayuscula para evitar errores


        if (!numeros.matches("\\d{8}") || !letra.matches("[A-Z]")) {

            return false;

        }

        // Calcular la letra del NIF

        int numero = Integer.parseInt(numeros);

        char letraCalculada = calcularLetraNif(numero);

        // Comparar la letra calculada con la letra proporcionada

        return letra.equals(String.valueOf(letraCalculada));

    }

    // Funcion para calcular la letra del Nif para luego compararla

    private char calcularLetraNif(int numero) {

        // Array de letras correspondientes a los números

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[numero % 23];

    }

    // Sett y get contador de cuentas

    public static int getcontadorContas() {
        return contadorContas;
    }

    public static void setContadorContas(int contadorContas) {
        contadorContas = contadorContas;
    }
}
