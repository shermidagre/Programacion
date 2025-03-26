public class Quadpaqueteria extends Vehiculosterrestres{

    int paquete;

    public Quadpaqueteria(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion,int capacidad, int paquete) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion, capacidad);
        this.paquete = paquete;
    }
    public static  void cuantospaquetesson(){

    }
    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);
        cantidadamas = 1 * paquete;
    }

    @Override
    public String introducirDireccionDestino() {
        return super.introducirDireccionDestino()+" A direccion de destino do quad de paqueteria e: ";
    }

    @Override
    public String aCadea() {
        return super.aCadea();
    }

}
