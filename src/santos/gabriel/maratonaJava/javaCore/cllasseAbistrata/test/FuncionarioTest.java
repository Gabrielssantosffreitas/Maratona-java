package santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.test;

import santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.dominio.Desenvolverdor;
import santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.dominio.Funcionario;
import santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.dominio.Gerente;
import santos.gabriel.maratonaJava.javaCore.cllasseAbistrata.dominio.Pessoa;

public class FuncionarioTest  {
    public static void main(String[] args) {

        Gerente  gerente = new Gerente("gabriel",7000);
        Desenvolverdor desenvolverdor =new Desenvolverdor("Daniel",2000);


        System.out.println(gerente);
        System.out.println(desenvolverdor);


    }
}
