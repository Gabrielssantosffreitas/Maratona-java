package santos.gabriel.maratonaJava.javaCore.Associacao.test;

import santos.gabriel.maratonaJava.javaCore.Associacao.dominio.Escola;
import santos.gabriel.maratonaJava.javaCore.Associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Escola escola = new Escola("Maria luiza miranda bastos");
        Professor professor1 = new Professor("joao batista");
        Professor professor2 = new Professor("Romero");
        Professor professor3 = new Professor("Pedro");
        Professor professor4 = new Professor("Renam");
        escola.setProfessores(new Professor[] {professor1, professor2, professor3, professor4});

        escola.imprimir();

    }
}
