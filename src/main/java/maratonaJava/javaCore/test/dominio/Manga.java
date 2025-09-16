package main.java.maratonaJava.javaCore.test.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private long id;
    private String nome;
    private int episodios;
    private  int quantidade;

    public Manga() {
    }

    public Manga(long id, String nome, int episodios) {
        this.id = id;
        this.nome = nome;
        this.episodios = episodios;
    }

    public Manga(long id, String nome, int episodios, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.episodios = episodios;
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", episodios=" + episodios +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && episodios == manga.episodios && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, episodios);
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    @Override
    public int compareTo(Manga o) { // comparar para usa na ordenação
        // se for antes desse objeto this < o return -1
        // se for depois this > o return 1
        // se for igual ths == o return 0

        if (this.id < o.id)return -1;
        if (this.id > o.id)return 1;
        else return 0;

    }
}
