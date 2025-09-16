package main.java.maratonaJava.javaCore.Associacao.test;

import main.java.maratonaJava.javaCore.Associacao.dominio.Jogador;
import main.java.maratonaJava.javaCore.Associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("pele");
        Time time = new Time("Seleção Brasileira");
        jogador.setTime(time);
        jogador.imprimir(); // 1 para N


    }
}
