package santos.gabriel.maratonaJava.javaCore.test;

import java.util.ArrayList;
import java.util.List;

public class ListasTest {
    public static void main(String[] args) {
        List<String> nomes =  new ArrayList<>(100);//
        List<String> nomes2 =  new ArrayList<>(100);// // capacidade inicial para evitar de ficar redmencionando o array

        nomes2.add("fabiana");
        nomes2.add("rafaela");


        nomes.add("gabriel");
        nomes.add("daniel");
        nomes.add("rafael");
        nomes.add("daniele");
        nomes.add("julia");
        nomes.add("larissa");

        System.out.println("-------------------");
        System.out.println(nomes);

        nomes.remove("daniele");
        nomes.remove(1);

        System.out.println("-------------------");
        System.out.println(nomes);

        nomes.removeLast();


        System.out.println("-------------------");
        System.out.println(nomes);

        nomes.addAll(nomes2);

        System.out.println("-------------------");
        System.out.println(nomes);

    }
}
