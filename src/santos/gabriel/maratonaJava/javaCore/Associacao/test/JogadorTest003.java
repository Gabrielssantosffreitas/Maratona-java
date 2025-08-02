package santos.gabriel.maratonaJava.javaCore.Associacao.test;

import santos.gabriel.maratonaJava.javaCore.Associacao.dominio.Jogador;
import santos.gabriel.maratonaJava.javaCore.Associacao.dominio.Time;

public class JogadorTest003 {

    public static void main(String[] args) {


        Jogador jogador = new Jogador("pelé");
        Time time = new Time("Brasil");

        jogador.setTime(time);

        time.setJogadores(new Jogador[]{jogador});

        time.imprimir();
        jogador.imprimir();
    }


}
