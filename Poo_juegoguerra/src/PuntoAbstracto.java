
public abstract class PuntoAbstracto {

    private double x;

    private double y;


    // Constructor por defecto

    public PuntoAbstracto(double x, double y) throws ExcepcionPuntoForaDoPrimeiroCadrante{

        setX(x);

        setY(y);

    }

    // Métodos getter y setter

    public double getX() {

        return x;

    }


    public void setX(double x) throws ExcepcionPuntoForaDoPrimeiroCadrante {

        if (x >= 0.0) {

            this.x = x; // Asignar a la variable de instancia

        } else {

            throw new ExcepcionPuntoForaDoPrimeiroCadrante();

        }

    }


    public double getY() {

        return y;

    }

    public void setY(double y) throws ExcepcionPuntoForaDoPrimeiroCadrante {

        if (y >= 0) {

            this.y = y; // Asignar a la variable de instancia

        } else {

            throw new ExcepcionPuntoForaDoPrimeiroCadrante();

        }

    }
    public int aCadea(){
return 0;
    }

}
