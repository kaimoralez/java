package atv08;

import static java.lang.Integer.parseInt;

public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(String nome, int vida, int energia) {

        this.nome = nome;

        if (vida < 0) {
            this.vida = 0;
        }else if (vida > 100){
            this.vida = 100;
        }else{
            this.vida = vida;
        }

        if (energia < 0) {
            this.energia = 0;
        }else if (energia > 100){
            this.energia = 100;
        }else{
            this.energia = energia;
        }

        nivel = 1;
    }

    public int receberDano(int dano) {
        if(dano < vida){
            return vida = vida - dano;
        }else{
            return vida = 0;
        }
    }

    public int descansar(int descansa){
        if ((energia + descansa) <= 100){
            return energia = energia + descansa;
        }else{
            return energia = 100;
        }
    }

    public int atacar (int ataque){
        double totalAtaque = 0.5 * ataque;

        if(energia == 0){
            return 0;
        }else{
            return energia = energia - (int)totalAtaque;
        }
    }

    @Override
    public String toString() {
        return "=======  Personagem  ======" +
                " nome = " + nome  +
                ", vida = " + vida +
                ", energia = " + energia +
                ", nivel = " + nivel;
    }
}


