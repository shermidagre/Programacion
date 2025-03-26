public abstract class Vehiculosaereos extends Vehiculos implements  Transportemercancias{

    public Vehiculosaereos(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion) {

        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);

    }

    public void prezoUso(int horas, int combustible, int enerxia, int combustion, int cantidadamas) {
    }

    @Override
    public String introducirDireccionDestino() {
        return Transportemercancias.super.introducirDireccionDestino()+"";
    }
}
