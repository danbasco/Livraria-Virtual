package livraria;

import livros.Livro;

public class Venda {
    private Livro[] livros;
    private static int numVendas = 0;
    private int numero;
    private String cliente;
    private float valor;

    public Venda(int MAX_VENDAS, String cliente) {
        this.livros = new Livro[MAX_VENDAS];
        numVendas++;
        this.numero = numVendas;
        this.cliente = cliente;
        this.valor = 0.0f;
    }

    public void addLivro(Livro l, int index) {
        if (index >= 0 && index < livros.length) {
            livros[index] = l;
            valor += l.getPreco();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros da Venda " + numero + ":");
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println("Título: " + livro.getTitulo() + ", Preço: " + livro.getPreco());
            }
        }
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public static int getNumVendas() {
        return numVendas;
    }

    public static void setNumVendas(int numVendas) {
        Venda.numVendas = numVendas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
