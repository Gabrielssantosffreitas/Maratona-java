package santos.gabriel.maratonaJava.javaCore.enumeracao.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;
    private TipoPagamento pagamento;


    public Cliente(String nome, String tipo, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, String tipo, TipoCliente tipoCliente, TipoPagamento pegamento) {
        this(nome, tipo, tipoCliente);
        this.pagamento = pegamento;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + pagamento + '\'' +
                ", tipoClienteInt=" + pagamento.VALOR +
                ", relatorio="+pagamento.RELATORIO +
                '}';
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pegamento) {
        this.pagamento = pegamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
