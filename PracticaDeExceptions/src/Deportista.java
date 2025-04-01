public class Deportista extends Persoa {

    String Deporte;
    String clubs;
    int licencia;
    public Deportista(String Nome,String DNI, String direccion,String Deporte, String clubs, int licencia){
        super(Nome,DNI,direccion);
        this.Deporte=Deporte;
        this.clubs=clubs;
        this.licencia = licencia;
    }
}
