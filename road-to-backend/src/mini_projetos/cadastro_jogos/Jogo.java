package mini_projetos.cadastro_jogos;

public class Jogo {
    private String nome;
    private String genero;
    private int anoLancamento;
    private double nota;
    private String plataforma;

    public Jogo(String nome, String genero, int anoLancamento, double nota, String plataforma){
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
        this.plataforma = plataforma;
    }

    public String getNome(){
        return this.nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getNota() {
        return nota;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "======================" +
                "Nome:'" + nome + '\'' +
                "\n Genero ='" + genero + '\'' +
                "\n Ano de lançamento:" + anoLancamento +
                "\n Nota:" + nota +
                "\n Plataforma:" + plataforma + '\'' +
                "\n =============================";
    }
}
