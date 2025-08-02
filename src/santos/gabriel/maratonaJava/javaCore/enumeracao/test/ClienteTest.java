package santos.gabriel.maratonaJava.javaCore.enumeracao.test;

import santos.gabriel.maratonaJava.javaCore.enumeracao.dominio.Cliente;
import santos.gabriel.maratonaJava.javaCore.enumeracao.dominio.TipoCliente;
import santos.gabriel.maratonaJava.javaCore.enumeracao.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", "pessoaFisica", TipoCliente.PESSOA_FISICA);
        cliente1.setPagamento(TipoPagamento.DEBITO);
        System.out.println(cliente1);


        Cliente cliente2 = new Cliente("Daniel", "PESSOA FISICA", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.tipoPorValor(2));

    }

}
