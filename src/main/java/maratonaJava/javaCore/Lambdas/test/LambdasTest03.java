package main.java.maratonaJava.javaCore.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest03 {


    // A function recebe algo processa e retorna algo diferente do predocate que o retorno ja e predefinodo aqui nao e
    private static  <T,R>  List<R> mape (List<T> list, Function<T,R> function){
        List<R> listaNova = new ArrayList<>(list.size());

        for(T e : list){
            R r = function.apply(e);
            listaNova.add(r);
        }
        return listaNova;
    } // T tem R retorna

    public static void main(String[] args) {
        List<String> list = List.of("gabriel","daniel","pai");
         List<String>  momesMaisculos = LambdasTest03.mape(list,nome -> nome.toUpperCase());
    }
}
