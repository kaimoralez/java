package atv04;

public class Carro {
    public String marca;
    public String modelo;
    public int numPortas;

    public Carro(String marca, String modelo, int numPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPortas = numPortas;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numPortas=" + numPortas +
                '}';
    }
}
