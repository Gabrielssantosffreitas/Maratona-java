package main.java.maratonaJava.javaCore.polomorfismo.servico;

import main.java.maratonaJava.javaCore.polomorfismo.dominio.Computador;
import main.java.maratonaJava.javaCore.polomorfismo.dominio.Produto;
import  main.java.maratonaJava.javaCore.polomorfismo.dominio.Tomate;
public class CalculadoraImposto {

    public static void calcularImpostoDoPc(Computador pc) {
        System.out.println("calcular Imposto calculadora imposto");
        System.out.println("seu produto com imposto: " + pc.Imposto());
    }
    // duas funcão com o mesmo codigo para resolver isso vamos usar polimorfimos
    public static void calcularImpostoDoTomate(Tomate tomate) {
        System.out.println("calcular Imposto calculadora imposto");
        System.out.println("seu produto com imposto: " + tomate.Imposto());
    }
    public  static  void  calcularImpostoProduto(Produto produto){
        System.out.println("calcular Imposto calculadora imposto");
        System.out.println("seu produto com imposto: " + produto.Imposto());// agora tanto o tomate com pc como qual quer produto pode ser chamado por esse metodo
        if (produto instanceof  Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getValidade());
        }
    }

}

// regras de negocio
