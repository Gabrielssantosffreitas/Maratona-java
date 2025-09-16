package main.java.maratonaJava.javaCore.test.dominio;

import java.util.Comparator;
import java.util.Objects;



public class Pessoa  implements  Comparable<Pessoa>{
    private String nome;
    private String cpf;


    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareTo(o.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(cpf);
        return result;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
class OrdernacaoCpf implements Comparator<Pessoa>
{
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getCpf().compareTo(o2.getCpf());

    }
}