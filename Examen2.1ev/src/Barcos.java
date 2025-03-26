public class Barcos implements  Campañas{

    int metroseslora;
    int toneladascarga;
    String calado;
    double potencia;
    int velocidade;
    int consumo;
    int nome;
    String matricula;
    int tripulantes;
    public Barcos (int metroseslora, int toneladascarga, String calado, double potencia, int velocidade, int consumo, int nome, String matricula, int tripulantes ){

        this.calado= calado;
        this.nome =nome;
        this.consumo = consumo;
        this.toneladascarga = toneladascarga;
        this.metroseslora=metroseslora;
        this.matricula = matricula;
        this.tripulantes =tripulantes;
        this.potencia=potencia;
        this.velocidade=velocidade;

    }

    // Meto todos los valores en un string para asi luego poderlos llamar en aCadea

    String frase = "calado"+ calado + "Nome" + nome + "consumo" + consumo + "toneladas carga" + toneladascarga + "metros lora" + metroseslora + "matricula" + matricula + "tripulantes" + tripulantes + "potencia" + potencia + "velocidad" + velocidade ;


    // Metodo para realizar el calculo del consumo

    public void CalculoCosteConsumo(int dias, float euros, float litro){

       float diascampaña = euros /litro;

       float custemedio = litro/dias;

       float total = diascampaña * custemedio;


       System.out.println("Estuvo traballando " + dias + "dias e o custe do fuel foi " + total );

    }

    // Getters y setters

    public int getMetroseslora() {
        return metroseslora;
    }

    public void setMetroseslora(int metroseslora) {
        this.metroseslora = metroseslora;
    }

    public int getToneladascarga() {
        return toneladascarga;
    }

    public void setToneladascarga(int toneladascarga) {
        this.toneladascarga = toneladascarga;
    }

    public String getCalado() {
        return calado;
    }

    public void setCalado(String calado) {
        this.calado = calado;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {
        this.tripulantes = tripulantes;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    // Campaña

    @Override
    public void resultadoCampaña(int calidade, int valor, int tonelada) {
        Campañas.super.resultadoCampaña(calidade, valor, tonelada);
    }


    // aCadea

    public String aCadea(){
        return frase;
    }
}
