public class contenedor <T>{

    private T obxecto;
    public contenedor (){
    }

    void guardar (T novo){
        obxecto = novo;
    }

    T extraer(){
        T res = obxecto;
        obxecto = null;
        return res;
    }


}
