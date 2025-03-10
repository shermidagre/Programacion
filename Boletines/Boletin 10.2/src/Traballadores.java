import java.util.Date;
public class Traballadores extends Asociacion{

    private Date fechaIngreso;


    public Date getFechaIngreso() {

        return fechaIngreso;

    }


    public void setFechaIngreso(Date fechaIngreso) {

        this.fechaIngreso = fechaIngreso;

    }


    @Override

    public String aCadea() {

        return "DNI: " + getDNI() + ", Nombre: " + getNome() + ", Fecha de Ingreso: " + fechaIngreso;

    }
}
