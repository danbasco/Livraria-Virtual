package livros;

public class Eletronico extends Livro {
    private int tamanho;

    public Eletronico(String titulo, String editora, String autores, float preco, int tamanho) {
        super(titulo, editora, autores, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "tamanho=" + tamanho +
                '}';
    }
}
