package Repostos;

public class Repostos {
    private String nome;
    private int cantidade;

    public Repostos(String nome, int cantidade) {
        this.nome = nome;
        this.cantidade = cantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }
}