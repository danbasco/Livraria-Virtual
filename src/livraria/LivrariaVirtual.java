package livraria;

import livros.Eletronico;
import livros.Impresso;

public class LivrariaVirtual {
    private static final int MAX_IMPRESSOS = 10;
    private static final int MAX_ELETRONICOS = 20;
    private static final int MAX_VENDAS = 50;

    private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];
    private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];
    private Venda[] vendas = new Venda[MAX_VENDAS];

    private int numImpressos;
    private int numEletronicos;
    private int numVendas;

    public void cadastrarLivro() {
        // TODO Nivaldo
    }

    public void realizarVenda() {
        // TODO
    }

    public void listarLivrosImpressos() {
        // TODO
    }

    public void listarLivrosEletronicos() {
        // TODO
    }

    public void listarLivros() {
        // TODO Vinicius
    }

    public void listarVendas() {
        // TODO
    }

    public static void main(String[] args) {
        // TODO
    }
}
