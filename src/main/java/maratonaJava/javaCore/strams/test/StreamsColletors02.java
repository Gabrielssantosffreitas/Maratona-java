package main.java.maratonaJava.javaCore.strams.test;

import main.java.maratonaJava.javaCore.strams.dominio.Categorias;
import main.java.maratonaJava.javaCore.strams.dominio.Livros;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsColletors02 {
    public static void main(String[] args) {
        List<Livros> livrosList = new ArrayList<>(List.of(
                new Livros("Naruto Manga",140, Categorias.setCategorias(0)),
                new Livros("Naruto ligth novel",9,Categorias.setCategorias(2)),
                new Livros("pequeno principe",133,Categorias.setCategorias(1)),
                new Livros("cao de casa dos beserkvile",100,Categorias.setCategorias(3)),
                new Livros("cao de casa dos beserkvile livro 2",13,Categorias.setCategorias(1)),
                new Livros("Naruto ligth novel livro 2",19,Categorias.setCategorias(2)),
                new Livros("Naruto ligth novel 3" ,93,Categorias.setCategorias(1)),
                new Livros("Naruto ligth novel 4",90,Categorias.setCategorias(3)),
                new Livros("Naruto ligth novel 4",90,Categorias.setCategorias(1))
        ));

        // para criar gurpos de algo utilise o gruping by

        Map<Categorias, List<Livros>> byCategorias = livrosList
                .stream()
                .collect(Collectors.groupingBy(Livros::getCategorias));
        System.out.println(byCategorias);

        System.out.println(
                livrosList
                        .stream()
                        .collect(
                                Collectors.groupingBy(Livros::getCategorias,
                                        Collectors.groupingBy(livros -> livros.getPaginas() > 90 ? "GRANDE" : "PEQUENO" ))
                        )
        );

        System.out.println(
                livrosList
                        .stream()
                        .collect(Collectors.toMap(
                                Livros::getCategorias,
                                Function.identity(),
                                BinaryOperator.maxBy(Comparator.comparing(Livros::getCategorias))
                        ))
        );

        System.out.println(
                livrosList
                        .stream()
                        .collect(
                                Collectors.groupingBy(Livros::getCategorias,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Livros::getPaginas)),
                                        Optional::get
                                        )))
        );

        System.out.println(
                livrosList
                        .stream()
                        .collect(Collectors.groupingBy(
                                Livros::getCategorias,
                                Collectors.mapping(
                                        livros -> livros.getPaginas() > 100 ?  "GRANDE": "PEQUENO",
                                        Collectors.toCollection(LinkedHashSet::new))))
        );


    }
}
