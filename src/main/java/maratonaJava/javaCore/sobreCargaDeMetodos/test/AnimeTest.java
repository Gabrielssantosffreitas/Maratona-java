package main.java.maratonaJava.javaCore.sobreCargaDeMetodos.test;

import main.java.maratonaJava.javaCore.sobreCargaDeMetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.inicializar("TV","boku no hero",155);
        anime.inicializar("TV","boku no hero 2",15,"shonei");
        // posso usar classes com o mesmo nome mais com quantidades de paremetros diferentes isso e para nao bugar o codigo quando for adicinardo um novo atributo
        anime.imprimir();
    }
}
