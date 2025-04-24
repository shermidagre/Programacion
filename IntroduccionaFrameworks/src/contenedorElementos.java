import java.lang.reflect.Array;
import java.util.Arrays;

public class contenedorElementos<T> implements Pila<T> {

    private T[] obxectos;

    public contenedorElementos(T[] obxectos) {
        this.obxectos = obxectos;
    }

    public void apilar(T novo) {
        obxectos = Arrays.copyOf(obxectos, obxectos.length);
        obxectos[obxectos.length - 1] = novo;
    }

    @Override
    public T desapilar() {
        return null;
    }

    public T desapìlar() {
        T res = null;

        if (obxectos.length > 0) {
            res = obxectos[obxectos.length - 1];
            obxectos = Arrays.copyOf(obxectos, obxectos.length);
        }
        return res;
    }


}
