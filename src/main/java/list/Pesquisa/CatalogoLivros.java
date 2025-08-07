package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivro;

    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getAutor().equals(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorAno = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorAno.add(l);
                }
            }
        }
        return livroPorAno;
    }

    public Livro pesquisarTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro 1", "autor1", 1999);
        catalogoLivros.adicionarLivro("livro 2", "autor2", 1993);
        catalogoLivros.adicionarLivro("livro 3", "autor2", 1992);
        catalogoLivros.adicionarLivro("livro 4", "autor3", 1991);
        catalogoLivros.adicionarLivro("livro 5", "autor4", 1998);

        System.out.println(catalogoLivros.pesquisarAutor("autor2"));
        System.out.println(catalogoLivros.pesquisarTitulo("livro 2"));
        System.out.println(catalogoLivros.pesquisarIntervaloDeAnos(1993, 1999));

    }
}
