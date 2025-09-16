package main.java.maratonaJava.javaCore.string.test;

public class StringPerfomaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        testDePerfomaceDaString();
        long fim = System.currentTimeMillis();



        long inicioB = System.currentTimeMillis();
        testDePerfomaceDaStringBilder();
        long fimB = System.currentTimeMillis();

        long tempo = fim-inicio;
        System.out.println(tempo);
        System.out.println("++++++++++++");
        long tempoB = fimB-inicioB;
        System.out.println(tempoB);



    }




    public  static  void testDePerfomaceDaString (){
        String texto = "-";

        for (int i = 0; i < 100_000; i++) {
            texto += i;
            System.out.println(texto+"\n---------------------");
        }
    }
    public  static  void testDePerfomaceDaStringBilder (){
        StringBuilder texto = new StringBuilder(100_000);// capacidade
        texto.append("--");
        for (int i = 0; i < 100_000; i++) {
            texto.append(i);
            System.out.println(texto+"\n---------------------");
        }
    }
    public  static  void testDePerfomaceDaStringBaffer (){// varias pessoas acessando o recurso
        StringBuffer texto = new StringBuffer(100_000);// capacidade
        texto.append("--");
        for (int i = 0; i < 100_000; i++) {
            texto.append(i);
            System.out.println(texto+"\n---------------------");
        }

    }
}
