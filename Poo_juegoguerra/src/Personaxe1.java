class Persoaxe1 {

    private String nome;
    private int vida;
    private int resistencia;
    private int fuerza;
    private int velocidade;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamento;

    public Persoaxe1() {
        nome = "";
        vida = 10;
        resistencia = 20;
        fuerza = 7;
        velocidade = 100;
        experiencia = 1;
        apariencia = "";
        this.habilidades = new String[5];

        this.equipamento = new String[5];

    }
    public Persoaxe1(String nom,int vida,int res, int forza, int vel, int exp, String apariencia,String habilidades,String equipamiento){


        nome=nom;
        this.vida= vida;//setVida
        resistencia=res;
        this.fuerza=forza;
        velocidade=vel;
        experiencia=exp;
        this.apariencia=apariencia;
        this.habilidades= new String[5];
        setHabilidades (habilidades);
        this.equipamento=new String[5];
        setequipamiento (equipamiento);

    }
    public void setHabilidades(String[]habilidades){

     int numhabilidades = habilidades.length();

        if (numhabilidades>5){
            numhabilidades=5;
        }
        else {

        }
        for (int i=0;i>numhabilidades;i++ ){
            this.habilidades[i] = habilidades[i];
        }

    }
    public void setequipamiento(String[]equipamento) {

        int numequipamiento = equipamento.length();

        if (numequipamiento > 5) {
            numequipamiento = 5;
        } else {

        }
        for (int i = 0; i > numequipamiento; i++) {
            this.equipamento[i] = equipamento[i];
        }

    }
    public static void main(String[] args) {
        String [] hab= {"Saltar","Xray"};
        String [] equip={"Pistola"};
        persoaxe mario =new Persoaxe1("Mario bros",5)
    }
}
