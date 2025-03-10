public class Cubo extends Solido{

    private double lado;

    public Cubo(){
        super();
        lado=0;
    }
    public Cubo(double x, double y){
        super(x,y);
        setLado(lado);

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double ladp) {
        this.lado = Math.abs(lado);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado,3);
    }

}
