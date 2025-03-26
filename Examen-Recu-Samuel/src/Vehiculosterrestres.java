public class Vehiculosterrestres extends Vehiculos implements Transportemercancias{


    // Super
    public Vehiculosterrestres(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, double capacidade) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);

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
        return super.aCadea()+ "Estes son os vehiculos terrestres";
    }

    @Override
    public String introducirDireccionDestino() {
        return Transportemercancias.super.introducirDireccionDestino()+"";
    }

}

