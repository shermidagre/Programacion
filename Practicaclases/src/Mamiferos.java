public abstract class Mamiferos extends Animal {

    public Mamiferos(String Nome,int idade) {

        super(Nome,idade); // Traemos gett y sett de super

    }
    @Override
    public void desprazarse () {

    }
    public void mamar(){
        System.out.println(getNome()+"esta mamando");
    }

        public abstract boolean parir();

}