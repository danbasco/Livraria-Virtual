package livraria;

import livros.Livro;

public class Venda {

    private final int QUANTIDADE_MAXIMA = 50;
    private int numVendas, numero;
    private String cliente;
    private float valor;
    private Livro[] livros;

    public Venda(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.numVendas = 0;
        this.valor = 0;
        this.livros = new Livro[QUANTIDADE_MAXIMA];
    }

    public void addLivro(Livro l, int index) {
        if (numVendas < QUANTIDADE_MAXIMA) {
            livros[index] = l;
            numVendas++;
            valor += l.getPreco();
        } else if(index > QUANTIDADE_MAXIMA) System.out.println("Informe um valor que não ultrapasse a quantidade máxima.");
        else System.out.println("Capacidade máxima de livros na venda atingida.");
    }

    public void listarLivros() {
        for(Livro l : livros) {
            System.out.println(l);
        }
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
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
