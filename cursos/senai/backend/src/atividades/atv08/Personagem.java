package atv09;

public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(String nome, int vida, int energia) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        nivel = 1;
    }

    public void setEnergia(int energia) {
        if (energia < 100 && energia > 0) {
            this.energia = energia;
        }
    }

    public void setVida(int vida) {
        if (vida > 0 && vida < 100) {
            this.vida = vida;
        }
    }

    public int receberDano(int dano) {
        if(dano < vida){
            return vida = vida - dano;
        }else{
            return 2;
        }
    }

}


