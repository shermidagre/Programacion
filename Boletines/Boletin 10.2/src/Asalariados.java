import DataHora.Data;

public class Asalariados extends Traballadores implements gastosIngresos{

     double sueldo;

     String cargo;

     double irpf; // Porcentaje de IRPF

    double ss;


    public Asalariados (String DNI, String Nome, Data fechaingreso, double sueldo, double irpf, String cargo){
        super(DNI,Nome,fechaingreso);
        setCargo(cargo);
        setSueldo(sueldo);
        setIrpf(irpf);


    }


    public double getSueldo() {

        return sueldo;

    }


    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;

        if (sueldo<0){
            sueldo=0;
        }

    }


    public String getCargo() {

        return cargo;

    }


    public void setCargo(String cargo) {

        this.cargo = cargo;

    }


    public double getIrpf() {

        return irpf;

    }


    public void setIrpf(double irpf) {

        this.irpf = Math.abs(irpf);

    }

    public double getSs() {
        return ss;
    }

    public void setSs(double ss) {
        this.ss = Math.abs(ss);
    }

    @Override

    public double calcularGastosIngresos() {

        return -(sueldo + (sueldo * 0.15)); // Gasto negativo

    }


    @Override

    public String aCadea() {

        String aux= ", Sueldo: " + sueldo + ", Cargo: " + cargo;

        return super.aCadea() + aux;

    }
}
