package santos.gabriel.maratonaJava.javaCore.Lambdas.test;


class Car {
    private String nome;
    public Car (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
// uma interface funcional ele so tem um metodo abstrato
@FunctionalInterface
interface  Test01 {

    // isso e predicate
    boolean test(Car car); // vai recerber um carro proccessar algo que vc escole e devolver um booleano

}

public class LamndasTest01 {
    private static  void verificarCarro (Car car,Test01 test01){
        if(test01.test(car)){
            System.out.println("esse carro pode passar");
        }
    }

    public static void main(String[] args) {
        LamndasTest01.verificarCarro(new Car("bwm"), car -> car.getNome().equals("bwm"));

    }


}
