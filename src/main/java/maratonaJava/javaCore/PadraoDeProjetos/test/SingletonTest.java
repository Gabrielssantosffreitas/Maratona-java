package main.java.maratonaJava.javaCore.PadraoDeProjetos.test;

import main.java.maratonaJava.javaCore.PadraoDeProjetos.enums.Aviao;

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println(marcarAcento());
        System.out.println(marcarAcento());
        System.out.println(marcarAcento());
        System.out.println(marcarAcento());
        System.out.println(marcarAcento());
        System.out.println(marcarAcento());
        System.out.println(marcarAcento());
    }

    private static  boolean marcarAcento (){
            Aviao aviao = Aviao.ISTACIA;
        return aviao.getCadeira("1a");
    }

}
