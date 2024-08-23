package livros;

public abstract class Livro {

    private String titulo, editora, autores;
    private float preco;

    public Livro(String titulo, String editora, String autores, float preco) {

        setTitulo(titulo);
        setEditora(editora);
        setAutores(autores);
        setPreco(preco);

    }

    public String toString(){

        return "";
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

}
