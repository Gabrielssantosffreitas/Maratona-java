package main.java.maratonaJava.javaCore.strams.test;

import main.java.maratonaJava.javaCore.strams.dominio.Livros;

import java.util.ArrayList;
import java.util.List;

public class StremsRecuce02 {
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


        livrosList
                .stream()
                .filter(livros -> livros.getPaginas() > 4)
                .map(livros -> livros.getPaginas())
                .reduce((acumulador,paginas)-> acumulador+paginas)
                .ifPresent(System.out::println); // valor -> System.out.println(valor)

        int sum = livrosList
                .stream()
                .filter(livros -> livros.getPaginas() > 90)
                .mapToInt(livros -> livros.getPaginas())
                .sum();

        System.out.println(sum);



    }
}
