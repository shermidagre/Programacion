
public class Main {
    public static void main(String[] args) {
        String[][] hotel = new String[4][6];
        asignomes(hotel,"Pepito",23);
        asignomes(hotel,"Juan",2);
        buscarhabitacion(hotel);
    }

    static void buscarhabitacion(String[][] h) {
   for(int i = h.length - 1; i >= 0; i--){
       System.out.println("");
       System.out.println("Planta"+(+1)+":");
       for(int j=0; j<h[i].length ;j++) {
           if (h[i][j] == null ) System.out.println((i+1)+""+(j+1)+":"+"Esta baleira ");
               else System.out.print ((i+1)+""+(j+1)+": "+ h[i][j] + " ");
       }
   }



    }

    static boolean asignomes(String[][] h, String cliente, int habitacion) {

        int numPlantas = h.length;
        int numHabitaciones = h[0].length;
        int i = (habitacion / 10) - 1; // i representa a planta onde se situa a habitacion
        int j = (habitacion % 10) - 1;//j representa a habitacion dentro da planta

        if (i < 0 || i >= numPlantas || j < 0 || j >= numHabitaciones) { //Comprobacion de la planta e habitacion
            System.out.println("A habitación " + habitacion + " non existe, porfavor " +cliente + " escolla outra habitacion");
            return false;
        } else  //Si la habitacion está libre y la planta existe, se reserva.

            if (h[i][j] != null) { //Comprobacion de la array de hotel
                System.out.println("La habitación " + habitacion + " ya está ocupada.Tentao nunha habitacion valeira");
                return false;
            } else {
                h[i][j] = cliente;
                System.out.println("A habitación " + habitacion + " foi reservada por " + cliente);
                return true;
            }

    }
    static void deixarhabitacion(){
        //Implementar codigo para deixar habitacion

    }
}