package santos.gabriel.maratonaJava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        // + - / * %
        // < > <= >= == !=


        int num = 2;
        int num2 = 5;

        double numD = 2;
        double numD2 = 5;

        int resultadoSoma = num+num2;
        int resultadoSubtracao = num-num2;
        int resultadoMultiplicacao = num*num2;
        float resultadoDivisaoEntreInteiro = num/num2;
        double resultadoDivisao = numD/numD2;
        double resultadoRestoDivisao = numD %  numD2;

        boolean num1MaiorQueNum2 = num > num2;
        boolean num2MaiorQueNum1 = num2 > num;

        byte idade = 30;
        float salario = 3500F;
        boolean dentroDaLei = idade > 30 && salario >= 4612;

        float contaCorrente = 300;
        float contaPolpanca = 1400;

        boolean comprarCelular = contaCorrente >= 400 || contaPolpanca >= 1300;




        System.out.println("resultado da soma "+resultadoSoma);
        System.out.println("resultado da sub "+resultadoSubtracao);
        System.out.println("resultado da mult "+resultadoMultiplicacao);
        System.out.println("resultado da div  com numero inteiro "+ resultadoDivisaoEntreInteiro);
        System.out.println("resultado da div "+resultadoDivisao);
        System.out.println("resultado do resto "+resultadoRestoDivisao);
        System.out.println("numero1 e maior que o numero2 "+num1MaiorQueNum2);
        System.out.println("numero1 e maior que o numero2 "+num2MaiorQueNum1);
        System.out.println("esta dentro da  lei "+ dentroDaLei);
        System.out.println("comprar Celular "+comprarCelular);

        //  se jutar string com numero o java concatena ex 30+20 + " valor" = 3020 valor
        // o resultado de uma divisão de numeros inteiros sempre sera inteiro e a divisão de doble doble sempre sera doble
        //  && [and](e) || [or](ou)

    }
}
