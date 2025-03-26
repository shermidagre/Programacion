public abstract class Vehiculosaereos extends Vehiculos implements  Transportemercancias {

    double bandadealtura;
    double voo;

    public Vehiculosaereos(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, double bandadealtura, double voo) {

        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);

        this.bandadealtura = bandadealtura;
        this.voo = voo;
    }

    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
    }

    @Override
    public String introducirDireccionDestino() {
        return Transportemercancias.super.introducirDireccionDestino() + "";
    }

}
