package santos.gabriel.maratonaJava.javaCore.strams.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class stremsFlatMap {
    public static void main(String[] args) {
        List<List<String>> funcionario =  new ArrayList<>();
        List<String> markting = new LinkedList<>(List.of(

                "daniel",
                "cleiton",
                "paulo",
                "cliclado"

        ));
        List<String> ti = new LinkedList<>(List.of(

                "altair",
                "altavoltado",
                "elafer",
                "elirbag"

        ));
        List<String> loja = new LinkedList<>(List.of(

                "marta",
                "cleitona",
                "herika",
                "cliclada"

        ));

        funcionario.add(loja);
        funcionario.add(ti);
        funcionario.add(markting);
        System.out.println("\n---------------------------------------------------------\n");
        funcionario.forEach(lista -> lista.forEach(System.out::println));
        System.out.println("\n---------------------------------------------------------\n");
       // funcionario.stream().map(l-> l.stream()); strems<Strems<strings>>
        funcionario.stream()
                .flatMap(List::stream) // strems de strings
                .forEach(System.out::println);


    }
}
