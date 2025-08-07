package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double valor;
    private int quantidade;

    public Item(double valor, String nome, int quantidade) {
        this.valor = valor;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
