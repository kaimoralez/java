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





            vida = vida - dano;
            return vida;
        }else{
            vida = 0;
            return vida;
        }
    }

    public int descansar(){
        if ((energia + 10) <= 100){
            energia = energia + 10;
            return energia;
        }else{
            energia = 100;
            return energia;
        }
    }

    public int atacar (int ataque){
        double totalAtaque = 0.5 * ataque;

        if(totalAtaque > energia){
            return 0;
        }else{
            energia = energia - (int)totalAtaque;
            return (int)totalAtaque;
        }
    }

    public String getStatus(){
        if(vida > 0 ){
            return "Vivo";
        } else{
            return "Derrotado";
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


