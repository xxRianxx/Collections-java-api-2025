package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listNumero = new ArrayList<>();

    public SomaNumeros() {
        this.listNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumero.add(numero);
    }

    public int calcularSoma() {
        List<Integer> list = new ArrayList<>();
        int soma = 0;
        for (int i = 0; i < listNumero.size(); i++) {
            list.add(listNumero.get(i));
            soma = soma + listNumero.get(i);
        }
        return soma;
    }

    public Integer calcularMaiorNumero() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listNumero.size(); i++) {
            for (int j = i + 1; j < listNumero.size(); j++) {
                if (listNumero.get(i) > listNumero.get(j)) {
                    list.add(listNumero.get(i));
                    return listNumero.get(i);
                } else if (listNumero.get(i) < listNumero.get(j)) {
                    list.add(listNumero.get(j));
                    return listNumero.get(j);
                }

            }


        }
        return null;

    }

    public Integer calcularMenorNumero() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listNumero.size(); i++) {
            for (int j = i + 1; j < listNumero.size(); j++) {
                if (listNumero.get(i) < listNumero.get(j)) {
                    list.add(listNumero.get(i));
                    return listNumero.get(i);
                } else if (listNumero.get(i) > listNumero.get(j)) {
                    list.add(listNumero.get(j));
                    return listNumero.get(j);
                }

            }


        }
        return null;

    }

    public List<Integer> ExibirNumeros(List<Integer> list) {
        return list;
    }


    public static void main(String[] args) {
        SomaNumeros s = new SomaNumeros();
        s.adicionarNumero(5);
        s.adicionarNumero(3);
        s.adicionarNumero(4);
        System.out.println(s.calcularSoma());
        System.out.println(s.calcularMaiorNumero());
        System.out.println(s.calcularMenorNumero());
        System.out.println(s.ExibirNumeros(s.listNumero));
    }
}
