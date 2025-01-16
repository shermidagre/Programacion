import java.util.Scanner;

 class Boletin2_3 {
    public static void main(String[] args) {
        double cambio, euros, dolares;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce o cambio euro-dolar");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce la cantidad de euros a cambiar");
        euros = entradaTeclado.nextDouble();
        dolares = euros/cambio;
        System.out.println(dolares+ "dolares de cambio, por"+ euros+ "Euros");
        entradaTeclado.close();

    }
}