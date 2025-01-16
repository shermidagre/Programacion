import java.util.Scanner;
 class Aforcado {

     public static final String ANSI_GREEN = "\u001B[32m"; // Verde

     public static final String ANSI_RED = "\u001B[31m";   // Rojo

     public static final String ANSI_BLUE= "\u001B[34m"; // Azul

     public static final String ANSI_RESET = "\u001B[0m";  // Restablecer color

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
             if(contfa==1) System.out.println("Llevas "+ contfa +"fallo");
             System.out.println("Se ha quedado sin piernas");
             System.out.println("__");
             System.out.println(" | ");
             System.out.println(" O ");
             System.out.println("/|\\");
             System.out.println(ANSI_RED+"/ \\"+ANSI_RESET);
             System.out.println();
             ronda++;
             if(contfa==2) System.out.println("LLevas un total de"+contfa+"fallos");
             System.out.println("Se ha quedado sin los brazos");
             System.out.println(         "__");
             System.out.println(         " | ");
             System.out.println(         " O ");
             System.out.println(ANSI_RED+"/|\\"+ANSI_RESET);
             System.out.println(ANSI_RED+"/ \\"+ANSI_RESET);
             ronda++;
             if(contfa==3) System.out.println("LLevas un total de"+contfa+"fallos");
             System.out.println("Ya lo estas dejando tieso, se ha quedado sin pechito");
             System.out.println("__");
             System.out.println(" | ");
             System.out.println(ANSI_RED+" O "+ANSI_RESET);
             System.out.println(ANSI_RED+"/|\\"+ANSI_RESET);
             System.out.println(ANSI_RED+"/ \\"+ANSI_RESET);
             ronda++;
             if(contfa==4) System.out.println("LLevas un total de"+contfa+"fallos");
             System.out.println("Para un poco ya, esta te salvas");
             System.out.println("__");
             System.out.println(" | ");
             System.out.println(" 0 ");
             System.out.println(" | ");
             System.out.println(ANSI_RED+" O "+ANSI_RESET);
             System.out.println(ANSI_RED+"/|\\"+ANSI_RESET);
             System.out.println(ANSI_RED+"/ \\"+ANSI_RESET);
             ronda++;
             if(contfa==5) System.out.println("LLevas un total de"+contfa+"fallos");
             System.out.println("Pierde ya que el muñeco ya esta tieso");
             System.out.println("Ya lo estas dejando tieso, un brazo menos");
             System.out.println("__");
             System.out.println(" | ");
             System.out.println(" O ");
             System.out.println("/|\\");
             System.out.println("/ \\");
             ronda++;
             if(contfa==6) System.out.println("LLevas un total de"+contfa+"fallos");
             System.out.println("Lo has dejado solo con la cabez y ya la tiene explotada de dar html");
             System.out.println("Ya lo estas dejando tieso, un brazo menos");
             System.out.println("__");
             System.out.println(" | ");
             System.out.println(" O ");
             System.out.println("/|\\");
             System.out.println("/ \\");
             ronda++;
             if(contfa==7) System.out.println("Has perdido, tienes un total de"+contfa+"fallos, dejaste al muñeco tieso");
             System.out.println("Ha quedado tieso total parece la nunu de sandark");
             System.out.println("__");
             System.out.println(" | ");
             System.out.println(" O ");
             System.out.println("/|\\");
             System.out.println("/ \\");

         } while (ronda <= 6 && acerto == false);
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
