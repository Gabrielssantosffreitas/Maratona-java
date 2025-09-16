package main.java.maratonaJava.javaCore.heranca.dominio;

public class Funcionario extends Pessoa{
    private  double salario;
    public Funcionario(String nome, String cpf,double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void imprimir(){//sobre escrever
        super.imprimir();
        System.out.println(this.salario);

    }
    public void relatorio(){
        System.out.println("EU "+ this.nome);
    }
}


