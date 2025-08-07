package main.java.list.Ordenacao;

import main.java.list.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(int idade) {
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPessoaPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas p = new OrdenacaoPessoas();
        p.adicionarPessoa("joão", 23, 1.90);
        p.adicionarPessoa("leticia", 26, 1.85);
        p.adicionarPessoa("carla", 33, 1.74);
        p.adicionarPessoa("alvoraro", 12, 1.70);
        p.adicionarPessoa("rodrigo", 44, 1.80);
        p.adicionarPessoa("bianca", 11, 1.44);

        System.out.println(p.ordenarPorAltura());
        System.out.println(p.ordenarPorIdade(23));
        System.out.println(p.pessoas);
    }

}
