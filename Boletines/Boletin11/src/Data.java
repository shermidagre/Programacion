
class Hora {

    private Object formatohoras;

    enum FormatoHora{DOCE, VINTECATRO}

    private int segundos;

    private int minutos;

    private int horas;


    // Constructor por defecto

    public Hora() {

        this.segundos = 0;

        this.minutos = 0;

        this.horas = 0;

    }


    // Constructor con parámetros

    public Hora(int horas, int minutos, int segundos, String formatohoras) {

        setFormato(formatohoras);

        setSegundos(segundos);

        setMinutos(minutos);

        setHoras(horas);

        ajustarHora(); // Ajustar la hora en caso de que los valores sean inválidos

    }

    // Métodos get y set

    public void setFormato(String formatohoras){
        if (formatohoras.toUpperCase().equals("DOCE") || formatohoras.toUpperCase().equals("VINTECATRO")) {
        }

    }


    public String toString() {
        String cadeahora;
        if (formatohoras == FormatoHora.VINTECATRO) {
            cadeahora = "A hora e " + horas + ":" + minutos + ":" + segundos;
        } else {
            if (horas > 11) {
                cadeahora = "A hora e " + (horas - 12) + ":" + minutos + ":" + segundos + " PM";
            } else {
                cadeahora = "A hora e " + horas + ":" + minutos + ":" + segundos + " AM";
            }
        }
        return cadeahora;
    }



    public int getSegundos() {

        return segundos;

    }


    public void setSegundos(int segundos) {

        if(segundos>=0 && segundos<60)

            this.segundos = segundos;

        else this.segundos=0;

        ajustarHora();

    }


    public int getMinutos() {

        return minutos;

    }


    public void setMinutos(int minutos) {

        if(minutos>=0 && minutos<60)

            this.minutos = minutos;

        else this.minutos=0;

        ajustarHora();

    }


    public int getHoras() {

        return horas;

    }


    public void setHoras(int horas) {

        if(horas>=0 && horas<24)

            this.horas = horas;

        else this.horas=0;

        ajustarHora();
    }


    // Método para ajustar la hora

    private void ajustarHora() {

        // Ajustar segundos

        if (segundos >= 60) {

            minutos += segundos / 60;

            segundos = segundos % 60;

        } else if (segundos < 0) {

            minutos += (segundos / 60) - 1; // Resta un minuto si hay segundos negativos

            segundos = (segundos % 60 + 60) % 60; // Ajustar segundos a un rango positivo

        }


        // Ajustar minutos

        if (minutos >= 60) {

            horas += minutos / 60;

            minutos = minutos % 60;

        } else if (minutos < 0) {

            horas += (minutos / 60) - 1; // Resta una hora si hay minutos negativos

            minutos = (minutos % 60 + 60) % 60; // Ajustar minutos a un rango positivo

        }


        // Ajustar horas

        if (horas >= 24) {

            horas = horas % 24; // Mantener horas en un rango de 0 a 23

        } else if (horas < 0) {

            horas = (horas % 24 + 24) % 24; // Ajustar horas a un rango positivo

        }

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
}