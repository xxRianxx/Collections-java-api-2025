package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }
    public void  adicionarContato(String nome, int telefone) {
        contatos.add(new Contato(nome,telefone));

    }

    public void exibirContato()
    {
        System.out.println(contatos);

    }
    public Set<Contato> PesquisarContatoPorNome(String nome)
    {
        Set<Contato> contatosPorNome= new HashSet<>();
        for (Contato c : contatos) {
            if(c.getNome().startsWith(nome))
            {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarContato(String nome, int novoTelefone)
    {
        Contato contatoAtualizado = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome))
            {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria", 2123453);
        agenda.adicionarContato("Maria", 21343);
        agenda.adicionarContato("Joao", 22233);

        agenda.exibirContato();
       System.out.println(agenda.PesquisarContatoPorNome("Maria"));
        agenda.atualizarContato("Maria", 212345);
        agenda.PesquisarContatoPorNome("Maria");

    }
}
