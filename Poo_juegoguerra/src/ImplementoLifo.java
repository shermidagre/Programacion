public class ImplementoLifo extends Lista2 implements Lifo {

    public ImplementoLifo() {
        super();
    }

    @Override
    public void apilar(int novo) {
        engadirUltimo(novo);
    }

    @Override
    public int desapilar() {

       int valor = getNode(getTamaño()-1);

       eliminarultimo();

       return valor;
    }

}
