public class Node {
    private int  valor ;
    private Node nodoSeguinte;

    public Node(int valor, Node nodoSeguinte){
        setValor(valor);
        setNodoSeguinte(nodoSeguinte);

    }//end Lista2

    //GETTERS Y SETTERS
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }

    public void setNodoSeguinte(Node nodoSeguinte){
        this.nodoSeguinte = nodoSeguinte;
    }

    public Node  getNodoSeguinte(){
        return nodoSeguinte;
    }


}//end class