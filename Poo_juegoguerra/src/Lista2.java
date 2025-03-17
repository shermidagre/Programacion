public class Lista2 {
    private Node nodoInicial;
    private int tamaño;

    /*
    A partir de un nodo vacío
     */
    public Lista2(){
        this.nodoInicial = null; //inicializamos el nodo inicial a null
        tamaño = 0; //inicializamos el tamaño a 0
    }//end Lista2

    /*
     *A partir de un nodo inicial
     */
    public Lista2(Node nodoInicial){
        this.nodoInicial = nodoInicial;
        tamaño = 1;
    }//end Lista2


    //MÉTODOS
    public int getTamaño(){
        return tamaño;
    }

    /**
     * Verifica si la lista está valeira ou non
     * @return valeira ou non
     */
    public boolean estaValeira(){
        if (nodoInicial == null){
            System.out.println("A lista está valeira");
            return true;
        }//end if
        else{
            System.out.println("A lista non está valeira");
            return false;
        }//end else
    }//end estaValeira


    /**
     * Engade un nodo ao final da lista
     */

    public void engadirUltimo(int nValor){

        Node novoNode = new Node(nValor, null); //añadimos un nuevo valor al nodo
        if(estaValeira()==true){ //entonces como la lista está vacía el nodo inicial será el nuevo nodo e aumentará el tamaño de null a 1

            nodoInicial = novoNode; // declaramos el nodo inicial como nuevo node para asi poder declararlo mas tarde
            tamaño++;

        }//end if
        else{
            Node nodoActual = nodoInicial; // Dado el nodo actual lo declaramos como el inical

            while (nodoActual.getNodoSeguinte() != null){ // si el siguiente valor no es null pasamos al siguiente nodo
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

        Node novoNode = new Node(nValor, nodoInicial); //añadimos un nuevo valor al nodo
        if(estaValeira()==true){ //entonces como la lista está vacía el nodo inicial será el nuevo nodo e aumentará el tamaño de null a 1
            nodoInicial = novoNode;
            tamaño++;
        }
        else{
            nodoInicial = novoNode;
        }//end engadirPrimeiro
    }

    /**
     * Recorre todos los valores y los muestra
     */

    public void listar(){

        Node nodoActual = nodoInicial;
        while (nodoActual!=null){
            System.out.print(nodoActual.getValor() + " -> ");
            nodoActual = nodoActual.getNodoSeguinte();
        }
        System.out.println("null");

    }//end listar

    /**
     * Obtiene el valor del último nodo
     */

    public  void obterUltimo(){

        if(estaValeira()==false){
            System.out.println("A lista non está valeira");
            return;
        }
        Node nodoActual = nodoInicial;
        while (nodoActual.getNodoSeguinte()!=null){
            nodoActual = nodoActual.getNodoSeguinte();
        }
        System.out.println("Valor do último nodo: " + nodoActual.getValor());

    }

    /**
     * Obtiene en valor del primero nodo
     */

    public void obterPrimeiro(){

        if(estaValeira()==false){
            System.out.println("A lista non está valeira");
            return;
        }
        System.out.println("Valor do primeiro nodo: " + nodoInicial.getValor());

    }

    /**
     * Elimina un nodo específico
     */

    public void eliminar(int nValor){

        if(estaValeira()==false){
            System.out.println("A lista non está valeira");
            return;
        }

        if(nodoInicial.getValor()==nValor){
            nodoInicial = nodoInicial.getNodoSeguinte();
            tamaño--;
            return;
        }
        //Caso general: nodo inicial a eliminar no es el único
        Node nodoActual = nodoInicial;
        while (nodoActual.getNodoSeguinte()!=null && nodoActual.getNodoSeguinte().getValor()!=nValor){
            nodoActual = nodoActual.getNodoSeguinte();
        }

        //Si el nodo no existe, no hacemos nada
    }

}//end class
//end Lista2