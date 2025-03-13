import DataHora.Data;
public class Main {
    public static void main(String[] args) {

        Traballadores Juan = new Traballadores("jadanakfnkwai5","Juanita","03/09/2008"){};

        Voluntarios Anita = new Voluntarios("ajkdadja", "Anita", "01/11/2798",18,"Actor",6);

        Socios Sandre = new Socios("adaji3","KANKRO","AOKDSA","APOKMDOA", "01/10/1344", 19);

        gastosIngresos asocAntiDrogas [] = new gastosIngresos [3];

        asocAntiDrogas[0]= pepita;

        double total = 0.0;

        for(gastosIngresos membro:asocAntiDrogas){
           total = total + membro.calcularGastosIngresos();
        }
        System.out.println("Saldo asociacion"+ total);

        Traballadores trab1;
        trab1 = Juan;
        trab1.getFecha();

        Data.class.toString();


    }
}