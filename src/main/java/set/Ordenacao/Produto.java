package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Set;

public class Produto implements Comparable<Produto> {

    private String nome;
    private long codigo;
    private int quantidade;
    private double preco;

    public Produto(String nome, long codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", codigo=" + codigo + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }

}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
