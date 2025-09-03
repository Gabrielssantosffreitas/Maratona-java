package santos.gabriel.maratonaJava.javaCore.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface  Test02 <T> {
      void test(T e); // recebe um valor processa e nao retorna nada isso e um consumer
}


public class Lambdastest02 {

    private  static  void testComsumer(Test02<String> test02){
        test02.test("Bom dia, familia");
    }

    private  static <T> void testComsumerComInterfacePropiaDoJava(List<T> list, Consumer<T> comsumer){
        System.out.println("bom familha");
        for(T e : list){
            comsumer.accept(e);
        }
        System.out.println("final familha");
    }
    public static void main(String[] args) {
        Lambdastest02.testComsumer(s -> System.out.println(s));
        testComsumerComInterfacePropiaDoJava(new ArrayList<String>(List.of("gabriel","daniel","paulo")), nome -> System.out.println(nome));
    }

}
