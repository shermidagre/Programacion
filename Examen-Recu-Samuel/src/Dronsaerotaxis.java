public class Dronsaerotaxis extends Vehiculosaereos{
    double volumenmaleteiro;
    int viaxeiros;

    public Dronsaerotaxis(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, int viaxeiros, double volumenmaleteiro, double bandadealtura, double voo) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion, bandadealtura, voo);
        this.viaxeiros = viaxeiros;
        this.volumenmaleteiro = volumenmaleteiro;
    }

    @Override
    void calculoCusteViaxe(double enerxiacombustible, double horasdistancia) {
        super.calculoCusteViaxe(enerxiacombustible, horasdistancia);
    }

    @Override
    void teñentipo() {
        super.teñentipo();
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

    @Override
    public String aCadea() {
        return super.aCadea()+" estan levando a "+viaxeiros+ " e o volumen do maleteiro e" + volumenmaleteiro;
    }
}
