package DataHora;

public class Hora {


    enum FormatoHora { DOCE, VINTECATRO }


    private int segundos;

    private int minutos;

    private int horas;

    private FormatoHora formatohoras;


    // Constructor por defecto

    public Hora() {

        this.segundos = 0;

        this.minutos = 0;

        this.horas = 0;

        this.formatohoras = FormatoHora.VINTECATRO; // Valor por defecto

    }


    // Constructor con parámetros

    public Hora(int horas, int minutos, int segundos, String formatohoras) {

        setFormato(formatohoras);

        setSegundos(segundos);

        setMinutos(minutos);

        setHoras(horas);

        ajustarHora(); // Ajustar la hora en caso de que los valores sean inválidos

    }


    // Método para establecer el formato

    public void setFormato(String formatohoras) {

        if (formatohoras.equalsIgnoreCase("DOCE")) {

            this.formatohoras = FormatoHora.DOCE;

        } else if (formatohoras.equalsIgnoreCase("VINTECATRO")) {

            this.formatohoras = FormatoHora.VINTECATRO;

        } else {

            throw new IllegalArgumentException("Formato de hora no válido");

        }

    }


    @Override

    public String toString() {

        String cadeahora;

        if (formatohoras == FormatoHora.VINTECATRO) {

            cadeahora = String.format("A hora é %02d:%02d:%02d", horas, minutos, segundos);

        } else { // Formato DOCE

            int hora12 = (horas % 12 == 0) ? 12 : horas % 12; // Convertir a formato 12 horas

            String periodo = (horas >= 12) ? " PM" : " AM";

            cadeahora = String.format("A hora é %02d:%02d:%02d%s", hora12, minutos, segundos, periodo);

        }

        return cadeahora;

    }


    public int getSegundos() {

        return segundos;

    }


    public void setSegundos(int segundos) {

        if (segundos >= 0 && segundos < 60) {

            this.segundos = segundos;

        } else {

            this.segundos = 0;

        }

        ajustarHora();

    }


    public int getMinutos() {

        return minutos;

    }


    public void setMinutos(int minutos) {

        if (minutos >= 0 && minutos < 60) {

            this.minutos = minutos;

        } else {

            this.minutos = 0;

        }

        ajustarHora();

    }


    public int getHoras() {

        return horas;

    }


    public void setHoras(int horas) {

        if (horas >= 0 && horas < 24) {

            this.horas = horas;

        } else {

            this.horas = 0;

        }

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