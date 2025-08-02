package santos.gabriel.maratonaJava.javaCore.polomorfismo.test;
import santos.gabriel.maratonaJava.javaCore.polomorfismo.dominio.Computador;
import santos.gabriel.maratonaJava.javaCore.polomorfismo.dominio.Tomate;
import santos.gabriel.maratonaJava.javaCore.polomorfismo.servico.CalculadoraImposto;

// views
public class ProdutorTest01
{
    public static void main(String[] args)
    {


        Computador computador = new Computador("i5",1800);
        Tomate tomate = new Tomate("americano",90,"10-9-2026");

        CalculadoraImposto.calcularImpostoDoPc(computador);
        CalculadoraImposto.calcularImpostoDoTomate(tomate);

        CalculadoraImposto.calcularImpostoProduto(computador);
        CalculadoraImposto.calcularImpostoProduto(tomate);


    }


}
