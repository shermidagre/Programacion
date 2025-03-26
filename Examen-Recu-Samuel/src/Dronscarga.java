public class Dronscarga extends Vehiculosaereos{
    double kg;
    double capacidadmaxima;
    public Dronscarga(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, double kg, double capacidadmaxima, double bandadealtura, double voo) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion, bandadealtura,voo);
        this.kg = kg;
        this.capacidadmaxima = capacidadmaxima;
    }


    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);
        cantidadamas = 1*kg;
    }

    @Override
    public String introducirDireccionDestino() {
        return super.introducirDireccionDestino()+"A direcion de destino dos drons de carga e: ";
    }

    @Override
    public String aCadea() {
        return super.aCadea()+ " A capacidade maxima e "+ capacidadmaxima + " e esta levando " + kg;
    }
}
