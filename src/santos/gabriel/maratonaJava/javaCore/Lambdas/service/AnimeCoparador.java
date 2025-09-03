package santos.gabriel.maratonaJava.javaCore.Lambdas.service;

import santos.gabriel.maratonaJava.javaCore.Lambdas.dominio.AnimeDominioLambdas;

public class AnimeCoparador {
    public static int compararPorNome(AnimeDominioLambdas a1 , AnimeDominioLambdas a2){
        return a1.getNome().compareTo(a2.getNome());
    }
    public static int compararPorEpsodios(AnimeDominioLambdas a1, AnimeDominioLambdas a2){
        return a1.getEpsodios().compareTo(a2.getEpsodios());
    }
    public  int nEstaticocompararPorEpsodios(AnimeDominioLambdas a1, AnimeDominioLambdas a2){
        return a1.getEpsodios().compareTo(a2.getEpsodios());
    }

}
