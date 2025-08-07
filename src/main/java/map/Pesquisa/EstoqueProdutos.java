package main.java.map.Pesquisa;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        estoqueProdutoMap = new HashMap<>();
    }

    public void addProduto(Long cod, String nome, double preco, int quantidade) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (estoqueProdutoMap.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        System.out.println("Produtos no estoque:");
        for (Produto produto : estoqueProdutoMap.values()) {
            System.out.println(produto);
        }
    }


    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        String numeroFormatado = df.format(valorTotal);
        return Double.parseDouble(numeroFormatado);
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtoMaisCaro = produto;


                }
            }
        }
        return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();
        estoqueProdutos.addProduto(1L, "produto1", 10, 2);
        estoqueProdutos.addProduto(2L, "produto2", 5, 2);
        estoqueProdutos.addProduto(3L, "produto3", 1, 1);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    }
}