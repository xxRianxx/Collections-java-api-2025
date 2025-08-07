package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> ListItens;

    public CarrinhoDeCompras() {
        ListItens = new ArrayList<>();
    }

    public void AdicionarItem(Item item) {
        ListItens.add(item);
    }

    public void RemoverItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        for (Item i : ListItens) {
            if (i.getNome().equals(nome)) {
                itemRemover.add(i);
            }

        }
        ListItens.removeAll(itemRemover);
    }

    public double CalcularValorTotal() {
        double valorTotal = 0;
        for (Item i : ListItens) {
            valorTotal += i.getValor();
        }
        return valorTotal;
    }

    public void ExibirItens() {
        System.out.println(ListItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras obj = new CarrinhoDeCompras();
        Item item1 = new Item(20, "sofa", 2);
        Item item2 = new Item(30, "macarrão", 3);
        Item item3 = new Item(40, "copo", 4);
        obj.AdicionarItem(item1);
        obj.AdicionarItem(item2);
        obj.AdicionarItem(item3);

        obj.ExibirItens();
        System.out.println(obj.CalcularValorTotal());
        obj.RemoverItem("sofa");

        obj.ExibirItens();
        System.out.println(obj.CalcularValorTotal());

    }

}
