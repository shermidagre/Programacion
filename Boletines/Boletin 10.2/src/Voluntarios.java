public class Voluntarios extends Traballadores implements gastosIngresos{

    private int edad;

    private String profesion;

    private double horasTrabajo; // Horas dedicadas a la asociación

    public Voluntarios(String DNI, String Nome, String fechaingreso, int edad, String profesion, double horasTrabajo){

        super(DNI,Nome,fechaingreso);
        setEdad(edad);
        setProfesion(profesion);
        setHorasTrabajo(horasTrabajo);

    }

    public int getEdad() {

        return edad;

    }


    public void setEdad(int edad) {

        this.edad = edad;

        if (edad<0 && edad>130){
            edad=0;
        }
        throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 130");
    }


    public String getProfesion() {

        return profesion;

    }


    public void setProfesion(String profesion) {

        this.profesion = profesion;

    }


    public double getHorasTrabajo() {

        return horasTrabajo;

    }


    public void setHorasTrabajo(double horasTrabajo) {

        this.horasTrabajo = horasTrabajo;

    }


    @Override

    public String aCadea() {

        String aux = ", Edad: " + edad + ", Profesión: " + profesion + ", Horas de Trabajo: " + horasTrabajo;

        return super.aCadea() + aux;

    }

    @Override
    public double calcularGastosIngresos() {
        return -3;
    }
}
