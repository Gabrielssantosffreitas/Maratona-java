package santos.gabriel.maratonaJava.javaCore.heranca.dominio;

public class Pessoa {
//    private  String nome; assim as classe que herda pessoa nao tem acesso
//    private  String cpf;
//    private Endereco endereco;

    protected   String nome;
    protected   String cpf; // aqui a classe que herda e as  classe no mesmo peckage pode usar
    protected Endereco endereco;


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        if (endereco == null )return;
        System.out.println(this.endereco.getCep());
        System.out.println(this.endereco.getRua());
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
