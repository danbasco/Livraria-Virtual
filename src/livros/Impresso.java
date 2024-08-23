package livros;

public class Impresso extends Livro{

    private float frete;
    private int estoque;

    public Impresso(String titulo, String editora, String autores, float preco, float frete, int estoque) {
        super(titulo, editora, autores, preco);
        setFrete(frete);
        setEstoque(estoque);
    }

    @Override
    public String toString() {
        return "";
    }

    public void atualizarEstoque() {
        this.estoque--;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }
}
