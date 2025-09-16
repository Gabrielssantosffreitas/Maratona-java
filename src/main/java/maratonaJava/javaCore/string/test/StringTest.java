package main.java.maratonaJava.javaCore.string.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "gabriel"; // string constant pool
        String nome2 = "gabriel"; // string constant pool
        System.out.println(nome == nome2); // == mostra se faz referencia para o mesmo objeto
        // o java so e possivel mudar a String se atribuirmos um novo valor para ela

        nome.concat(" santos");

        System.out.println( nome);
        System.out.println("---");

        nome = nome.concat(" santos");

        System.out.println(nome );


    }
}
