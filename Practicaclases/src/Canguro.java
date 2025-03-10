public class Canguro extends Mamiferos implements Son{

    private boolean eshuevo;

    public Canguro(String Nome, int idade, boolean eshuevo) {

        super(Nome, idade); // Traemos gett y sett de super

        this.eshuevo=eshuevo;

    }

    @Override
    public void desprazarse() {

    }

    @Override
    public void mamar() {
        super.mamar();
    }

    @Override
    public boolean parir() {

        return eshuevo;

    }

    @Override
    public void voz() {

        System.out.println("Mamañema");

    }

}
