package main.java.maratonaJava.javaCore.Associacao.Exercio.test;

import main.java.maratonaJava.javaCore.Associacao.Exercio.dominio.Estudante;
import main.java.maratonaJava.javaCore.Associacao.Exercio.dominio.Local;
import main.java.maratonaJava.javaCore.Associacao.Exercio.dominio.Professor;
import main.java.maratonaJava.javaCore.Associacao.Exercio.dominio.Seminario;

public class Cadastro {
    public static void main(String[] args) {
        Local local = new Local(" rua das larangeieras");
        Seminario seminario = new Seminario("matematica na vida",local);

        Estudante estudante = new Estudante("Gabriel",(byte)19);

        Professor professor = new Professor("Romero","Matematica");

        seminario.setProfessor(professor);
        seminario.setEstudantes(new Estudante[]{estudante});

        estudante.setSeminario(seminario);

        professor.setSeminarios( new Seminario[]{seminario});

        professor.imprimir();



    }


}
