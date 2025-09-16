package main.java.maratonaJava.javaCore.cllasseAbistrata.test;

import main.java.maratonaJava.javaCore.cllasseAbistrata.dominio.Desenvolverdor;
import main.java.maratonaJava.javaCore.cllasseAbistrata.dominio.Gerente;

public class FuncionarioTest  {
    public static void main(String[] args) {

        Gerente  gerente = new Gerente("gabriel",7000);
        Desenvolverdor desenvolverdor =new Desenvolverdor("Daniel",2000);


        System.out.println(gerente);
        System.out.println(desenvolverdor);


    }
}
