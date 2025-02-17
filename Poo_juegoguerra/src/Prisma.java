public class Prisma extends Punto {

    // Propiedades

    private double baseAncho; // Ancho de la base

    private double baseLargo;  // Largo de la base

    private double altura;      // Altura del prisma


    // Constructor

    public Prisma(double x, double y, double ancho, double largo, double altura) {

        super(x, y); // Inicializa la superclase

        setBaseAncho(ancho); // Inicializa el ancho de la base

        setBaseLargo(largo);  // Inicializa el largo de la base

        setAltura(altura);    // Inicializa la altura

    }


    // Métodos getter y setter

    public double getBaseAncho() {

        return baseAncho;

    }


    public void setBaseAncho(double ancho) {

        if (ancho < 0) {

            throw new IllegalArgumentException("El ancho de la base no puede ser negativo.");

        }

        this.baseAncho = ancho;

    }


    public double getBaseLargo() {

        return baseLargo;

    }


    public void setBaseLargo(double largo) {

        if (largo < 0) {

            throw new IllegalArgumentException("El largo de la base no puede ser negativo.");

        }

        this.baseLargo = largo;

    }


    public double getAltura() {

        return altura;

    }


    public void setAltura(double altura) {

        if (altura < 0) {

            throw new IllegalArgumentException("La altura no puede ser negativa.");

        }

        this.altura = altura;

    }


    /**

     * Calcula el volumen del prisma

     * @return el volumen

     */

    public double calcularVolumen() {

        return baseAncho * baseLargo * altura; // Fórmula del volumen: ancho * largo * altura

    }


    @Override

    public String toString() {

        return "Prisma con centro en: " + super.toString() +

                ", ancho de la base: " + baseAncho +

                ", largo de la base: " + baseLargo +

                ", altura: " + altura +

                ", volumen: " + calcularVolumen();

    }

}