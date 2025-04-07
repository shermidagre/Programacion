package Ej3;

import java.io.*;

public class LecturaTaboaNumerosBinario {
    public LecturaTaboaNumerosBinario(String rutaFicheiro) {
        ObjectInputStream fluxoEntradaImpares = null;
        ObjectInputStream fluxoEntradaPares = null;
        try {
            fluxoEntradaImpares = new ObjectInputStream(new FileInputStream("numerosimpares.dat"));
            int numero;
            while (true) {
                numero = fluxoEntradaImpares.readInt();
                System.out.println(numero);
            }
            try {
                fluxoEntradaPares = new ObjectInputStream(new FileInputStream("numerospares.dat"));
                while (true) {
                    numero = fluxoEntradaPares.readInt();
                    System.out.println(numero);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro non encontrado: " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("No hay nada mas que leer " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/saída: " + e.getMessage());
        } finally {
            if (fluxoEntradaImpares != null) {
                try {
                    fluxoEntradaImpares.close();
                } catch (IOException e) {
                    System.out.println("Error: Problema ao fechar o fluxo de entrada" + e.getMessage());
                }
            }  // end if
        }
    }
    }

