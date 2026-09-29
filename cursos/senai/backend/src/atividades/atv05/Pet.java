package atividades.atv05;

public class Pet {
    private String nome;
    private int fome;
    private int energia;
    private int humor;

    public Pet(String nome, int fome, int energia) {
        this.nome = nome;
        this.fome = fome;
        this.energia = energia;
    }

    public int getHumor() {
        return humor;
    }
}
