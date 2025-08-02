package santos.gabriel.maratonaJava.javaCore.introducaoMetodo.test;

import santos.gabriel.maratonaJava.javaCore.introducaoMetodo.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "pedro";
        funcionario.idade = 32;
        funcionario.salarios = new double[]{1500.12d, 1300.32d, 2000};

        funcionario.mostrarDados();
        funcionario.mediaSalarios();


    }
}
