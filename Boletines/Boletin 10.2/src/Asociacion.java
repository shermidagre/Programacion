
public abstract class Asociacion implements gastosIngresos {

    String DNI;
    String Nome;

    public Asociacion (String DNI,String Nome){
        setDni(DNI);
        this.Nome = Nome;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDni(String dni) {

        if (dni == null || dni.isEmpty()) {

            throw new IllegalArgumentException("El DNI no puede estar vacío.");

        }

        this.DNI = dni;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String aCadea() {
        return "DNI: " + getDNI() + ", Nombre: " + getNome() + ", Fecha de Ingreso: ";
    }
}

