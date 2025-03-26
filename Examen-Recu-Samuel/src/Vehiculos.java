import java.util.Scanner;
public class Vehiculos implements PrezuUso{

    int autonomia;
    int velocidademaxima;
    double consumo;
    String tecnoloxiademovilizacion;
    int matricula;
    int numeroautorizacion;

    public Vehiculos(int autonomia, int velocidademaxima, double consumo, String tecnoloxiademovilizacion, int matricula, int numeroautorizacion) {

        this.autonomia = autonomia;
        this.velocidademaxima = velocidademaxima;
        this.consumo = consumo;
        this.tecnoloxiademovilizacion = tecnoloxiademovilizacion;
        this.matricula = matricula;
        this.numeroautorizacion = numeroautorizacion;


    }

    // Getters y setters


    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(int velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getTecnoloxiademovilizacion() {
        return tecnoloxiademovilizacion;
    }

    public void setTecnoloxiademovilizacion(String tecnoloxiademovilizacion) {
        this.tecnoloxiademovilizacion = tecnoloxiademovilizacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumeroautorizacion() {
        return numeroautorizacion;
    }

    public void setNumeroautorizacion(int numeroautorizacion) {
        this.numeroautorizacion = numeroautorizacion;
    }

    // Metodos a implementar
    @Override
    public void prezoUso( int horas, int combustible, int enerxia, int combustion, double cantidadamas) {
         double total =consumo/horas * enerxia/combustible * cantidadamas;
    }
    
    
     void teñentipo() {

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Especificame si quieres saber si es electrico(1) o a combustion(2), se non queres especificar pulsa 0");
        int result = entradaTeclado.nextInt();

        while (result == 0) {

        }
        if (result == 1) {
            System.out.println("Es un coche electrico");
        }

        if (result == 2) {
            System.out.println("Es un coche a combustion");
        }
    }

    void calculoCusteViaxe(double enerxiacombustible, double horasdistancia) {

    }
        public String aCadea(){
        return "Estas son as suas caracteristicas";
    }

}




