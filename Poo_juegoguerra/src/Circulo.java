public class Circulo extends Punto { // Crea una clase Circulo que hereda de la clase Punto


    // Declaración de propiedades

    private double radio;


    // Constructor principal

    public Circulo(double x, double y, double r) {

        super(x, y); // Inicializa la superclase

        radio = r; // Inicializa el radio

    }


    // Constructor que acepta coordenadas enteras

    public Circulo(int x, int y, int r) {

        super(x, y);

        radio = r;

    }


    // Constructor que acepta un solo valor para x e y

    public Circulo(double w, double r) {

        super(w, w); // Inicializa el círculo con el mismo valor para x e y

        radio = r;

    }


    // Constructor por defecto

    public Circulo() {

        super(0, 0); // Centro en (0, 0)

        radio = 1;   // Radio por defecto de 1

    }


    // Constructor que recibe un objeto Punto

    public Circulo(Punto p, double r) {

        super(p.getX(), p.getY()); // Inicializa el círculo con las coordenadas del punto

        radio = r;

    }


    // Constructor que recibe un radio y usa un punto por defecto

    public Circulo(double r) {

        super(0, 0); // Centro en (0, 0)

        radio = r; // Radio especificado

    }


    // Constructor que recibe un string con coordenadas

    public Circulo(String punto, double r) {

        // Verifica que el string no esté vacío

        if (punto == null || punto.isEmpty()) {

            throw new IllegalArgumentException("El punto no puede ser nulo o vacío.");

        }


        // Divide la cadena en coordenadas

        String[] coords = punto.split(",");


        // Verifica que haya exactamente dos coordenadas

        if (coords.length != 2) {

            throw new IllegalArgumentException("El formato del punto debe ser 'x,y'.");

        }


        try {

            double x = Double.parseDouble(coords[0].trim()); // Convierte la primera parte a double

            double y = Double.parseDouble(coords[1].trim()); // Convierte la segunda parte a double

            super(x, y); // Inicializa el círculo con las coordenadas

            radio = r; // Inicializa el radio

        } catch (NumberFormatException e) {

            throw new IllegalArgumentException("Las coordenadas deben ser números válidos.", e);

        }

    }

    // Constructor de copia

    public Circulo(Circulo otro) {

        super(otro.getX(), otro.getY()); // Copia las coordenadas del círculo existente

        this.radio = otro.radio; // Copia el radio

    }


    // Métodos getter y setter

    public double getRadio() {

        return radio;

    }


    public void setRadio(double radio) {

        this.radio = radio;

    }


    /**

     * Permite calcular el diámetro del círculo

     * @return el diámetro

     */

    public double calculoDiametro() {

        return radio * 2;

    }


    /**

     * Cálculo del área del círculo

     * @return el área

     */

    public double calculoArea() {

        return Math.PI * Math.pow(radio, 2);

    }


    /**

     * Calcula el perímetro del círculo

     * @return el perímetro

     */

    public double calculoPerimetro() {

        return calculoDiametro() * Math.PI;

    }


    @Override

    public String toString() {

        return "El centro del círculo es: " + super.toString() + " \nEl radio es: " + radio;

    }

}