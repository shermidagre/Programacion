package Ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practica2 {
        /**
         * Metodo principal del programa
         * @param args No usamos
         */
        public static void main(String[] args) {
            //Comienza por interpretar que no se introduce ningún archivo de texto
            BufferedReader entrada = null;
            try{
                //Variables de calculo
                int suma = 0;
                int media = 0;
                int contador = 0;

                //dirección del archivo de texto
                entrada = new BufferedReader(new FileReader("/home/dam/Documentos/Prog/Boletines/Boletin 11/src/Ej2/TextoNumeros"));

                //Guarda como String toda la info del archivo de texto
                String linea = entrada.readLine();

                //Si los datos de archivo no son nulos
                while (linea != null) {

                    //Crea un array de Strings dividiendo cada grupo de caracteres según el número de espacios en blanco que tengan en el texto
                    Scanner sc = new Scanner(linea);

                    while (sc.hasNextLine()) {
                        suma = suma + sc.nextInt();
                        contador++;
                    }

                    linea = entrada.readLine();

                }//end while

                //Resultados de las operaciones
                System.out.println(media);
                System.out.println(suma);


                // Excepciones en caso de error en el código
            }catch(IOException e){
                System.out.println("Error de entrada o salida: "+ e.getMessage());
            }//end catch
            finally {
                if (entrada != null) {
                    try {
                        entrada.close();
                    } catch (IOException e) {
                        System.out.println("Erro dentro do segundo catch: " + e.getMessage());
                    }//end catch
                }//end if
            }//end finally
        }//end main
    }

