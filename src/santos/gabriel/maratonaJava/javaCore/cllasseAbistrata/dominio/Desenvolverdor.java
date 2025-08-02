package santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.dominio;

public class Desenvolverdor extends Funcionario {
    public Desenvolverdor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimir() {

    }

    @Override
    public void calculaBonus(){
        this.salario *= 0.05;
    }


    @Override
    public String toString() {
        return "Desenvolverdor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
