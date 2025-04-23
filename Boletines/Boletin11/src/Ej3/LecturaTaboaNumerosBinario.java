package Ej3;

import java.io.*;

public class LecturaTaboaNumerosBinario {
    public LecturaTaboaNumerosBinario(String rutaFicheiroImpares, String rutaFicheiroPares) {
        ObjectInputStream fluxoSaidaImpares = null;
        ObjectInputStream fluxoSaidaPares = null;
        try {
            fluxoSaidaImpares = new ObjectInputStream(new FileInputStream(rutaFicheiroImpares));
            fluxoSaidaPares = new ObjectInputStream(new FileInputStream(rutaFicheiroPares));

            System.out.println(" Números Impares ");

            while (true) {
                int numero = fluxoSaidaImpares.readInt();
                System.out.println(numero);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de números impares non encontrado " + e.getMessage());

        } catch (EOFException e) {
            System.out.println("Fin del archivo de números impares ");

        } catch (IOException e) {
            System.out.println("Error de entrada/saída al leer números impares " + e.getMessage());

        } finally {

            if (fluxoSaidaImpares != null) {
                try {
                    fluxoSaidaImpares.close(); // cuando termine cerramos
                } catch (IOException e) {
                    System.out.println("Error: Problema ao fechar o fluxo de entrada de números impares " + e.getMessage());
                }
            }
        }
        try {
            System.out.println(" Números Pares ");
            while (true) {
                int numero = fluxoSaidaPares.readInt();
                System.out.println(numero);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de números pares non encontrado " + e.getMessage());

        } catch (EOFException e) {
            System.out.println("Fin del archivo de números pares ");

        } catch (IOException e) {
            System.out.println("Error de entrada/saída al leer números pares " + e.getMessage());

        } finally {

            if (fluxoSaidaPares != null) {
                try {
                    fluxoSaidaPares.close(); // cuando termine cerramos
                } catch (IOException e) {
                    System.out.println("Error: Problema ao fechar o fluxo de entrada de números pares " + e.getMessage());
                }
            }
        }
    }
}

