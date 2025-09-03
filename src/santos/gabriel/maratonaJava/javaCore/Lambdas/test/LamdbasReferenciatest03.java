package santos.gabriel.maratonaJava.javaCore.Lambdas.test;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class LamdbasReferenciatest03 {
    public static void main(String[] args) {
        List<String> nomes = List.of("gabriel",
                "daniel",
                "pedro",
                "betty");
        Function<String,Integer> stringNumeroParaInterger = Integer::parseInt; // possso criar um metodo de Referencia
        System.out.println(stringNumeroParaInterger.apply("40"));

        BiPredicate<List<String>,String> nomeExiste = List::contains;

        System.out.println(nomeExiste.test(nomes,"gabriel"));

    }


}
