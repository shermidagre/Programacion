package Ej3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraTaboaNumerosBinaria {

    EscrituraTaboaNumerosBinaria(int [] taboa) {
        ObjectOutputStream fluxoSaida = null;
                try {
                    fluxoSaida = new ObjectOutputStream(new FileOutputStream("numeros.dat"));

                    if (taboa != null ) {
                        for (int numero : taboa) {
                            fluxoSaida.writeInt(numero);
                        }
                    }
                }
                catch (FileNotFoundException e) {
                    System.out.println("Error: Ficheiro non encontrado" + e.getMessage());;
                } catch (IOException e) {
                    System.out.println("Error: Entrada/saida" + e.getMessage());
                }
                finally {
                    if (fluxoSaida != null) {
                        try {
                            fluxoSaida.close();
                        } catch (IOException e) {
                            System.out.println("Error: Problema ao fechar o fluxo de escrita" + e.getMessage());
                        }
                    }
                }
    }
}
