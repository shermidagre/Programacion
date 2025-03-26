public class Dronscarga extends Vehiculosaereos{
    int kg;
    public Dronscarga(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, int kg) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);
        this.kg = kg;
    }


    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, int cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);
        cantidadamas = 1*kg;
    }

    @Override
    public String introducirDireccionDestino() {
        return super.introducirDireccionDestino()+"A direcion de destino dos drons de carga e: ";
    }
}
