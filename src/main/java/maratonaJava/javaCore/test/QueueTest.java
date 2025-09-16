package main.java.maratonaJava.javaCore.test;

import main.java.maratonaJava.javaCore.test.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class PrioridadeMaiorEp implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        if(o1.getEpisodios() < o2.getEpisodios()){ return  -1;}
        if(o1.getEpisodios() >  o2.getEpisodios()){return 1;}
        else { return 0;}
    }
}
public class QueueTest {
    public static void main(String[] args) {
        Queue<Manga> pilha = new PriorityQueue<>(new PrioridadeMaiorEp());
        pilha.add(new Manga(1,"naruto",142,13));
        pilha.add(new Manga(2,"naruto shipundem",122,13));
        pilha.add(new Manga(3,"boruto",142,13));
        System.out.println(pilha);
        while (!pilha.isEmpty()){
            System.out.println(pilha.poll());
        }
    }
}
