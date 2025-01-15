import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //recorrerpalabra();
        //cambiarespaciosporcomas();
        //sustituirespacios();
        //sustituircaracteres();
    }
    public static void recorrerpalabra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a palabra a desglosar");
        String palabra = sc.nextLine();


        for (int i = 0; i < palabra.length(); i++) {

            char pedazo = palabra.charAt(i);

            System.out.println("Carácter en posición " + i + ": " + pedazo);
            //recorrer palabra

        }
    }
    public static void cambiarespaciosporcomas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eliminaremos os espacios en blanco de una palabra y los substituiremos por comas");
        String palabra = sc.nextLine();

        String pedazo = "";
        for (int i = 0; i < palabra.length(); i++){
            if(i == palabra.length()-1){
                pedazo += palabra.charAt(i);
                System.out.printf(pedazo);
                break;
            }
            pedazo += palabra.charAt(i);
            pedazo += ",";
        }
    }
    public static void sustituirespacios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra para sustituir los espacios en blanco por /_");
        String palabra = sc.nextLine();

        String resultado = palabra.replaceAll("\\s", "/_");

        System.out.println("La palabra resultante es: " + resultado);

        System.out.println("Quieres sustituir los espacios por otros caracteres? si(1) no(0)");
        int respuesta = sc.nextInt();

        if (respuesta==1){
            System.out.println("Introduce lo que quieres sustituir por los espacios");
            String cambio = sc.next();
             resultado = palabra.replaceAll("\\s",cambio );
             System.out.println("La palabra resultante es: " + resultado);
        }
        else{
            System.out.println("Finalizando programa");
            return;
        }
    }
    public static void sustituircaracteres(){

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce una palabra o una cadena de numeros:");

            String palabra = sc.nextLine();

            System.out.println("Introduce el nuevo caracter por el que quieres sustituir todos los caracteres:");

            char nuevoCaracter = sc.next().charAt(0);

            // Crear una nueva cadena con el nuevo carácter repetido

            String resultado = String.valueOf(nuevoCaracter).repeat(palabra.length());

            System.out.println("La palabra resultante es: " + resultado);

            sc.close();
    }
    public static void imprimirporcolores(){
        String str = "Hola, mundo!";char[] charArray = str.toCharArray();
        // Códigos ANSI para colores
        String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[0m"};

        for (int i = 0; i < charArray.length; i++) {

            System.out.print(colors[i % colors.length] + charArray[i] + "\u001B[0m"); // Cambiar de color

        }
    }
}
