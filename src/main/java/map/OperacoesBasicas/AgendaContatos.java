package main.java.map.OperacoesBasicas;

import main.java.set.Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new TreeMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {

            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println("Lista de contatos: " + agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria", 25);
        agenda.adicionarContato("Pedro ", 24);
        agenda.adicionarContato("ana ", 55);
        agenda.adicionarContato("Pedro vitor ", 88);
        agenda.adicionarContato("Maria julia ", 23);
        agenda.exibirContatos();
        agenda.removerContato("Maria");
        agenda.exibirContatos();

    }
}
