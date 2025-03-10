public class Voluntarios extends Traballadores{

    private int edad;

    private String profesion;

    private int horasTrabajo; // Horas dedicadas a la asociación


    public int getEdad() {

        return edad;

    }


    public void setEdad(int edad) {

        this.edad = edad;

    }


    public String getProfesion() {

        return profesion;

    }


    public void setProfesion(String profesion) {

        this.profesion = profesion;

    }


    public int getHorasTrabajo() {

        return horasTrabajo;

    }


    public void setHorasTrabajo(int horasTrabajo) {

        this.horasTrabajo = horasTrabajo;

    }


    @Override

    public String aCadea() {

        return super.aCadea() + ", Edad: " + edad + ", Profesión: " + profesion + ", Horas de Trabajo: " + horasTrabajo;

    }
}
