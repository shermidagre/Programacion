public class Socios extends Asociacion {

    private String direccion;

    private String provincia;

    private String fechaAlta;

    private double cuota;


    public Socios(String DNI, String Nome, String direccion, String provincia, String fechaAlta, double cuota) {

        super(DNI, Nome);
        this.direccion = direccion;
        this.provincia = provincia;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;

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


    public String getFechaAlta() {

        return fechaAlta;

    }


    public void setFechaAlta(String fechaAlta) {

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

    public String aCadea() {

        String aux = ", Dirección: " + direccion + ", Provincia: " + provincia + ", Cuota: " + cuota + "con data de alta " + fechaAlta.toString();

        return super.aCadea() + aux;

    }

    @Override
    public double gastosingresosmetodo() {
        return cuota;
    }
    
}
