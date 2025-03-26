
public class Vehiculoautonomo extends Vehiculosterrestres{

    double volumenmaleterio;
    double persoas;
    public Vehiculoautonomo(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, double capacidade,double volumenmaleterio, double persoas) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion, capacidade);
        this.volumenmaleterio = volumenmaleterio;
        this.persoas = persoas;
    }

    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);

        cantidadamas = 1.2 * persoas;
    }

    @Override
    public String introducirDireccionDestino() {
        return super.introducirDireccionDestino()+"A direccion de destino de vehiculo autonomo e: ";
    }

    @Override
    public String aCadea() {
        return super.aCadea()+ " o volumen do maleteiro e "+ volumenmaleterio + " e o numero de persoas e "+ persoas;
    }
}
