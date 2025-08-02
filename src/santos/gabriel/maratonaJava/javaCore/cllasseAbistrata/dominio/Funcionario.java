package santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.dominio;

/*
classes abistras nao existem em si, tipo funcionario nao existe o que existe e gerente, caixa , etc
foi criado para resolver um problema de disiner no condigo
 */

public abstract class Funcionario extends Pessoa{

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void  calculaBonus ();// as classe que extende de funcionario e obrigado a sobre escrever esse metodo


}
