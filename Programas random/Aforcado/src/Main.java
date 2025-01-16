import java.util.Scanner;
 class Aforcado {

     public static void main (String [] args) {
         String palabraAdivinhar = solicitaPalabra();
         String cadeaGuions = cadeaGuions(palabraAdivinhar);
         int contfa = 0;
         int ronda = 0;
         boolean acerto = false;
         String letraOuPalabra;
         Scanner sc = new Scanner(System.in);
         do {
             System.out.println("A palabra a adiviñar é: " + cadeaGuions);
             System.out.println("Xogador 2: introduce a palabra ou letra a adiviñar");
             letraOuPalabra = sc.nextLine();
             if (letraOuPalabra.length() > 1) {
                 if (letraOuPalabra.equals(palabraAdivinhar)) acerto = true;
                 else System.out.println("A palabra non é correcta");
             } else {
                 cadeaGuions = comprobarLetrasEnPalabra(cadeaGuions, letraOuPalabra, palabraAdivinhar);
                 if (cadeaGuions.equals(palabraAdivinhar)) acerto = true;
                 else System.out.println("A letra non e correcta");
                 contfa ++;
             }
             if(contfa==1) System.out.println("Llevas un total de "+ contfa +"fallo");
             if(contfa==2) System.out.println("LLevas un total de"+contfa+"fallos");
             ronda++;

         } while (ronda < 7 && acerto == false);
         if (acerto) System.out.println("Felicidades acertaches a palabra: " + palabraAdivinhar);
         else System.out.println("Mágoa, non acertaches. A palabra era " + palabraAdivinhar);
         System.out.println("__");
         System.out.println(" | ");
         System.out.println(" O ");
         System.out.println("/|\\");
         System.out.println("/ \\");
     }

    public static String solicitaPalabra(){
        String palabra;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Xogador1: Escribe a palabra a adiviñar");
            palabra = sc.nextLine();
            palabra = palabra.trim();
        } while (palabra.isEmpty()) ;
        return palabra;
    }
    public static String cadeaGuions (String palAdivinhar){
        String cadGuions = "";
        for (int i=0; i<palAdivinhar.length(); i++){
            cadGuions = cadGuions + '_';
        }
        return cadGuions;
    }
    public static String comprobarLetrasEnPalabra(String cadGuions, String letra, String palabra){
        char [] charsGuions = cadGuions.toCharArray();
        int inicio = 0, i;
        do{
            i = palabra.indexOf(letra, inicio);
            if (i>=0) {
                charsGuions[i] = palabra.charAt(i);
                inicio = i+1;
            }
        } while (i>=0 && i<palabra.length()-1);
        return new String (charsGuions);
    }
}
