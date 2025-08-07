package main.java.set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void AdicionarProduto(String nome, long codigo, int quantidade, int preco) {
        produtoSet.add(new Produto(nome, codigo, quantidade, preco));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.AdicionarProduto("mochila", 1000, 1, 1);
        cadastroProduto.AdicionarProduto("cadeira", 10200, 2, 10);
        cadastroProduto.AdicionarProduto("mesa", 10300, 3, 12);
        cadastroProduto.AdicionarProduto("urso", 10400, 4, 233);
        System.out.println(cadastroProduto.produtoSet);
        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());

    }
}
