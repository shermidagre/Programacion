import java.util.Date;
public class Socios extends Asociacion implements gastosIngresos{
    private String direccion;

    private String provincia;

    private Date fechaAlta;

    private double cuota;


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


    public Date getFechaAlta() {

        return fechaAlta;

    }


    public void setFechaAlta(Date fechaAlta) {

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

        return aCadea() + ", Dirección: " + direccion + ", Provincia: " + provincia + ", Cuota: " + cuota;

    }
}
