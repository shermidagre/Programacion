package Ej3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraTaboaNumerosBinaria {

    EscrituraTaboaNumerosBinaria(int [] taboa) {
        ObjectOutputStream fluxoSaidaImpares = null;
        ObjectOutputStream fluxoSaidaPares = null;
                try {
                    fluxoSaidaImpares = new ObjectOutputStream(new FileOutputStream("numerosimpares.dat"));
                    fluxoSaidaPares = new ObjectOutputStream(new FileOutputStream("numerospares.dat"));
                    
                    if (taboa != null ) {
                        for (int numero : taboa) {
                            if (numero % 2 == 0) {
                                fluxoSaidaPares.writeInt(numero);
                            } else {
                                fluxoSaidaImpares.writeInt(numero);
                            }
                        }
                    }
                }
                catch (FileNotFoundException e) {
                    System.out.println("Error: Ficheiro non encontrado" + e.getMessage());;
                } catch (IOException e) {
                    System.out.println("Error: Entrada/saida" + e.getMessage());
                }
                finally {
                    if (fluxoSaidaPares != null) {
                        try {
                            fluxoSaidaPares.close();
                        } catch (IOException e) {
                            System.out.println("Error: Problema ao fechar o fluxo de escrita" + e.getMessage());
                        }
                    }
                    if (fluxoSaidaImpares != null) {
                        try {
                            fluxoSaidaImpares.close();
                        } catch (IOException e) {
                            System.out.println("Error: Problema ao fechar o fluxo de escrita" + e.getMessage());
                        }
                    }
                }
    }
}
