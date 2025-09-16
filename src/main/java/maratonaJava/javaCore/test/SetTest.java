package main.java.maratonaJava.javaCore.test;

import main.java.maratonaJava.javaCore.test.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<Manga> mangas =  new HashSet<>();// set nao deixa mais de objeto ser gravado na colecoes o hash ele ordena pelo hash
        mangas.add(new Manga(1,"dam da dam",143,4));
        mangas.add(new Manga(2,"naruto",193,1));
        mangas.add(new Manga(3,"dracon ball ",123,2));


        System.out.println(mangas);
    }
}
