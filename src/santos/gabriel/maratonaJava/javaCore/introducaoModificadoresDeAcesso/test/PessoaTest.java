package santos.gabriel.maratonaJava.javaCore.introducaoModificadoresDeAcesso.test;

import santos.gabriel.maratonaJava.javaCore.introducaoModificadoresDeAcesso.dominio.Pessoas;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas();
        pessoa.setNome("Carlos");
        pessoa.setIdade(20);
        pessoa.setSexo('M');

        pessoa.mostrar();
    }

}
