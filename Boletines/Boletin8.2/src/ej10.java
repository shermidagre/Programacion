import java.util.Scanner;

public class ej10 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una contraseña");
        String contraseña = sc.nextLine();
        comprobarcontraseña(contraseña);

    }
    static void comprobarcontraseña(String contraseña){
        boolean correcto = false, maius = false, minus= false, numero=false;
        char caracter;
        if(contraseña.length()>7){

            for(int i=0; i<contraseña.length(); i++){

                caracter = contraseña.charAt(i); //Obtenemos caracter

                if(Character.isUpperCase(caracter)){
                    maius = true;
                }
                if(Character.isLowerCase(caracter)){
                    minus = true;
                }
                if(Character.isDigit(caracter)){
                    numero = true;
                }

            }
            if(maius && minus && numero){
                correcto = true;
            }
            if(correcto){
                System.out.println("Contraseña válida");
            }else{
                System.out.println("Contraseña no válida");
            }

        }
    }
}
   /* static void comprobarContraseña(String contraseña) {
        int longitud = contraseña.length();
        boolean mayusculas = false;
        boolean minusculas = false;
        boolean numeros = false;
        boolean caracteresEspeciales = false;

        if (longitud >= 8) {
            for (int i = 0; i < longitud; i++) {
                char caracter = contraseña.charAt(i);

                if (Character.isUpperCase(caracter)) {
                    mayusculas = true;
                } else if (Character.isLowerCase(caracter)) {
                    minusculas = true;
                } else if (Character.isDigit(caracter)) {
                    numeros = true;
                } else if (!Character.isLetterOrDigit(caracter)) {
                    caracteresEspeciales = true;
                }
            }

            if (mayusculas && minusculas && numeros && caracteresEspeciales) {
                System.out.println("Contraseña válida");
            } else {
                System.out.println("Contraseña no válida");
            }
        }
        else {
            System.out.println("Contraseña demasiado corta");
        }
    }

}
*/