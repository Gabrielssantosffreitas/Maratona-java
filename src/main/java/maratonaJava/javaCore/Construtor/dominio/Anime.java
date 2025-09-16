package main.java.maratonaJava.javaCore.Construtor.dominio;

public class Anime {


    private String tipo;
    private String nome;
    private int episodio;
    private String genero;
    private String estudio;

    public Anime(String tipo, String nome, int episodio, String genero) { //construtor
        this(); //construtor
        this.nome = nome;
        this.episodio = episodio;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Anime(String tipo, String nome, int episodio, String genero,String estudio) { //construtor
        this(tipo, nome, episodio, genero); //construtor
        this.estudio = estudio;
    }

    public Anime (){ // sobrecarca de construtures

    }


    public void imprimir() {
        System.out.println("Tipo: " + this.tipo + "\nNome: " + this.nome + "\nQuantidade de episodios: " + this.episodio + "\nGenero: " + this.genero+"\nEstudio: "+this.estudio);
    }
//
//
//    public void inicializar(String tipo, String nome, int episodio) {
//        this.nome = nome;
//        this.episodio = episodio;
//        this.tipo = tipo;
//
//    }

//    // posso usar classes com o mesmo nome mais com quantidades de paremetros diferentes
//    public void inicializar(String tipo, String nome, int episodio, String genero) {
//        this.inicializar(tipo, nome, episodio);
//        this.genero = genero;
//
//    }

    // --------------------------------

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // --------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // --------------------------------

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
    // --------------------------------


}
