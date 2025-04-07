package Ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practica3 {

        /**
         * Metodo principal del programa
         * @param args No usamos
         */
        public static void main(String[] args) {
            //Comienza por interpretar que no se introduce ningún archivo de texto
            Scanner entrada = null;
            try{
                //Variables de calculo
                int suma = 0;
                int media = 0;
                int contador = 0;

                //dirección del archivo de texto
                entrada = new Scanner(new FileReader("/home/dam/Documentos/Prog/Boletines/Boletin11/src/Ej2/TextoNumeros"));

                //Guarda como String toda la info del archivo de texto
                String linea = entrada.nextLine();

                //Si los datos de archivo no son nulos
                while (linea != null) {

                    //Crea un array de Strings dividiendo cada grupo de caracteres según el número de espacios en blanco que tengan en el texto
                    Scanner sc = new Scanner(linea);

                    while (sc.hasNextLine()) {
                        suma = suma + sc.nextInt();
                        contador++;
                    }

                    linea = entrada.nextLine();

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
                        entrada.close();
                }//end if
            }//end finally
        }//end main
    }


