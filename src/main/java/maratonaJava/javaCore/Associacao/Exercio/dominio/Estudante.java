package main.java.maratonaJava.javaCore.Associacao.Exercio.dominio;

public class Estudante {
    private String nome;
    private byte idade;
    private Seminario seminario;

    public Estudante(String estudante, byte idade) {
        this.nome = estudante;
        this.idade = idade;

    }

    public String getEstudante() {
        return nome;
    }

    public void setEstudante(String estudante) {
        this.nome = estudante;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
