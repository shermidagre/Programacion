public class Contacorrente {
        int saldo;
        String Titular;
        int nConta;
        String nif;

    public Contacorrente() {

        saldo=1000;

        Titular="Juan";

        nConta=19210783;

        nif="12893Q8N";


    }
    public static void Sacardinero(String nif, int nConta, int saldo){


    }
    public static void Ingresardinero(String nif, int Nconta){

    }
    public  static  void Mostrarinformacion(String nif, int nConta, int saldo, String Titular){

    }

    // gett and sett

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

}
