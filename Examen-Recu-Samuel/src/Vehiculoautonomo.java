import java.util.Scanner;

public class Vehiculoautonomo extends Vehiculosterrestres{

    double volumenmaleterio;
    int num;
    public Vehiculoautonomo(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, int capacidade,double volumenmaleterio) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion, capacidade);
        this.volumenmaleterio = volumenmaleterio;
    }

    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);

        cantidadamas = 1 * num;
    }

    @Override
    public String introducirDireccionDestino() {
        return super.introducirDireccionDestino()+"A direccion de destino de vehiculo autonomo e: ";
    }

    @Override
    public String aCadea() {
        return super.aCadea();
    }
}
