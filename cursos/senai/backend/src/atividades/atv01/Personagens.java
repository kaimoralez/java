package atv27_07;

public class Personagens {

    public String nome;
    public int idade;
    public boolean status;
    public String elemento;
    public String patente;
    public String tecnicaCombate;
    public String aldeia;
    public String cla;

    @Override
    public String toString() {
        return "=== Ficha do Personagem ===\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + " anos\n" +
                "Status: " + (status ? "Vivo" : "Morto") + "\n" +
                "Elemento: " + elemento + "\n" +
                "Patente: " + patente + "\n" +
                "Técnica de Combate: " + tecnicaCombate + "\n" +
                "Aldeia: " + aldeia + "\n" +
                "Clã: " + cla + "\n" +
                "===========================";
    }
}
