public class Cilindro extends Circulo {

    private double radio;

    private double altura;

    public Cilindro(double x, double y, double r, double h) {

        super(x, y, r);

        setAltura(h);

    }


    // get y set

    public double getRadio() {

        return radio;

    }


    public void setRadio(double radio) {

        this.radio = radio;

    }


    public double getAltura() {

        return altura;

    }


    public void setAltura(double h) {
        if (h < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativa.");
        } else {
            altura = h;
        }
    }

    /**

     * Calcula el volumen del cilindro

     * @return el volumen

     */

    public double getVolumen() {

        return Math.PI * Math.pow(radio, 2) * altura; // Fórmula del volumen: π * r² * h

    }


    @Override

    public String toString() {

        return "Cilindro con centro en: " + super.toString() +

                ", radio: " + radio +

                ", altura: " + altura +

                ", volumen: " + getVolumen();

    }

}