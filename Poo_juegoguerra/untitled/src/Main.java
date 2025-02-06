import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Persoaxe heroi = new Persoaxe("Heroi", 20, 15, 10, 120, "Aparência Heroica");

        Persoaxe monstro = new Persoaxe("Monstro", 15, 5, 8, 80, "Aparência Monstruosa");


        System.out.println(heroi);

        System.out.println(monstro);


        heroi.atacar(monstro);

        System.out.println(monstro);


        monstro.atacar(heroi);

        System.out.println(heroi);


        heroi.levelUp();

        System.out.println(heroi);

    }

}
 class Persoaxe {

    private String nome;
    private int vida;
    private int resistencia;
    private int fuerza;
    private int velocidade;
    private int experiencia;
    private String apariencia;
    private List<String> habilidades;
    private List<String> equipamento;

    public Persoaxe(){
        nome="";
        vida= 10;
        resistencia= 20;
        fuerza= 7;
        velocidade= 100;
        experiencia= 1;
        apariencia="";
        this.habilidades = new ArrayList<>();

        this.equipamento = new ArrayList<>();

    }


    // Parameterized constructor

    public Persoaxe(String nome, int vida, int resistencia, int fuerza, int velocidade, String apariencia) {

        this.nome = nome;

        this.vida = vida;

        this.resistencia = resistencia;

        this.fuerza = fuerza;

        this.velocidade = velocidade;

        this.experiencia = 1; // Default experience

        this.apariencia = apariencia;

        this.habilidades = new ArrayList<>();

        this.equipamento = new ArrayList<>();

    }


    // Getters and Setters

    public String getNome() {

        return nome;

    }


    public void setNome(String nome) {

        this.nome = nome;

    }


    public int getVida() {

        return vida;

    }


    public void setVida(int vida) {

        this.vida = vida;

    }


    public int getResistencia() {

        return resistencia;

    }


    public void setResistencia(int resistencia) {

        this.resistencia = resistencia;

    }


    public int getFuerza() {

        return fuerza;

    }


    public void getFuerza(int fuerza) {

        this.fuerza = fuerza;

    }


    public int getVelocidade() {

        return velocidade;

    }


    public void setVelocidade(int velocidade) {

        this.velocidade = velocidade;

    }


    public int getExperiencia() {

        return experiencia;

    }


    public void setExperiencia(int experiencia) {

        this.experiencia = experiencia;

    }


    public String getAparência() {

        return apariencia;

    }


    public void setAparência(String aparência) {

        this.apariencia = aparência;

    }


    public List<String> getHabilidades() {

        return habilidades;

    }


    public void addHabilidade(String habilidade) {

        if (habilidades.size() < 5) {

            habilidades.add(habilidade);

        } else {

            System.out.println("Limite de habilidades atingido.");

        }

    }


    public List<String> getEquipamento() {

        return equipamento;

    }


    public void addEquipamento(String item) {

        if (equipamento.size() < 5) {

            equipamento.add(item);

        } else {

            System.out.println("Limite de equipamentos atingido.");

        }

    }


    // Example method to simulate taking damage

    public void receberDano(int dano) {

        vida -= Math.max(0, dano - resistencia); // Damage reduced by resistance

        if (vida < 0) {

            vida = 0; // Ensure vida doesn't go below 0

        }

    }


        public void levelUp() {

            experiencia++;

            vida += 5; // Increase vida on level up

            fuerza += 2; // Increase força on level up

            resistencia += 1; // Increase resistencia on level up

            velocidade += 1; // Optionally increase velocidade on level up

            System.out.println(nome + " subiu de nível! Nível atual: " + experiencia);

        }


        // Example method to attack another character

        public void atacar(Persoaxe alvo) {

            int dano = fuerza; // Damage is equal to força

            alvo.receberDano(dano);

            System.out.println(nome + " atacou " + alvo.getNome() + " causando " + dano + " de dano.");

        }


        // Example method to display character information

        @Override

        public String toString() {

            return "Nome: " + nome +

                    "\nVida: " + vida +

                    "\nResistência: " + resistencia +

                    "\nForça: " + fuerza +

                    "\nVelocidade: " + velocidade +

                    "\nExperiência: " + experiencia +

                    "\nAparência: " + apariencia +

                    "\nHabilidades: " + habilidades +

                    "\nEquipamento: " + equipamento;

        }

    }