import java.util.Scanner;

class Raizcuadrada_samuelhermida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del que quieras saber su raiz cuadrada");
        int num = sc.nextInt();
        int aprox = 0;
        for(int b = 1; aprox < num; b++) {
            aprox = b*b;
            if(aprox == num) {
                System.out.println("La raiz cuadrada de " + num + " es "+ (b));
            }
            else {
                int resto = (num-(b-2)*(b-2));
                System.out.println("La raiz mas cercana es"+resto+"y su resto es");
            }
        }

    }
}
