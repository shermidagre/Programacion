
public abstract class PuntoAbstracto {

    private double x;

    private double y;


    // Constructor por defecto

    public PuntoAbstracto() {

        x = 0;

        y = 0;

    }

    // Métodos getter y setter

    public double getX() {

        return x;

    }


    public void setX(double x) {

        if (x >= 0) {

            this.x = x; // Asignar a la variable de instancia

        } else {

            this.x = 0; // Asignar 0 a la variable de instancia

        }

    }


    public double getY() {

        return y;

    }

    public void setY(double y) {

        if (y >= 0) {

            this.y = y; // Asignar a la variable de instancia

        } else {

            this.y = 0; // Asignar 0 a la variable de instancia

        }

    }
    public int aCadea(){
return 0;
    }

}
