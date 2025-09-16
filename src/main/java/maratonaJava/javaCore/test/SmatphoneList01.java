package main.java.maratonaJava.javaCore.test;

import main.java.maratonaJava.javaCore.test.dominio.Telefone;

import java.util.ArrayList;
import java.util.List;

public class SmatphoneList01 {


    public static void main(String[] args) {
        Telefone telefone1 = new Telefone("iphone","(xx) xxxxx-xxxx");
        Telefone telefone2 = new Telefone("xaiome","(zz) zxzxz-xzxz");
        Telefone telefone3 = new Telefone("motorola","(yy) yyyyy-xxxx");
        Telefone telefone4 = new Telefone("iphone","(yy) yyyyy-xxxx");

        List<Telefone> telefoneList = new ArrayList<>(10);

        telefoneList.addAll(List.of(telefone1,telefone2,telefone3));

        System.out.println(telefoneList);

        System.out.println(telefoneList.contains(telefone4));// usa o equals do objeto
        System.out.println("----------------------------------");
        System.out.println(telefoneList.indexOf(telefone2));


    }
}
