import DataHora.Data;
public abstract class Traballadores extends Asociacion implements gastosIngresos{

    public Data fechaingreso;


    public Traballadores(String DNI, String Nome,Data fechaingreso){
        super(DNI,Nome);
        this.fechaingreso=fechaingreso;
    }

    public String getFecha() {
        return fechaingreso.toString();
    }

    public void setFecha(String Data) {
        Data = fechaingreso.toString();
    }

    @Override

    public String aCadea() {

        return super.aCadea() + fechaingreso.toString();

    }
}
