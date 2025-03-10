public abstract class Delfin extends Animal {

    public Delfin(String Nome,int idade) {

        super(Nome,idade); // Traemos gett y sett de super

    }
            @Override
            public void desprazarse () {

            }

            public void Nadar(double velocidade,double metros){

                double distancia=velocidade*metros;

                System.out.println(getNome()+"Esta nadando e a sua distancia e: "+distancia);
            }

}