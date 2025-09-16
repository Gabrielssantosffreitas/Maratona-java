package main.java.maratonaJava.javaCore.FormatacaoNumero.test;

import java.util.Locale;

public class Formatacao0 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] paises = Locale.getISOCountries();
        String[] idioma = Locale.getISOLanguages();

        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
        System.out.println("-----");
        for (int i = 0; i < idioma.length; i++) {
            System.out.println(idioma[i]);
        }

    }
}
