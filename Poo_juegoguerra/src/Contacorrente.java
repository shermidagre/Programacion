// Juego con las clases , creacion de una cuenta corrente basica


public class Contacorrente {

        double saldo;
        String Titular;
        String nConta;
        String nif;
        static int contadorContas;

    public Contacorrente() {

        saldo=1000;

        Titular="Juan";

        nConta="19210783";

        nif="12893KOAOIPDJA8N";

        nif.toUpperCase();

        contadorContas =0;


    }
    public Contacorrente(String Titular, String nConta, String nif, double saldo, int contadorContas){

        this.Titular=Titular;
        this.nConta=nConta;
        setNif(nif);
        setSaldo(saldo);
        contadorContas++;

    }

    public void sacarDinero(double valor) {

        if (valor > saldo) {

            System.out.println("Saldo insuficiente.");

        } else {

            saldo -= valor;

            System.out.println("Retiro de " + valor + " realizado. Saldo atual: " + saldo);

        }

    }


    public void ingresarDinero(double valor) {

        saldo += valor;

        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);

    }


    public void mostrarInformacao() {

        System.out.println("Titular: " + Titular);

        System.out.println("Número da Conta: " + nConta);

        System.out.println("NIF: " + nif);

        System.out.println("Saldo: " + saldo);

    }

    // gett and sett

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        if (saldo < 0) {

            throw new IllegalArgumentException("El saldo no debe ser negativo");

        }

        this.saldo = saldo;

    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {

        if (esNifValido(nif)) {

            this.nif = nif;

        } else {

            throw new IllegalArgumentException("NIF no válido");

        }

    }

    private boolean esNifValido(String nif) {

        // Comprobar que el NIF no sea nulo y tenga la longitud correcta

        if (nif == null || nif.length() != 9) {

            return false;

        }

        // Comprobar que los primeros 8 caracteres sean dígitos

        String numeros = nif.substring(0, 8);

        String letra = nif.substring(8, 9).toUpperCase();


        if (!numeros.matches("\\d{8}") || !letra.matches("[A-Z]")) {

            return false;

        }

        // Calcular la letra del NIF

        int numero = Integer.parseInt(numeros);

        char letraCalculada = calcularLetraNif(numero);

        // Comparar la letra calculada con la letra proporcionada

        return letra.equals(String.valueOf(letraCalculada));

    }


    private char calcularLetraNif(int numero) {

        // Array de letras correspondientes a los números

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[numero % 23];

    }

    public static int getcontadorContas() {
        return contadorContas;
    }

    public static void setContadorContas(int contadorContas) {
        contadorContas = contadorContas;
    }
}
