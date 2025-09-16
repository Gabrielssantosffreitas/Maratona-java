package main.java.maratonaJava.javaCore.modificadorStatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = new int[100]; // um valor so para todos os animes
//    {
//        for (int i = 0; i < episodios.length; i++) {
//            episodios[i] = i+1;
//            System.out.println(episodios[i] = i+1);
//        }
//
//    }// bloco de inicialisao ele acontece primero que o construtor || esse bloco e exucutado varias veses
    // toda vez que criamos um objeto


    static {

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.println(episodios[i] = i + 1);
        }

    }// esse bloco so e inicialisando uma vez

    public Anime() {

    }// a

    public Anime(String nome) {
        this.nome = nome;
    }// se fiser assim sem o bloco de inicialisacao o construtor "a" nao funciona se for usado esse construtor

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int... episodios) {
        Anime.episodios = episodios;
    }

}

