package main.java.maratonaJava.introducao;

public class Aula005EstruturaCondicional {
    public static void main(String[] args) {
        byte idade = 15;
        boolean podeComprarBebidaAlcolica = idade >=18;

        float salario = 2000.50F;
        boolean podeComprar = salario > 2000;


        byte idadeMaria = 17;



        if(podeComprarBebidaAlcolica){
            System.out.println("pode");
        }
        if (!podeComprarBebidaAlcolica){ // !inverte
            System.out.println("nao pode ");
        }


        if (podeComprar){
            System.out.println("pode ");
        }
        else {
            System.out.println("nao pode ");
        }


        if (idadeMaria >= 18){
            System.out.println("maria e alduta");
        }
        else if (idadeMaria >= 10 && idadeMaria < 18){
            System.out.println("maria e adolecente ");
        }
        else {
            System.out.println("maria e criança");
        }

        // (condicao) ? verdadeiro : falso

        float salarioParaDoar = 1400.50F;
        String mensagemDoar = "Doar 200 reais ";
        String mensagemNDoar= "Não doar 200 reais";

        String resultado = (salarioParaDoar > 500) ? mensagemDoar : mensagemNDoar;

        System.out.println(resultado);




    }
}
