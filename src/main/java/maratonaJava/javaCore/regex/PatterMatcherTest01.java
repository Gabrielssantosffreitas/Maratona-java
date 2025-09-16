package main.java.maratonaJava.javaCore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    public static void main(String[] args) {
        /*
        \d todos os digitos ,
        \D tudo que NAO for digito
        \s tudos os espaços em branco
        \S tudo que nao e espaço
        \w tudo de a-z e de A-Z, digitos e  _
        \W tudo que nao e de A-Z e de a-z , digito s e _

         */
        String regex = "\\D";
        // String texto = "abaaab";
        String texto = "12weqwe3jkdjaf132wqe41kjkdjfasj";
        Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(texto);

       while (matcher.find())// tiver procurando
       {
           System.out.print(matcher.start()+", "+matcher.group()+"\n");
       }
    }
}
