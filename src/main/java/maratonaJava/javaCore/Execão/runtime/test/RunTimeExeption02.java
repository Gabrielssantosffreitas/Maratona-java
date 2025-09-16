package main.java.maratonaJava.javaCore.Execão.runtime.test;

public class RunTimeExeption02 {
    public static void main(String[] args) {
        try {
            System.out.println( divisao(15,3));

        }catch (RuntimeException e){
            e.printStackTrace();
        }
        try {

            System.out.println( divisao(13,0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try {

            System.out.println( divisao(0,3));

        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }

    public static  int divisao(int b, int a){
        if (a == 0 || b== 0 ){// mostrar erro sem try e cat
            throw  new RuntimeException("nao e possivel dividir por zero "); // lançar uma esseção
        }
        return b/a;
    }
}
