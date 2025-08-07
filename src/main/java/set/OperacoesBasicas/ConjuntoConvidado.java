package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {

        convidadoSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }

        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();
        System.out.println("Existem " + conjunto.contarConvidado() + " na lista de convidados");
        conjunto.adicionarConvidado("Juan", 1);
        conjunto.adicionarConvidado("Maria", 1);
        conjunto.adicionarConvidado("Pedro", 3);
        conjunto.adicionarConvidado("Julio", 4);

        System.out.println("Existem" + conjunto.contarConvidado() + "na lista de convidados");

        conjunto.removerConvidadoPorCodigoConvite(3);
        System.out.println("Existem " + conjunto.contarConvidado() + " na lista de convidados");

        conjunto.exibirConvidado();

    }
}
