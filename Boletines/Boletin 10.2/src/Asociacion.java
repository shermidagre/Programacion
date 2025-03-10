import java.util.Date;
public abstract class Asociacion {

    String DNI;
    String Nome;

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

    public abstract String aCadea();
}

