package livros;

public abstract class Livro {
    private String titulo;
    private String editora;
    private String autores;
    private float preco;

    public Livro(String titulo, String editora, String autores, float preco) {
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", autores='" + autores + '\'' +
                ", preco=" + preco +
                '}';
    }
}
