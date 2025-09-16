package main.java.maratonaJava.javaCore.PadraoDeProjetos.test;

import main.java.maratonaJava.javaCore.PadraoDeProjetos.dominio.PessoaDominioPDP;

public class PDPBuilderTest {
    public static void main(String[] args) {
        PessoaDominioPDP pessoaDominioPDP = new PessoaDominioPDP.PessoaBuilder()
                .setCpf("02265710696")
                .setCpf("02265710696")
                .setEmail("gabrielsantos022freitas@gmail.com")
                .setSegundoNome("santos")
                .setCpf("02265710696")
                .builder();
        System.out.println(pessoaDominioPDP);
    }
}
