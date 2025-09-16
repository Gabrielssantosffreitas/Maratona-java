package main.java.maratonaJava.javaCore.polomorfismo.dominio;

public class Tomate extends Produto {
    private String validade = "10-10-2025";
    private static final float IMPOSTO_COBRADO = 0.2f;

    public Tomate(String nome, double valor,String validade) {
        super(nome, valor);
        this.validade = validade;
    }

    @Override
    public double Imposto() {
        float valorFinal = (float)(this.valor = Tomate.IMPOSTO_COBRADO);
        valorFinal += (float)this.valor;
        return valorFinal ;
    }


    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(double valor) {
        super.setValor(valor);
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
