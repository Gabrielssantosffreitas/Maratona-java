package santos.gabriel.maratonaJava.javaCore.introducaoMetodo.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subitrairDoisNumeros() {
        System.out.println(332 - 23);
    }

    public void multiplicarDoisNumero(int num1, int num2) {
        System.out.println(num1 * num2);
    } // se a função tem mais de 3 parametros tem algo errado

    public double dividirDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;

    }

    public void mostrarRestoDaDivDeDoisNum(float num1, float num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("nao existe divisao por 0");
            return; // esse return sem nada e o braek do metodo void so da para usar no void
        }
        System.out.println(num1 % num2);
    }

    public void  alteraDoisNumeros (int num1 , int num2){
        num1 = 9;
        num2 = 10;
        System.out.println(num1+"\n"+num2+"\n"+" tipo primitivo");
        System.out.println("dentro do metodo");
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }


}
