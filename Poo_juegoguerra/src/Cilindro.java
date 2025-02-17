public class Cilindro extends Punto {
    //declaración de propiedades
    private double radio;

    //CONSTRUCTOR
    //Para definir al constructor necesitamos los variables de la superclase "Punto"
    public Cilindro (double x, double y, double r){

        super (x, y); //inicializa una superclase, hace referencia a la clase que hereda --> this.Punto(x,y)

        radio = r; // ¡OJO VA A DAR ERROR DE HERENCIA! Una buena técnica, que evita problemas es usar get y set (esto es una práctica)

    }//end constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
