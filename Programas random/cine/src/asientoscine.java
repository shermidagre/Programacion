public class asientoscine {
    public static void main(String[] args) {
        /*
        boolean[][]asentos;
        asentos = new boolean [4][4];
        asentos[0][0] = true;
        asentos[0][1] = true;
        asentos[0][2] = false;
        asentos[0][3] = true;
        asentos[1][0] = false;
        asentos[1][1] = true;
        asentos[1][2] = true;
        asentos[1][3] = false;
        asentos[2][0] = false;
        asentos[2][1] = true;
        asentos[2][2] = false;
        asentos[2][3] = false;
        asentos[3][0] = false;
        asentos[3][1] = false;
        asentos[3][2] = false;
        asentos[3][3] = false;
        */

        boolean[][] asentos = {{true, true, false, true},
                {false, true, true, false},
                {false, true, false, false},
                {false, false, false, false}};

        for (int fila = 0; fila < asentos.length; fila++) {

            for (int columna = 0; columna < asentos[0].length; columna++) {

                if (asentos[fila][columna] == true) {
                    System.out.print("o");
                } else {
                    System.out.print("l");
                }
            }
            System.out.print("\n");
        }
    }
}



