package main.java.maratonaJava.javaCore.test;

import main.java.maratonaJava.javaCore.test.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntereitorTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(10);
        mangas.add(new Manga(1,"gabriel",14,10));
        mangas.add(new Manga(2,"gabriel1",14,0));

        Iterator<Manga> iterator = mangas.iterator(); // verifica algumas coisas antes fazer algo bom para remover ou atulisar qual quer item de forma segura

        System.out.println(mangas);
        while(iterator.hasNext()){
            Manga next = iterator.next();
            if(next.getQuantidade() < 1){
                iterator.remove();
            }
        }
        System.out.println(mangas);
    }
}
