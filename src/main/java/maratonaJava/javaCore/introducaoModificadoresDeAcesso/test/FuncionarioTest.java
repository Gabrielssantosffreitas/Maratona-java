package main.java.maratonaJava.javaCore.introducaoModificadoresDeAcesso.test;

import main.java.maratonaJava.javaCore.introducaoModificadoresDeAcesso.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Pedro");
        funcionario.setIdade(25);
        funcionario.setSalarios(1500.34,2000.23,1200.12);

        System.out.println("media pelo getter antes de fazer a media "+funcionario.getMedia());

        funcionario.mediaSalarios();

        System.out.println("Media pelo getter "+funcionario.getMedia());


    }
}
