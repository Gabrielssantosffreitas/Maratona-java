package main.java.maratonaJava.javaCore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "gabriel";
        nome = nome.toUpperCase();
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
        System.out.println(nome.substring(0,2)); // n -- n-1

        nome = "                  gabriel ";
        System.out.println(nome);
        System.out.println(nome.trim()); // retira os espaços
    }
}
