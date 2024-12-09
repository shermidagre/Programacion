 class ComparacionArraysElementos {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};

        int[] array2 = {1, 2, 3, 4};

        int[] array3 = {1, 2, 4, 3};


        System.out.println("array1 y array2 son iguales: " + sonArraysIguales(array1, array2)); // true

        System.out.println("array1 y array3 son iguales: " + sonArraysIguales(array1, array3)); // false

    }


    public static boolean sonArraysIguales(int[] array1, int[] array2) {

        // Primero, comprobar si los arrays tienen la misma longitud

        if (array1.length != array2.length) {

            return false; // Si tienen diferente longitud, no son iguales

        }


        // Comparar elemento a elemento

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != array2[i]) {

                return false; // Si algún elemento es diferente, no son iguales

            }

        }


        return true; // Todos los elementos son iguales

    }

}
