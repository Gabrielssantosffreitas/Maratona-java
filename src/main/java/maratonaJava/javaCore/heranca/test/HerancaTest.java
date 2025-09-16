package main.java.maratonaJava.javaCore.heranca.test;

import main.java.maratonaJava.javaCore.heranca.dominio.Endereco;
import main.java.maratonaJava.javaCore.heranca.dominio.Funcionario;
import main.java.maratonaJava.javaCore.heranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", "xxxxxxx-xx");
        Endereco endereco = new Endereco("rua das laranjas", "xxx-xx");
        pessoa.setEndereco(endereco);


        pessoa.imprimir();


        Funcionario funcionario = new Funcionario("pedro", "MMMmmmMMM-mm",5000.333D);

        funcionario.setEndereco(endereco);

        funcionario.imprimir();

    }
}