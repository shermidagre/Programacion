public class Persoa {

    String Nome ;
    String direccion;
    String DNI;

    public Persoa(String Nome, String direccion,String DNI){
        this.Nome=Nome;
        this.direccion=direccion;
        this.DNI=DNI;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
