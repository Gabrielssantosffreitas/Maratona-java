package santos.gabriel.maratonaJava.javaCore.enumeracao.dominio;

public enum TipoPagamento {
    DEBITO(1,"debito"){
        @Override
        public double desconto(double valor) {
            return valor *0.1;
        }
    },

    CREDITO(2,"credito"){
        @Override
        public double desconto(double valor) {
            return valor * 0.2;
        }
    };
    // atributos
    public final int VALOR;
    public final  String RELATORIO;
    //construtor

    TipoPagamento(int valor, String relatorio) {
    this.VALOR = valor;
    this.RELATORIO = relatorio;

    }
    public double desconto(double valor){
        return 0d;
    }

    public static TipoPagamento tipoPorValor(int valor){
        for (TipoPagamento tipo : values()){
            if (tipo.VALOR == valor){
                return tipo;
            }

        }
        return null;

    }


}
