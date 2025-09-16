package main.java.maratonaJava.javaCore.cllasseAbistrata.dominio;

public  class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimir() {

    }

    @Override
    public void calculaBonus(){
        this.salario *= 0.1;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
