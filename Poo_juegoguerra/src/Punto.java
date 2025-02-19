
public class Punto {

    private double x;

    private double y;


    // Constructor por defecto

    public Punto() {

        x = 0;

        y = 0;

    }


    // Constructor que acepta un solo valor (double)

    public Punto(double w) {

        x = w;

        y = w;

    }


    // Constructor que acepta un solo valor (int)

    public Punto(int w) {

        x = (double) w; // Convertir a double

        y = (double) w; // Convertir a double

    }


    // Constructor que acepta dos valores (double)

    public Punto(double w, double y) {

        this.x = w; // Asignar correctamente

        this.y = y; // Asignar correctamente

    }


    // Constructor que acepta dos valores (int)

    public Punto(int w, int y) {

        this.x = (double) w; // Convertir a double

        this.y = (double) y; // Convertir a double

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

}
