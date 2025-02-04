public class ComparacionArraysObjetos {

    public static void main(String[] args) {

        String[] array1 = {"Hola", "Mundo"};

        String[] array2 = {"Hola", "Mundo"};

        String[] array3 = {"Mundo", "Hola"};


        System.out.println("array1 y array2 son iguales: " + sonArraysIguales(array1, array2)); // true

        System.out.println("array1 y array3 son iguales: " + sonArraysIguales(array1, array3)); // false

    }


    public static boolean sonArraysIguales(String[] array1, String[] array2) {

        // Primero, comprobar si los arrays tienen la misma longitud

        if (array1.length != array2.length) {

            return false; // Si tienen diferente longitud, no son iguales

        }


        // Comparar elemento a elemento

        for (int i = 0; i < array1.length; i++) {

            if (!array1[i].equals(array2[i])) { // Usar equals() para comparar Strings.strings

                return false; // Si algún elemento es diferente, no son iguales

            }

        }


        return true; // Todos los elementos son iguales

    }

}
