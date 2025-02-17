import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int aumentarDia=0;
        int aumentarMes=0;
        int aumentarAño=0;
        int cambiardata;
        int fechaEnteraOSeparada;

        //Interaccion con el usuario

        Data fecha = new Data(15, 8, 2023); // Example date: 15/08/2023
        boolean sonIguales = fecha.dataigual(15, 8, 2023); // Compare with another date
        System.out.println("Las fechas son iguales: " + sonIguales);
        fecha.mostrardata(fecha.getdia(), fecha.getmes(), fecha.getaño());
        System.out.println("Si quieres cambiar algun dato de la fecha o la fecha entera pulse 1 , en caso de que no 0");
        cambiardata = entradaTeclado.nextInt();

        if (cambiardata == 1) {

            System.out.println("Te vuelvo a mostrar la data actual");

            fecha.mostrardata(fecha.getdia(), fecha.getmes(), fecha.getaño());

            System.out.println("Quieres cambiar la fecha entera (pulsa 1) o valores separados (pulsa 0)?");

             fechaEnteraOSeparada = entradaTeclado.nextInt();


            if (fechaEnteraOSeparada == 1) {

                System.out.println("Despues de este mensaje cambia los valores uno por uno");

                System.out.println("Aumenta los días:");

                 aumentarDia = entradaTeclado.nextInt();

                fecha.setdia(fecha.getdia() + aumentarDia); // Sumar días


                System.out.println("Aumenta los meses:");

                 aumentarMes = entradaTeclado.nextInt();

                fecha.setmes(fecha.getmes() + aumentarMes); // Sumar meses


                System.out.println("Aumenta los años:");

                 aumentarAño = entradaTeclado.nextInt();

                fecha.setaño(fecha.getaño() + aumentarAño); // Sumar años


                // Aquí puedes agregar lógica para manejar el desbordamiento de días y meses

                // Por ejemplo, si el día excede el número de días en el mes, ajustar el mes y el año

            } else {

                // Cambios separados

                System.out.println("Quieres aumentar día? si=1 no=0");

                 aumentarDia = entradaTeclado.nextInt();

                if (aumentarDia == 1) {

                    fecha.incrementardia();

                }


                System.out.println("Quieres aumentar mes? si=1 no=0");

                 aumentarMes = entradaTeclado.nextInt();

                if (aumentarMes == 1) {

                    fecha.incrementarmes();

                }


                System.out.println("Quieres aumentar año? si=1 no=0");

                 aumentarAño = entradaTeclado.nextInt();

                if (aumentarAño == 1) {

                    fecha.incrementaraño();

                }

            }

        } else {

            // Aquí puedes manejar el caso en que no se quiere cambiar la fecha

            System.out.println("No se ha cambiado la fecha.");

        }

        switch  (aumentarDia ) {

            case 1:

                System.out.println("A empezar bien la semana");

                break;

            case 2:

            case 3:

                System.out.println("El peor dia de la semana");

                break;

            case 4:

                System.out.println("Es casi el fin de semana.");

            case 5:

                System.out.println("Viernes vigo.");

                break;

            case 6:

                System.out.println("Es el fin de semana.");

                break;
            case 7:

                System.out.println("Es el fin de semana.");

                break;

            default:

                System.out.println("Día no válido.");

                break;

        }

        switch (aumentarMes) {

            case 1:

                System.out.println(meses[0] + " tiene 31 días.");

                break;

            case 2:

                System.out.println(meses[1] + " tiene 28 días."); // Considerando un año no bisiesto

                break;

            case 3:

                System.out.println(meses[2] + " tiene 31 días.");

                break;

            case 4:

                System.out.println(meses[3] + " tiene 30 días.");

                break;

            case 5:

                System.out.println(meses[4] + " tiene 31 días.");

                break;

            case 6:

                System.out.println(meses[5] + " tiene 30 días.");

                break;

            case 7:

                System.out.println(meses[6] + " tiene 31 días.");

                break;

            case 8:

                System.out.println(meses[7] + " tiene 31 días.");

                break;

            case 9:

                System.out.println(meses[8] + " tiene 30 días.");

                break;

            case 10:

                System.out.println(meses[9] + " tiene 31 días.");

                break;

            case 11:

                System.out.println(meses[10] + " tiene 30 días.");

                break;

            case 12:

                System.out.println(meses[11] + " tiene 31 días.");

                break;

            default:

                System.out.println("Número de mes no válido.");

                break;

        }
        System.out.println("Fecha ajustada en caso de año bisiesto");
        fecha.ajustarFecha();
        entradaTeclado.close(); // Cerrar el escáner

    }

}



class Data {

    private int dia;
    private int mes;
    private int año;
    private int contadordia;
    private int contadormes;
    private int contadoraño;

    public Data() {
        dia = 0;
        mes = 0;
        año = 0;
        contadordia = 1;
        contadormes = 1;
        contadoraño = 0;
    }

//Metodo para ajustar data (año bisiesto ajuste)

public void ajustarFecha() {

    // Días máximos por mes

    int diasMaximos;

    switch (mes) {

        case 1: case 3: case 5: case 7: case 8: case 10: case 12:

            diasMaximos = 31;

            break;

        case 4: case 6: case 9: case 11:

            diasMaximos = 30;

            break;

        case 2:

            // Verificar si es año bisiesto

            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {

                diasMaximos = 29; // Año bisiesto

            } else {

                diasMaximos = 28; // Año no bisiesto

            }

            break;

        default:

            diasMaximos = 31; // Valor por defecto

            break;

    }


    // Ajustar el día si excede el máximo

    if (dia > diasMaximos) {

        dia = diasMaximos; // Ajustar al máximo permitido

    }


    // Ajustar el mes y el año si el día es menor que 1

    if (dia < 1) {

        dia = 1; // Ajustar al mínimo permitido

    }


    // Ajustar el mes si excede 12

    if (mes > 12) {

        año += mes / 12; // Incrementar el año

        mes = mes % 12; // Ajustar el mes

        if (mes == 0) {

            mes = 12; // Si el mes es 0, ajustarlo a diciembre

        }

    } else if (mes < 1) {

        mes = 1; // Ajustar al mínimo permitido

    }

}

//Set y get

    public void setdia(int dia) {
        this.dia = dia;
    }

    public int getdia() {
        return dia;
    }

    public void setmes(int mes) {
        this.mes = mes;
    }

    public int getmes() {
        return mes;
    }

    public void setaño(int año) {
        this.año = año;
    }

    public int getaño() {
        return año;
    }
    public Data(int d,int m, int a){
        setdia(d);
        setmes(m);
        setaño(a);
    }

    public  void incrementardia(){
        contadordia ++;
    }
    public  void incrementarmes(){
        contadormes++;
    }
    public  void incrementaraño(){
        contadoraño++;
    }
    public  void mostrardata(int dia, int mes,int año){
        System.out.println("El calendario esta inicializado a dia "+dia+ " del "+mes+ " del "+año);
    }

    public boolean dataigual(int diaComparar, int mesComparar, int añoComparar) {

        return this.dia == diaComparar && this.mes == mesComparar && this.año == añoComparar;

    }
}