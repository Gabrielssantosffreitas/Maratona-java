package santos.gabriel.maratonaJava.javaCore.strams.test;

import santos.gabriel.maratonaJava.javaCore.strams.dominio.Livros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stremsTest01 {
    public static void main(String[] args) {
        //traga os 3 livros com o valor de paginas > 10
        // ordernar por titulo

        List<Livros> livrosList = new ArrayList<>(List.of(
                new Livros("Naruto Manga",140),
                new Livros("Naruto ligth novel",9),
                new Livros("pequeno principe",133),
                new Livros("cao de casa dos beserkvile",100),
                new Livros("cao de casa dos beserkvile livro 2",13)
        ));
    // com strems nao temos os operacoes que rotar stremns e o peracao finais
       List<String> nomeLivrosList =  livrosList.stream()
                .sorted((Livros a1 , Livros a2) -> a1.getTitulos().compareTo(a2.getTitulos())) // sorted
                .filter(livros -> livros.getPaginas() > 10) // filtrar por recebe um predicate ou seja temque retornar boolean
                .limit(3)
                .map(Livros::getTitulos)//  <T> livros -> livros.getTitulos <R>
                .toList();

        System.out.println(nomeLivrosList);

    }
}
