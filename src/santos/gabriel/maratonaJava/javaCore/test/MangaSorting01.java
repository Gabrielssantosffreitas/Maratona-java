package santos.gabriel.maratonaJava.javaCore.test;

import santos.gabriel.maratonaJava.javaCore.test.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaSortingComparotorName implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class MangaSorting01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(List.of(new Manga(1,"boku no hero",110),
                new Manga(4,"naruto",110),
                new Manga(2,"dragonboll",110),
                new Manga(3,"2em1",110)));


        System.out.println(mangas);
        Collections.sort(mangas);
        System.out.println(mangas);
        System.out.println("----------");
        mangas.sort(new MangaSortingComparotorName());
        System.out.println(mangas);

    }
}
