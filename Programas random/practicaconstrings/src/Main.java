//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // \'
    // \''
    // \n
    // \r
    // \t
    // \b
    // \f
    public static void main(String[] args) {
        //maneras de crear un String (son iguales)
        String nome = " Manuel";
        String apelido = new String(" Gutierrez");
        System.out.println(nome);
        System.out.println(apelido);

        //manera de contar el numero de caracteres para un String
        System.out.println("A lonxitude de nome é " + nome.length());
        //transforma la variable nome a un string y permite ponerle comillas por consola
        System.out.println("A lonxitude de \"nome\" é "+ nome.length());

        System.out.println("Tres tristes tigres \r comen trigo en un trigal");
        //concatena dos Strings, y crea un nuevo String a partir de la unión de los dos Strings
        String nomeCompleto = nome.concat(apelido);
        System.out.println(nomeCompleto);
        //Visualiza a posicion dunha letra no nome introducido, en este caso Manuel
        System.out.println("O quinto caracter de nome e : "+nome.charAt(4));
        //Para comparar un string se debe realizar de la siguiente manera

       //Maneras de representar la a
       char caracter ;
        caracter = 'a';
        caracter = 97; //representar la a mediante unicode
        caracter = '\u0061'; //representar la a mediante hexadecimal
        System.out.println(caracter);

        //mostrar todos os caracteres unicode hasta el 1114111
        for (int i= 0; i<1114112;i++){
            caracter = (char) i;
            System.out.println(caracter);
        }
        // Mostrar caracteres desde el 66 hasta el 123 desglosandolos(rango donde empiezan las mayusculas hasta que terminan las minusculas)
        for (int i = 65; i < 123; i++) {

            caracter = (char) i;

            System.out.println("Caracter: " + caracter);

            System.out.println("Es dígito: " + Character.isDigit(caracter)); //Comprueba si es un digito

            System.out.println("Es letra: " + Character.isLetter(caracter)); //Comprueba si es una letra

            System.out.println("Es espacio en blanco: " + Character.isWhitespace(caracter)); //Comprueba si hay un espacio en blanco

            System.out.println("Es minúscula: " + Character.isLowerCase(caracter)); //Comprueba si es una mayuscula

            System.out.println(); // Línea en blanco para mejor legibilidad

        }
        //Para optimizar el bucle y evitar comprobaciones innecesarias, puedes hacer uso de las propiedades de los caracteres ASCII y limitar las comprobaciones a solo aquellos caracteres que realmente pueden ser relevantes para cada método. Por ejemplo:
        //
        //    Dígitos: Los dígitos ASCII están en el rango del 48 al 57 (0-9).
        //    Letras: Las letras mayúsculas están en el rango del 65 al 90 (A-Z) y las letras minúsculas en el rango del 97 al 122 (a-z).
        //    Espacios en blanco: El espacio en blanco tiene un valor ASCII de 32.
        //    Minúsculas: Solo se debe comprobar si el carácter está en el rango de las letras minúsculas (97-122).

                for (int i = 65; i < 123; i++) {

                    caracter = (char) i;

                    System.out.println("Caracter: " + caracter);


                    // Comprobación de dígitos

                    if (Character.isDigit(caracter)) {

                        System.out.println("Es dígito: true");

                    } else {

                        System.out.println("Es dígito: false");

                    }


                    // Comprobación de letras

                    if (Character.isLetter(caracter)) {

                        System.out.println("Es letra: true");


                        // Solo comprobar si es minúscula si es letra

                        if (Character.isLowerCase(caracter)) {

                            System.out.println("Es minúscula: true");

                        } else {

                            System.out.println("Es minúscula: false");

                        }

                    } else {

                        System.out.println("Es letra: false");

                        System.out.println("Es minúscula: false"); // No es letra, por lo tanto no puede ser minúscula

                    }

                    // Comprobación de espacio en blanco

                    if (Character.isWhitespace(caracter)) {

                        System.out.println("Es espacio en blanco: true");

                    } else {

                        System.out.println("Es espacio en blanco: false");

                    }


                    System.out.println(); // Línea en blanco para mejor legibilidad

                }

            }

        }
