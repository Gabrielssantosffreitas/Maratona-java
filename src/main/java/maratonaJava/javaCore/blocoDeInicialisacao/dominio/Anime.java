package main.java.maratonaJava.javaCore.blocoDeInicialisacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = new int[100];
    {
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

    }// bloco de inicialisao ele acontece primero que o construtor
    public Anime (){

    }// a
    public Anime(String nome){
        this.nome = nome;
    }// se fiser assim sem o bloco de inicialisacao o construtor "a" nao funciona se for usado esse construtor

    public int[] getEpisodios() {
        return episodios;
    }
}



