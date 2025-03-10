public abstract class Armadillo extends Animal {

    public Armadillo(String Nome,int idade) {

        super(Nome,idade); // Traemos gett y sett de super

    }
    @Override
    public void desprazarse () {

    }

    public void Rodar(double velocidade,double metros){

        double distancia=velocidade*metros;

        System.out.println(getNome()+"Esta rodando e a sua distancia recorrida e: "+distancia);
    }
}