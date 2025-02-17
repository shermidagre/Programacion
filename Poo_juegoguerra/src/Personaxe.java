
class Personaxe {

    String nome;
    int vida;
    int resistencia;
    int fuerza;
    int velocidade;
    int experiencia;
    String apariencia;
    String[] habilidades;
    String[] equipamento;

    public Personaxe() {

        nome = "Invitado";

        vida = 10;

        resistencia = 20;

        fuerza = 7;

        velocidade = 100;

        experiencia = 1;

        apariencia = "Soldado raso";

        this.habilidades = new String[5];

        this.equipamento = new String[5];

    }

    public Personaxe(String nom, int vida, int res, int forza, int vel, int exp, String apariencia, String[] habilidades, String[] equipamientos) {


        nome = nom;
        setVida(vida); //setVida
        setResistencia(res);
        setFuerza(forza);
        setVelocidade(vel);
        setExperiencia(exp);
        this.apariencia = apariencia;
        setHabilidades(habilidades);
        setequipamiento(equipamientos);

    }

    public static void pierdeVida(int cantidad, int vida) {

        if (cantidad > 0) {

            vida -= cantidad;

        }

    }

    /* get y set */

    public void setHabilidades(String[] habilidades) {

        this.habilidades = new String[5];

        int numhabilidades = Math.min(habilidades.length, 5);

        if (numhabilidades > 5) {
            numhabilidades = 5;
        }
        for (int i = 0; i < numhabilidades; i++) {

            this.habilidades[i] = habilidades[i];
        }
    }

    public String[] getHabilidades() {
        return this.habilidades;
    }

    public void setequipamiento(String[] equipamientos) {

        this.equipamento = new String[5];

        int numequipamiento = Math.min(equipamientos.length, 5);

        if (numequipamiento > 5) {
            numequipamiento = 5;
        }

        for (int i = 0; i < numequipamiento; i++) {

            this.equipamento[i] = equipamientos[i];

        }
    }

    public String[] getEquipamento() {
        return equipamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 5) this.vida = vida;
        else this.vida = 1;
    }

    public int getVida() {
        return vida;
    }

    public void setResistencia(int resistencia) {
        if (resistencia >= 0 && resistencia <= 5) this.resistencia = resistencia;
        else this.resistencia = 0;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 0 && fuerza <= 5) this.fuerza = fuerza;
        else fuerza = 0;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= 5) this.velocidade = velocidade;
        else velocidade = 2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia >= 0 && experiencia <= 5) this.experiencia = experiencia;
        else experiencia = 0;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;

    }

    public String getApariencia() {
        return apariencia;
    }

}

