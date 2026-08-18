package atv07;

public class Tamagotchi {

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public Tamagotchi(String nome) {
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "normal";
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getEnergia() {
        return energia;
    }

    public String getHumor() {
        setHumor();
        return humor;
    }

    public void setEnergia(int energia){
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
        }
    }

    public void setFome(int fome){
        if (fome >= 0 && fome <= 100){
            this.fome = fome;
        }
    }


    private void setHumor(){
        if (energia > 75 && fome < 25) {
            humor = "Feliz e sem fome";
        } else if (energia >= 50 && fome <= 50) {
            humor = "ok e pode comer";
        } else if (energia > 25 && fome < 75) {
            humor = "Cansado e com fome";
        } else {
            humor = "Famito e triste";
        }
    }

    @Override
    public String toString() {
        return "=======  Tamagotchi  ========" +
                "\n nome = " + nome +
                "\n fome = " + fome +
                "\n energia = " + energia +
                "\n humor = " + humor
                 ;
    }
}
