public class ImplementacionCola extends Lista2 implements Cola{
    public ImplementacionCola (Node NodoInicial) {
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

        int valor =  getNode(0);
        eliminarprimeiro();
        return novo;

    }




}

