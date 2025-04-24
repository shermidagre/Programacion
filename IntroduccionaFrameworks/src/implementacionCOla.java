import java.util.ArrayList;
import java.util.Arrays;

public class implementacionCOla<T> implements Cola<T>{

    private ArrayList<T> obxectos;

    public implementacionCOla() {
        this.obxectos = new ArrayList<> ();
    }
    @Override
    public void encolar(T novo) {
        obxectos.add(novo);
    }

    @Override
    public T desencolar() {
        T res = null;

        if (obxectos.isEmpty()) {
            return res;
        }
        return  obxectos.remove(0);
    }
}
