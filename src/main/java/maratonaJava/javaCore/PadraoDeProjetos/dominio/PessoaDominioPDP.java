package main.java.maratonaJava.javaCore.PadraoDeProjetos.dominio;


import java.util.Objects;

/*
    o padrao de projeto builder server para
    ficar melhor de add os atributos pois quando add os atributos pelo contrutor do metodo fica dificil de dizer qual atributo esta em cada posicao
 */
public class PessoaDominioPDP {
    private String nome;
    private String segundoNome;
    private int idade;
    private  String email;
    private String cpf;

    private PessoaDominioPDP(){

    }

    public PessoaDominioPDP(String nome, String segundoNome, int idade, String email, String cpf) {
        this.nome = nome;
        this.segundoNome = segundoNome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
    }
    public PessoaDominioPDP(String nome, String segundoNome, int idade, String email, String cpf, String cep) {
        this.nome = nome;
        this.segundoNome = segundoNome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
    }

    public static class PessoaBuilder{
        private String nome;
        private String segundoNome;
        private int idade;
        private  String email;
        private String cpf;

        public PessoaBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder setSegundoNome(String segundoNome) {
            this.segundoNome = segundoNome;
            return this;
        }

        public PessoaBuilder setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public PessoaBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilder setCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }
        public PessoaDominioPDP builder (){
            return new PessoaDominioPDP(nome,segundoNome,idade,email,cpf);
        }
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        PessoaDominioPDP that = (PessoaDominioPDP) o;
        return idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(segundoNome, that.segundoNome) && Objects.equals(this.email, that.email) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(segundoNome);
        result = 31 * result + idade;
        result = 31 * result + Objects.hashCode(this.email);
        result = 31 * result + Objects.hashCode(cpf);
        return result;
    }

    @Override
    public String toString() {
        return "PessoaDominioPDP{" +
                "nome='" + nome + '\'' +
                ", segundoNome='" + segundoNome + '\'' +
                ", idade=" + idade +
                ", Email='" + this.email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
