package santos.gabriel.maratonaJava.javaCore.Construtor.test;

import santos.gabriel.maratonaJava.javaCore.Construtor.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("TV","boku no hero 2",15,"shonei");
        Anime anime2 = new Anime("manga","diario de uma opetecaria",24,"sheni","bela");





//        anime.inicializar("TV","boku no hero",155);
//        anime.inicializar("TV","boku no hero 2",15,"shonei");

        anime.imprimir();
        anime2.imprimir();
    }
}
