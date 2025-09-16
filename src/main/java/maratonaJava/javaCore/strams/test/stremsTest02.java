package main.java.maratonaJava.javaCore.strams.test;

import main.java.maratonaJava.javaCore.strams.dominio.Livros;

import java.util.ArrayList;
import java.util.List;

public class stremsTest02 {
    public static void main(String[] args) {
        List<Livros> livrosList = new ArrayList<>(List.of(
                new Livros("Naruto Manga",140),
                new Livros("Naruto ligth novel",9),
                new Livros("pequeno principe",133),
                new Livros("cao de casa dos beserkvile",100),
                new Livros("cao de casa dos beserkvile livro 2",13),
                new Livros("Naruto ligth novel livro 2",19),
                new Livros("Naruto ligth novel 3" ,93),
                new Livros("Naruto ligth novel 4",90),
                new Livros("Naruto ligth novel 4",90)
        ));

        livrosList.forEach(System.out::println);//  recebe um consumer ou seja nao retorna nada/ livros -> System.out.println(livros)

        System.out.println(livrosList
                .stream()
                .filter(livros -> {
                    return livros.getPaginas() > 20;
                })
                .count() // conta
        );
        System.out.println(
                livrosList.stream()
                        .distinct() // nao pega os elementos que sao iguais
                        .filter(livros -> livros.getPaginas() > 20)
                        .count()
        );
    }
}
