public class Barcosauxiliares extends Barcos implements CamaraFrigorifica{

    public Barcosauxiliares(int metroseslora, int toneladascarga, String calado, double potencia, int velocidade, int consumo, int nome, String matricula, int tripulantes) {
        super(metroseslora, toneladascarga, calado, potencia, velocidade, consumo, nome, matricula, tripulantes);
    }

    // Boolean para el caso de que tengan fuel o no

    boolean fuel (int capacidade){

        boolean tienenfuel;

        if (tienenfuel = true){
            System.out.println("Tienen fuel y su capacidad es" + capacidade);
            capacidade++;
        }
        else {
            System.out.println("No tienen fuel");
            capacidade =0;
            return false;
        }
        return fuel(capacidade);
    }

        void asisten(){

            System.out.println("Estan axudando aos barcos extractores");

        }

        void recollenpesca(){

            System.out.println("Estan recollendo pesca en altamar");

    }

    // Camara frigorifica

    @Override
    public boolean tienencamarafrigorifica(boolean camara) {
        return CamaraFrigorifica.super.tienencamarafrigorifica(camara);
    }

    // Calculo de consumo

    @Override
    public void CalculoCosteConsumo(int dias, float euros, float litro) {
        super.CalculoCosteConsumo(dias, euros, litro);
    }

    // aCadea

    public String aCadea() {
        return  super.aCadea();
    }



}
