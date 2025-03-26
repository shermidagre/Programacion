public class BarcosExtractores extends  Barcos implements  CamaraFrigorifica {

    public BarcosExtractores(int metroseslora, int toneladascarga, String calado, double potencia, int velocidade, int consumo, int nome, String matricula, int tripulantes) {
        super(metroseslora, toneladascarga, calado, potencia, velocidade, consumo, nome, matricula, tripulantes);
    }

    // Camara frigorifica

    @Override
    public boolean tienencamarafrigorifica(boolean camara) {
        return CamaraFrigorifica.super.tienencamarafrigorifica(camara);
    }

    // Calculo del consumo

    @Override
    public void CalculoCosteConsumo(int dias, float euros, float litro) {
        super.CalculoCosteConsumo(dias, euros, litro);
    }

    // Boolean para que en el caso de que tengan camara conxeladora non poidan ter frigorifica e vicerversa

    boolean camaraconxeladora(boolean camara) {

        if (tienencamarafrigorifica(camara = false)){
            System.out.println("Tienen camara congelada");
            return true;
        }
         else
             return tienencamarafrigorifica(camara);

    }

    // aCadea

    public String aCadea() {
        return  super.aCadea();
    }


}
