import DataHora.Data;
public abstract class Traballadores extends Asociacion{

    public Data fechaingreso;


    public Traballadores(String DNI, String Nome,String fechaingreso){
        super(DNI,Nome);
        getFecha();
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

    @Override
    public void gastosingresosmetodo() {

    }
}
