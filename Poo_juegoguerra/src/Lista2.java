import java.util.Scanner;


public class Lista2 {
    Node nodoInicial;
    private int tamaño;

    /*
    A partir de un nodo vacío
     */
    public Lista2() {
        this.nodoInicial = null; //inicializamos el nodo inicial a null
        tamaño = 0; //inicializamos el tamaño a 0
    }//end Lista2

    /*
     *A partir de un nodo inicial
     */
    public Lista2(Node nodoInicial) {
        this.nodoInicial = nodoInicial;
        tamaño = 1;
    }//end Lista2


    //MÉTODOS
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Verifica si la lista está valeira ou non
     *
     * @return valeira ou non
     */
    public boolean estaValeira() {
        if (nodoInicial == null) {
            System.out.println("A lista está valeira");
            return true;
        }//end if
        else {
            System.out.println("A lista non está valeira");
            return false;
        }//end else
    }//end estaValeira


    /**
     * Engade un nodo ao final da lista
     */

    public void engadirUltimo(int nValor) {

        Node novoNode = new Node(nValor, null); //añadimos un nuevo valor al nodo
        if (estaValeira() == true) { //entonces como la lista está vacía el nodo inicial será el nuevo nodo e aumentará el tamaño de null a 1

            nodoInicial = novoNode; // declaramos el nodo inicial como nuevo node para asi poder declararlo mas tarde
            tamaño++;

        }//end if
        else {
            Node nodoActual = nodoInicial; // Dado el nodo actual lo declaramos como el inical

            while (nodoActual.getNodoSeguinte() != null) { // si el siguiente valor no es null pasamos al siguiente nodo
                nodoActual = nodoActual.getNodoSeguinte();
            }//end while

            nodoActual.setNodoSeguinte(novoNode);
            tamaño++;


        }//end else

    }//end engadirUltimo


    /**
     * Engade un nodo ao principio da lista
     */
    public void engadirPrimeiron(int nValor) {

        Node novoNode = new Node(nValor, this.nodoInicial); //añadimos un nuevo valor al nodo
        if (estaValeira() == true) { //entonces como la lista está vacía el nodo inicial será el nuevo nodo e aumentará el tamaño de null a 1
            nodoInicial = novoNode;
            tamaño++;
        } else {
            nodoInicial = novoNode;
            for (int i = 0; i < nValor; i++) {
                novoNode = novoNode.getNodoSeguinte();
                tamaño++;
                if (i == nValor - 1) {
                    novoNode.setNodoSeguinte(this.nodoInicial); // En caso de que sea -1 vuelve a nodo inicial
                }
            }
        }//end engadirPrimeiro
    }

    /**
     * Recorre todos los valores y los muestra
     */

    public void listar() {

        Node nodoActual = nodoInicial;
        while (nodoActual != null) {
            System.out.print(nodoActual.getValor() + " -> ");
            nodoActual = nodoActual.getNodoSeguinte();
        }
        System.out.println("null");

    }//end listar

    /**
     * Obtiene el valor del último nodo
     *
     * @return
     */

    public boolean obterUltimo() {

        if (estaValeira() == false) {
            System.out.println("A lista non está valeira");
        }
        Node nodoActual = nodoInicial;
        while (nodoActual.getNodoSeguinte() != null) {
            nodoActual = nodoActual.getNodoSeguinte();
        }
        System.out.println("Valor do último nodo: " + nodoActual.getValor());

        return true;
    }

    /**
     * Obtiene en valor del primero nodo
     */

    public void obterPrimeiro() {
        if (estaValeira() == false) {
            System.out.println("A lista non está valeira");
            return;
        }
        System.out.println("Valor do primeiro nodo: " + nodoInicial.getValor());
    }
    /**
     * Elimina un nodo específico
     */

    public void eliminarNodo(int nValor) {
        if (estaValeira() == false) {
            System.out.println("A lista non está valeira");
            return;
        }
        if (nodoInicial.getValor() == nValor) {
            nodoInicial = nodoInicial.getNodoSeguinte();
            tamaño--;
            return;
        }
        Node nodoActual = nodoInicial;
        while (nodoActual.getNodoSeguinte()!= null && nodoActual.getNodoSeguinte().getValor()!= nValor) {
            nodoActual = nodoActual.getNodoSeguinte();
        }
        if (nodoActual.getNodoSeguinte()!= null) {
            nodoActual.setNodoSeguinte(nodoActual.getNodoSeguinte().getNodoSeguinte());
            tamaño--;
        }
    }

    public void eliminarprimeiro() {

        if (estaValeira() == false) {
            System.out.println("A lista non está valeira");
            nodoInicial = nodoInicial.getNodoSeguinte();
            tamaño --;
            System.out.println("O nodo inicial pasa a ser :" + nodoInicial);
        }
        else
            System.out.println(" A lista esta valeira ");

    }//end class

    public void eliminarultimo() {

        if (!estaValeira()) {
            Node nodoAnterior = null;
            if (tamaño != 1) {
                Node nodoActual = nodoInicial;

                while (nodoActual.getNodoSeguinte() !=null ){
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.getNodoSeguinte();
                }
                nodoAnterior.setNodoSeguinte(null);
            }
        }
        else{
                nodoInicial=null;
        }
        tamaño --;
    }//end class
    public void mostrarvalores(){
        if (!estaValeira()){
            if(tamaño !=1){
                Node nodoActual = nodoInicial;
                while (nodoActual.getNodoSeguinte()!= nodoActual){
                    System.out.println(nodoActual.getValor());
                   nodoActual = nodoActual.getNodoSeguinte();
                }
                System.out.println(nodoInicial.getValor());
                System.out.println(nodoActual.getValor());
            }
        }
    }
    public void obternelemento(){
        Scanner teclado = new Scanner(System.in);
        if (!estaValeira()){
            if(tamaño !=1){
                Node nodoActual = nodoInicial;
                while (nodoActual.getNodoSeguinte() != nodoActual ) {

                    System.out.println("Los valores de este nodo son : " + nodoActual.getValor());

                }

                System.out.println("Deseas cambiar algun valor si es si pulsa 1 si es no pulsa 0?");

                int numero = teclado.nextInt();

                switch (numero){
                    case 1:
                        System.out.println("Introduce el nuevo valor para este nodo");
                        int nuevoValor = teclado.nextInt();
                        System.out.println("En que posicion lo quieres implementar? La lista de nodos empieza desde la posicion 0");

                        nodoActual.setValor(nuevoValor);
                        break;
                    case 0:
                        System.out.println("No has cambiado el valor");
                        break;
                    default:
                        System.out.println("Introduce un numero correcto");
                }
                teclado.close();
            }

            else{
                System.out.println("La lista esta vacia");
            }
        }
    }
    public int getNode (int indice){
        if ( indice > tamaño){
            System.out.println("indice no valido voltamos -1");
            return -1;
        }
        else {
            Node nodoActual = nodoInicial;
            for (int i = 0; i>indice; i++){

                nodoInicial = nodoInicial.getNodoSeguinte();
                System.out.println("El valor del nodo en la posicion " + indice + " es : " + nodoActual.getValor());

            }
            return nodoActual.getValor();
        }
    }
}//end Lista2