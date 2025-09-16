package main.java.maratonaJava.javaCore.Associacao.test;

import main.java.maratonaJava.javaCore.Associacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {


        Jogador jogador1 = new Jogador("pele");
        Jogador jogador2 = new Jogador("romario");
        Jogador jogador3 = new Jogador("tafarel");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores){
            jogador.imprimir();
        }

        // relacionamentos 1-1 1-n  n-n
    }
}
