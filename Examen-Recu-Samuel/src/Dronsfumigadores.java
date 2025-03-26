public class Dronsfumigadores extends Vehiculosaereos{

    public Dronsfumigadores(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion);
    }

    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, int cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);

        cantidadamas = 2;
    }
}
