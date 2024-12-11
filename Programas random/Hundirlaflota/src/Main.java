import java.util.Scanner;

/**
 * Juego de hundir la Flota
 * @version 1.0
 * @author Samuel Hermida Gregores
 */
        public class main {

    /**
     * Funcion principal
     * @param args parametros del juego
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce la coordenada x: ");
                int x = sc.nextInt();
                System.out.print("Introduce la coordenada y: ");
                int y = sc.nextInt();

                int[] [] barcos= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                };
                do {
                    do{
                        System.out.println("Has tocado en (" + x + "," + y + ")");
                        System.out.println("¿Desea volver a jugar? (S/N)");
                        char respuesta = sc.next().charAt(0);
                        if (respuesta == 'N' || respuesta == 'n') {
                            break;
                        }
                        System.out.print("Introduce la coordenada x: ");
                        x = sc.nextInt();
                        System.out.print("Introduce la coordenada y: ");
                        y = sc.nextInt();

                    }
                    while(x < 1 || x > 4 || y < 1 || y > 4);{}
                }
                while(true);
            }


        /*boolean estaDentro = false;
        for (int i = 0; i < barcos.length; i++) {
            for (int j = 0; j < barcos[i].length; j++) {
                if (barcos[i][j] != x && barcos[i][j] == y) {
                    estaDentro = true;
                    break;
                }
            }
        }
        if (estaDentro) {
            System.out.println("El barco (" + x + "," + y + ") está dentro");
        }
        else{
            System.out.println("Has tocado agua");
        }

         */

        }

/**
 *
 * @param tablero
 */
static void recorrertablero(int[][] tablero){

}

/**
 * Comprueba si es una nave o no
 * @param valor_coordenada valor de la coordenada a estudiar
 * @return
 */

static boolean esNave(int valor_coordenada){
    return valor_coordenada>0;
}

static void tipoDeNave(int valor_coordenada, int x, int y){
    switch (valor_coordenada){
        case 1:
            System.out.println("Submarino"+x+ ":"+y);
            break;
            case 2:
                System.out.println("Portaviones"+x+ ":"+y);
                break;
            case 3:
                System.out.println("Acorazado"+x+ ":"+y);
                break;
            case 4:
                System.out.println("Destructor"+x+ ":"+y);
                break;
        default:
    }
}


