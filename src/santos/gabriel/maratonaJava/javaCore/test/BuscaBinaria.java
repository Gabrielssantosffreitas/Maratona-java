package santos.gabriel.maratonaJava.javaCore.test;

import santos.gabriel.maratonaJava.javaCore.test.dominio.Manga;

import java.util.*;

class MangaSortingComparotorName1 implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class BuscaBinaria {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(List.of(new Manga(1, "boku no hero", 110),
                new Manga(4, "naruto", 110),
                new Manga(2, "dragonboll", 110),
                new Manga(3, "2em1", 110)));

        // para fazer a busca binaria presisa esta ordenada a lista
        Collections.sort(mangas);
        int indece = Collections.binarySearch(mangas, new Manga(1, "boku no hero", 110));// usa o equals
        System.out.println(indece);// caso venha negativo e porque nao existe e ele sugere onde inserir o novo dado ele seque essa formula (-indeceDeincercao -1 )
        System.out.println("--------------");
        // caso queira usar outra ordenação use a ordenação com parametro
        mangas.sort(new MangaSortingComparotorName1());
        System.out.println(Collections.binarySearch(mangas, new Manga(2, "dragonboll", 110),new MangaSortingComparotorName1()));




    }
}
