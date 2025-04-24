public class Main {
    public static void main(String[] args){

        contenedor<Integer> num = new contenedor<>();
        num.guardar(5);
        System.out.println(num.extraer());


        // Ejemplo con Strings
        String[] array1 = {"Rojo", "Azul", "Verde"};
        String[] array2 = {"Amarillo", "Naranja"};

        Arrays<String> gestorStrings = new Arrays<>(array1, array2);
        String[] arrayFusionadoStrings = gestorStrings.fusionarArrays();

        System.out.println("Array fusionado (Strings):");
        for (String elemento : arrayFusionadoStrings) {
            System.out.println(elemento);
        }

        // Ejemplo con Integers
        Integer[] array3 = {1, 2, 3};
        Integer[] array4 = {4, 5, 6};

        Arrays<Integer> gestorIntegers = new Arrays<>(array3, array4);
        Integer[] arrayFusionadoIntegers = gestorIntegers.fusionarArrays();

        System.out.println("\nArray fusionado (Integers):");
        for (Integer elemento : arrayFusionadoIntegers) {
            System.out.println(elemento);
        }
    }
}
