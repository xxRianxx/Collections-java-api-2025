package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int CodigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        CodigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return CodigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return CodigoConvite == convidado.CodigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(CodigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", CodigoConvite=" + CodigoConvite +
                '}';
    }
}
