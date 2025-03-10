public class Can extends Mamiferos implements Comunicacion{

    public Can(String Nome, int idade) {
        super(Nome, idade);
    }

    @Override
    public boolean parir() {
        return false;
    }

    @Override
    public void mamar() {
        super.mamar();
    }

    @Override
    public void desprazarse() {
        super.desprazarse();
    }

    public void voz(){
        System.out.println("Guau");
    }

    public boolean ronroneo (){
        System.out.println("umm");
        return true;
    }
}
