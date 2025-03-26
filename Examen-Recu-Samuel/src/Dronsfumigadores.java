public abstract class Dronsfumigadores extends Vehiculosaereos{

// Converti la clase a abstracta para asi poder diferenciarla por las tecnicas

    double capacidademax;

    public Dronsfumigadores(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion, double capacidademax, double bandadealtura, double voo) {
        super(autonomia, velocidademaxima, consumo, tecnoloxiademovilizacion, matricula, numeroautorizacion, bandadealtura,voo);
        this.capacidademax = capacidademax;
    }

    @Override
    void calculoCusteViaxe(double enerxiacombustible, double horasdistancia) {
        super.calculoCusteViaxe(enerxiacombustible, horasdistancia);
    }

    String tecnicas(String agricultura, String xardineria, String controlplagas){
         agricultura = "";
         xardineria = "";
         controlplagas = "";
         return null;
    }
    @Override
    void teñentipo() {
        super.teñentipo();
    }

    @Override
    public void prezoUso(int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
        super.prezoUso(horas, combustible, enerxia, combustion, cantidadamas);

        cantidadamas = 2;
    }

    @Override
    public String aCadea() {
        return new StringBuilder().append(super.aCadea()).append("tipo de funcion").append(tecnicas("haciendo agricultura", "haciendo xardineria", "tipo de funcion")).toString();
    }
}
