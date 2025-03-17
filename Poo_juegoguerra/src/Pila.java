public class Pila extends Lista2 implements Cola{
    public Pila (Node NodoInicial) {
        super(NodoInicial);
    }
    @Override
    public void encolar(int novo) {
        super.engadirUltimo(novo);
        System.out.println("Elemento " + novo + " engadido");
        System.out.println("Tamaño da pila: " + super.getTamaño());
    }

    @Override
    public int desencolar(int novo) {

        return 0;
    }


}

