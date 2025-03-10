public class Asalariados extends Traballadores implements gastosIngresos{

     double sueldo;

     String cargo;

     double irpf; // Porcentaje de IRPF


    public double getSueldo() {

        return sueldo;

    }


    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;

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

        this.irpf = irpf;

    }


    @Override

    public double calcularGastosIngresos() {

        return -(sueldo + (sueldo * 0.15)); // Gasto negativo

    }


    @Override

    public String aCadea() {

        return super.aCadea() + ", Sueldo: " + sueldo + ", Cargo: " + cargo;

    }
}
