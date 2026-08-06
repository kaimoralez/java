package atividades.atv03;

public class Livro {
    public String titulo;
    public String autor;
    public String editora;
    public double preco;

    public Livro(String titulo, String autor, String editora, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                '}';
    }
}
