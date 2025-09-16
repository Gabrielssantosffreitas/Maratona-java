package main.java.maratonaJava.javaCore.test;

import main.java.maratonaJava.javaCore.test.dominio.Telefone;

public class EqualsCollectionTest {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("sansung","xx xxxxx-xxxx");
        Telefone telefone1 = new Telefone("sansung", "yy yyyyy-yyyy");
        Telefone telefone2 = new Telefone("xaiome", "yx xyxyy-xyxy");


        System.out.println(telefone1.equals(telefone));
        System.out.println(telefone2.equals(telefone));
    }
}
