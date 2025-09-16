package main.java.maratonaJava.javaCore.polomorfismo.dominio;

public class Computador extends Produto
{
    private  final double VALOR_IMPOSTO = 0.1;
    public Computador(String nome,double valor) {
        super(nome,valor);
    }

    @Override
    public double Imposto() {
        double valorPagar = this.valor * this.VALOR_IMPOSTO;

        valorPagar += this.valor;

        System.out.println("Calculando valor");

        return valorPagar;

    }
}
