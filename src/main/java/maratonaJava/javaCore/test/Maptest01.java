package main.java.maratonaJava.javaCore.test;

import main.java.maratonaJava.javaCore.test.dominio.Manga;
import main.java.maratonaJava.javaCore.test.dominio.Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maptest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // usa o hash a chave nunca poser a mesma
        map.put("gabriel", "Gabriel"); // caso gabriel ja tenha um gabriel ele vai substituir
        map.putIfAbsent("daniel", "Daniel"); // caso daniel ja exista ele nao faz nada
        map.keySet(); // retorna um set;
        map.values();// retorna uma collaction
        // formas de usar o for com map

        for (String values : map.values()) {
            System.out.println(values);
        }
        System.out.println("----");
        for (String key : map.keySet()) {
            System.out.println("{" + key + ":" + map.get(key) + "}");
        }
        System.out.println("------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("{" + entry.getKey() + "-" + entry.getValue() + "}");
        }


        Map<Pessoa, List<Manga>> compra = new HashMap<>();

        compra.put(new Pessoa("Gabriel", "xxxxxxxx-xx"), new ArrayList<>(List.of(new Manga(1, "naruto", 154, 1), new Manga(2, "naruto shipudem", 124, 1), new Manga(1, "boruto", 114, 1))));

        System.out.println("---");
        for (Map.Entry<Pessoa, List<Manga>> entry : compra.entrySet()) {
            System.out.println("{" + entry.getKey().getNome() + ":");
            System.out.print("[");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNome() + ", " );
            }
            System.out.println("]");
            System.out.println("}");
        }
    }
}

