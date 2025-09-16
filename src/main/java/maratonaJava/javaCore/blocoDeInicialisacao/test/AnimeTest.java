package main.java.maratonaJava.javaCore.blocoDeInicialisacao.test;

import main.java.maratonaJava.javaCore.blocoDeInicialisacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("bragonbol");
        for (int i = 0; i < anime.getEpisodios().length; i++) {
            System.out.println(anime.getEpisodios()[i]);
        }
    }
}
