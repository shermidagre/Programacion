package DataHora;

public class Data {

    private int dia;
    private int mes;
    private int año;
    private int contadordia;
    private int contadormes;
    private int contadoraño;

    public Data() {

        setaño(año);
        setdia(dia);
        setmes(mes);
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

    public void comprobarformato(int dia, int mes, int año, String cadea) {

        this.dia = dia;

        this.mes = mes;

        this.año = año;


        // Check if the input string has the correct length

        if (cadea.length() == 10) {

            // Check if the format is "dd-mm-yyyy" or "dd/mm/yyyy"

            if (cadea.charAt(2) == '-' && cadea.charAt(5) == '-') {

                // Format is "dd-mm-yyyy"

                cadea = String.format("A data é %02d-%02d-%04d", dia, mes, año);

                System.out.println(cadea);

            } else if (cadea.charAt(2) == '/' && cadea.charAt(5) == '/') {

                // Format is "dd/mm/yyyy"

                cadea = String.format("A data é %02d/%02d/%04d", dia, mes, año);

                System.out.println(cadea);

            } else {

                System.out.println("Formato inválido");

            }

        } else {

            System.out.println("Formato inválido");

        }

    }

    public String toString() {

        String cadeadata;
        String cadeadata1;
        String cadeadata2;

            cadeadata1 = String.format("A data é %02d-%02d-%02d", dia, mes, año);

            cadeadata = String.format("A data é %02d/%02d/%02d", dia, mes, año);

            cadeadata2 = String.format("A data é %02d,%02d,%02d", dia, mes, año);


        return cadeadata + " tiene distinto formato a " + cadeadata1 + " tiene distinto formato a " + cadeadata2;

    }

}