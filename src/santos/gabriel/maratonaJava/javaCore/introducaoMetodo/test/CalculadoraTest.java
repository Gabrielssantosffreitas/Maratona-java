package santos.gabriel.maratonaJava.javaCore.introducaoMetodo.test;

import santos.gabriel.maratonaJava.javaCore.introducaoMetodo.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subitrairDoisNumeros();
        calculadora.multiplicarDoisNumero(10, 20);

        double numeroDivido = calculadora.dividirDoisNumeros(20.23D, 2.3D);

        System.out.println("--------");
        calculadora.mostrarRestoDaDivDeDoisNum(15, 2);

        System.out.println(numeroDivido);
        System.out.println("--------");

        int num1 = 13;
        int num2 = 3;
        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("dentro da calculadora test\n" + num1 + "\n" + num2);// tipos primitivos nao mudam pois o que e passado e so o valor


        System.out.println("------------------------------------------------------------------------------------");

        calculadora.somaArray(new int[]{1, 2, 3, 4, 5});// public void somaArray(int[] numeros)
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);// public void somaArray(int... numeros) utilisando o varargs eu posso chamar  desse jeito
    }
}
