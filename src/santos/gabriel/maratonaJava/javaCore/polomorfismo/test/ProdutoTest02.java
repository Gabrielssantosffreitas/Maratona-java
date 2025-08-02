package santos.gabriel.maratonaJava.javaCore.polomorfismo.test;

import santos.gabriel.maratonaJava.javaCore.polomorfismo.dominio.Computador;
import santos.gabriel.maratonaJava.javaCore.polomorfismo.dominio.Produto;
import santos.gabriel.maratonaJava.javaCore.polomorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("i9", 900); // do mais generico para o meios expicifico

        // a classes generica nao pode usar os metodos ou variaves da classe esprecifica
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.Imposto());

        System.out.println("----------------------");

        Produto produto2 = new Tomate("americano", 20, "10-10-2025");

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.Imposto());

        // produto2.getValidade() nao existe para classe Produto logo ela nao tem uma refercia para executar no objeto

        System.out.println("----------------------");

        Tomate tomate = new Tomate("americano", 20, "10-10-2025");

        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.Imposto());
        System.out.println(tomate.getValidade()); // no tomete eu tenho meu getvalidade



    }

}
