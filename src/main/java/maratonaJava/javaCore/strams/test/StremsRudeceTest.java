package main.java.maratonaJava.javaCore.strams.test;

import java.util.List;

public class StremsRudeceTest {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,4,5,6,7,8,9,0);

        numeros.stream()
                .reduce((x,y)-> x+y) // ele recebe dois paramentros e rotar um opitcional ele basicamente eculuma coisas ma lista
                .ifPresent(System.out::println);

        numeros
                .stream()
                .reduce((numeroGuardado,numerosDaLista)-> numeroGuardado > numerosDaLista ? numeroGuardado : numerosDaLista )
                .ifPresent(System.out::println);


    }
}
