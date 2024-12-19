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

    }//end main
}//end class