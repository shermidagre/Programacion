public class Arrays<T> implements Fusionararrays <T> {

    private T[] array1;
    private T[] array2;

    public Arrays(T[] array1, T[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    @Override
    public T[] fusionarArrays() {
        @SuppressWarnings("unchecked")
        T[] resultado = (T[]) java.lang.reflect.Array.newInstance(
                array1.getClass().getComponentType(), array1.length + array2.length);

        System.arraycopy(array1, 0, resultado, 0, array1.length);
        System.arraycopy(array2, 0, resultado, array1.length, array2.length);

        return resultado;
    }

}
