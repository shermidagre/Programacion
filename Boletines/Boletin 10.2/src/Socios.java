import DataHora.Data;
public class Socios extends Asociacion implements gastosIngresos{

    private String direccion;

    private String provincia;

    private Data fechaAlta;

    private double cuota;


    public Socios(String DNI,String Nome,String direccion, String provincia,Data fechaAlta,double cuota){

        super(DNI,Nome);
        this.direccion= direccion;
        this.provincia=provincia;
        this.fechaAlta=fechaAlta;
        this.cuota=cuota;

    }


    public String getDireccion() {

        return direccion;

    }


    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }


    public String getProvincia() {

        return provincia;

    }


    public void setProvincia(String provincia) {

        this.provincia = provincia;

    }


    public Data getFechaAlta() {

        return fechaAlta;

    }


    public void setFechaAlta(Data fechaAlta) {

        this.fechaAlta = fechaAlta;

    }


    public double getCuota() {

        return cuota;

    }


    public void setCuota(double cuota) {

        if (cuota < 0) {

            throw new IllegalArgumentException("La cuota no puede ser negativa.");

        }

        this.cuota = cuota;

    }


    @Override

    public double calcularGastosIngresos() {

        return cuota; // Ingreso positivo

    }


    @Override

    public String aCadea() {

        String aux = ", Dirección: " + direccion + ", Provincia: " + provincia + ", Cuota: " + cuota + "con data de alta "+ fechaAlta.toString();

        return super.aCadea()+aux;

    }

}
