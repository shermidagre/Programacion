package Ej3;

import java.io.*;

public class LecturaTaboaNumerosBinario {
    public LecturaTaboaNumerosBinario(String rutaFicheiro) {
        ObjectOutputStream fluxoSaidaImpares = null;
        ObjectOutputStream fluxoSaidaPares = null;
        try {
            fluxoSaidaImpares = new ObjectInputStream(new FileOutputStream("numerosimpares.dat");
            int numero;
            while (true) {
                numero = fluxoSaidaImpares.();
                System.out.println(numero);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro non encontrado: " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("No hay nada mas que leer " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/saída: " + e.getMessage());
        } finally {
            if (fluxoSaidaImpares != null) {
                try {
                    fluxoSaidaImpares.close();
                } catch (IOException e) {
                    System.out.println("Error: Problema ao fechar o fluxo de entrada" + e.getMessage());
                }
            }  // end if
        }
    }
    }

