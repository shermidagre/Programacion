public class Dronsaerotaxis extends Vehiculosaereos{
    public Dronsaerotaxis(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);
    }

    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {

        super.prezoUso(horas, combustible, enerxia, combustion,cantidadamas);
        cantidadamas=10;

    }

    @Override
    public String introducirDireccionDestino() {
        return super.introducirDireccionDestino()+"A direccion de destino dos drons taxis e: ";
    }
}
