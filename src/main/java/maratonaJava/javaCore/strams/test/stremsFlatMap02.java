package main.java.maratonaJava.javaCore.strams.test;

import java.util.Arrays;
import java.util.List;

public class stremsFlatMap02 {
    public static void main(String[] args) {
        List<String> palavras = List.of(
                "pega",
                "pega",
                "na",
                "vila",
                "da",
                "folha"
        );

        palavras.stream()
                .map(p->p.split(""))// stream<char[]>
                .flatMap(Arrays::stream) // strem<char>
                .toList().forEach(System.out::print);
    }
}
