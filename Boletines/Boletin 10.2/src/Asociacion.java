import java.util.Date;
public abstract class Asociacion {

    String DNI;
    String Nome;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public abstract String aCadea();
}
