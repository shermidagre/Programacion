import java.util.Scanner;
/*
Examen realizado por Samuel Hermida Gregores
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Realizaremos un programa el cual contiene un array de 20 nomes e no cal podemos engadir e eleminar nomes
        String[] nomes = {
                "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro", "Baleiro"};
        System.out.println("Cando queiras salir do programa pulsa (100), se queres continuar o programa pulsa un numero diferente a 100");
        int num = sc.nextInt();
        while(num!=100){
            System.out.println("Esta e a lista de nomes Baleira preparada para que insertes os nomes que queiras :)");
            Visualizarmatriz(nomes);
            engadirnomesporteclado(nomes);//Engadir socio por teclado
            Visualizarmatriz(nomes);


            // engadirnomesmanuais(nomes, "manuel", 1);

            System.out.println("¿Deseas eliminar algun socio?Se e si pulse (1) se e non pulse (0)");
            int preguntaeliminarsocio = sc.nextInt();

            // eliminarnomesmanuais(nomes, 1, "manuel");

            if (preguntaeliminarsocio == 1) {
                System.out.println("¿Que posicion queres eliminar, las posiciones son del 0 al 19, comprueba la tabla que te deje anteriormente para señalizar cual es la posicion correcta?");
                int posicioneliminarsocio = sc.nextInt();
                eliminarnomes(nomes, posicioneliminarsocio, "Baleiro");
                Visualizarmatriz(nomes);
                System.out.println("O nome a sido eliminado con exito");
            } else {
                System.out.println("****************************************************************");

                System.out.println("Seleccione se quere engadir nomes por teclado, se e si pulse (1) se e non pulse (0)");
                int preguntanomes = sc.nextInt();
                if (preguntanomes == 1) {

                    engadirnomesporteclado(nomes);//Engadir socio por teclado
                    Visualizarmatriz(nomes);

                } else if (preguntanomes == 0) {
                    System.out.println("¿Estas seguro? Se e si pulse (2) se e non pulse (4)");
                    preguntanomes = sc.nextInt();
                    if (preguntanomes == 2) {
                        return;
                    } else {
                        System.out.println("Aqui finaliza o programa");
                    }
                }
                engadirnomesporteclado(nomes);//Engadir socio por teclado
                Visualizarmatriz(nomes);
            }
        }
    }

    static  void Visualizarmatriz(String[]matriz){
        for(String nome : matriz){ //Este for sirve para poder recorret la array dada por parametro y asi poder llamarla en la funcion main para que saque por pantalla todos los valores de la array
            System.out.println(nome+" ");
        }
    }



    static void engadirnomesmanuais(String[]matriz,String nome, int posicion){

        matriz[posicion] =nome;

    }
    static boolean engadirnomesporteclado(String[]matriz){

        Scanner sc = new Scanner(System.in);
        System.out.println("¿A que posicion le quieres dar un nombre?");
        int posicion = sc.nextInt();
        System.out.println("Introduce el nombre que le quieras asignar");
        String nombre = sc.next();

       System.out.println("A operacion tuvo exito");
        if (nombre == null) {
            return false;
        }
        else{
            matriz[posicion] = nombre;
            return true;
        }

    }
    static void eliminarnomes(String [] matriz, int indicesocio, String eliminarsocio){
        //Aqui cambiaremos o eliminaremos el nombre que queramos introducido por teclado

        eliminarsocio ="Baleiro";
        matriz [indicesocio] = eliminarsocio;

    }


}