

// Realiza un programa que calcule a suma e o produto dos números comprendidos entre 10 e 90.


class Scratch {
    public static void main(String[] args) {
        int suma = 0;
        double produto = 1;
        for (int i = 10; i <= 90; i++) {

            suma = suma + i;
            produto = produto * i;
        }
        System.out.println("La suma es" + suma);
        System.out.println("El produto es" + produto);
    }
}