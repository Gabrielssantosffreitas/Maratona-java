package main.java.maratonaJava.javaCore.Generics.dominio;

public  abstract  class Veiculos {
    protected String nome;
    protected  double Preco;

    public Veiculos() {
    }

    public Veiculos(String nome, double preco) {
        this.nome = nome;
        Preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}
