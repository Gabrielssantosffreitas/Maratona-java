package santos.gabriel.maratonaJava.javaCore.Lambdas.test;

import santos.gabriel.maratonaJava.javaCore.Lambdas.dominio.AnimeDominioLambdas;
import santos.gabriel.maratonaJava.javaCore.Lambdas.service.AnimeCoparador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class LambdaReferenciaTes01 {
    public static void main(String[] args) {


        List<AnimeDominioLambdas> list = new ArrayList<>(List.of(new AnimeDominioLambdas("naruto", 100),
                new AnimeDominioLambdas("boruto", 90),
                new AnimeDominioLambdas("gashaguta", 12),
                new AnimeDominioLambdas("a lenda do heroi", 9000)));

        AnimeCoparador animeCoparador = new AnimeCoparador();

        list.sort(AnimeCoparador::compararPorEpsodios); // :: passa a referencia do metodo
        System.out.println(list);
        list.sort(AnimeCoparador::compararPorNome);
        System.out.println(list);
        list.sort(animeCoparador::nEstaticocompararPorEpsodios); // para passar o metodo nao estatico pode fazer assim
        list.sort(AnimeDominioLambdas::compareTo);// posso passa isso por a classe que eu vou aplicar o compareTo tem ele menmo que nao seja statico



    }
}
