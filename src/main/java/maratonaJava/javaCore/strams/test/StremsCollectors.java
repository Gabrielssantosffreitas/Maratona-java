package main.java.maratonaJava.javaCore.strams.test;

import main.java.maratonaJava.javaCore.strams.dominio.Livros;

import java.util.*;
import java.util.stream.Collectors;

public class StremsCollectors {
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

        System.out.println(livrosList.stream().collect(Collectors.counting()));

        livrosList.stream()
                .max(Comparator.comparing(Livros::getPaginas))
                .ifPresent(System.out::println);

        livrosList
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Livros::getPaginas))).ifPresent(System.out::println);

        System.out.println(livrosList
                .stream()
                .collect(Collectors.summingInt(Livros::getPaginas)));

        System.out.println(livrosList
                .stream()
                .collect(Collectors.averagingInt(Livros::getPaginas)));

        System.out.println(livrosList
                .stream()
                .collect(Collectors.summarizingInt(Livros::getPaginas)));

        System.out.println(livrosList.stream()
                .map(Livros::getTitulos)
                .collect(Collectors.joining(" -> ")));

        System.out.println(livrosList.stream()
                .map(Livros::getTitulos)
                .collect(Collectors.joining(" -> ")));
    }
}
