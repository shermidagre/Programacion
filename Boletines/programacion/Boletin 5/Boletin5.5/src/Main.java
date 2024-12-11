import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sueldo ;
        int sueldosmedios = 0;
        int sueldo1000 = 0;
        int nsueldos = 0;

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce o salario do traballador, si luego quieres salir introduce 0");
        sueldo = entradaTeclado.nextInt();

        while (sueldo != 0) {

            if (sueldo < 0) {
                System.out.println("Introduce o salario de traballador con valor positivo");
            } else {
                if
                (sueldo > 1000)
                    sueldo1000++;

                else if (sueldo >= 1000 & sueldo <= 1750)
                    sueldosmedios++;
                nsueldos++;
            }
            System.out.println("Introduce o salario do traballador, si luego quieres salir introduce 0");
            sueldo = entradaTeclado.nextInt();
        }

        if (nsueldos > 0) {
            int porcentaje = sueldo1000 * 100 / nsueldos;
            System.out.println("Hay " + sueldosmedios +"que cobran entre 1000 e 1750 euros y un " + porcentaje +"% que cobra menos de 1000 euros");
        } else {
            System.out.println("No se introdujeron sueldos validos");
        }
        entradaTeclado.close();
    }
    }




