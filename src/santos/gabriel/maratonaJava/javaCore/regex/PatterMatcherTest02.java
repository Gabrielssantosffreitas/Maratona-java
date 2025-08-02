package santos.gabriel.maratonaJava.javaCore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        /*
        \d todos os digitos ,
        \D tudo que NAO for digito
        \s tudos os espaços em branco
        \S tudo que nao e espaço
        \w tudo de a-z e de A-Z, digitos e  _
        \W tudo que nao e de A-Z e de a-z , digito s e _
        [] caracteres
        ?  zero ou uma ocorrencia
        * zero ou mais
        + uma ou mais ocorrencia
        {n-m} de n a m
        () agrupamento o(V/C)o ovo ou oco V ou C
        | ou
        $ fim da linha
        . tudo que couber  no lugar do . ex 1.3 = 123 133 1#3 ect
        ^ começo da linha
        [^ ] negaçao
         */
        String regex = "0[Xx]([0-9a-fA-F])+(\\s|$)";
        // String texto = "abaaab";
        String texto = "12x 3190232 0XFG12 0XFF32 minha 0X10G 0X1";
        Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(texto);

       while (matcher.find())// tiver procurando
       {
           System.out.print(matcher.start()+", "+matcher.group()+"\n");
       }

        System.out.println("ola mundo".matches(regex));
    }
}
