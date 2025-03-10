public  class Reptil extends Animal implements Son{

    public Reptil(String Nome,int idade) {

        super(Nome,idade); // Traemos gett y sett de super

    }

    @Override
    public void desprazarse () {

    }

    public String tipoSon="";


    @Override
    public void voz() {

    }
}