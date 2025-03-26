import java.util.Scanner;

public class Vehiculosterrestres extends Vehiculos implements Transportemercancias{

    int capacidade;


    // Super
    public Vehiculosterrestres(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, int capacidade) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);

        this.capacidade = capacidade;
    }

    void calcularcapacidade(int num){

    }

    @Override
    void calculoCusteViaxe(double enerxiacombustible, double horasdistancia) {
        super.calculoCusteViaxe(enerxiacombustible, horasdistancia);
    }

    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion,double cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion,cantidadamas);
    }

    @Override
    public String aCadea() {
        return super.aCadea()+ "";
    }

    @Override
    public String introducirDireccionDestino() {
        return Transportemercancias.super.introducirDireccionDestino()+"";
    }

}

