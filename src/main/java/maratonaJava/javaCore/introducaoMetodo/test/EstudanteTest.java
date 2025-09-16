package main.java.maratonaJava.javaCore.introducaoMetodo.test;

import main.java.maratonaJava.javaCore.introducaoMetodo.dominio.Estudante;
import main.java.maratonaJava.javaCore.introducaoMetodo.dominio.MostrarEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        MostrarEstudante mostrarEstudante = new MostrarEstudante();

        estudante1.nome = "gabriel";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "daniel";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        mostrarEstudante.mostra(estudante1);

        mostrarEstudante.mostra(estudante2);

        mostrarEstudante.novoNome(estudante2, "madara"); // quando passos tipo de referencia ele altera o objeto
        mostrarEstudante.mostra(estudante2);

        /*
        as boas pratica diz para nao altera objeto em um metodo
        tem que criar um novo o objeto e retorna esse novo objeto com o estado alterado
         */

        estudante1.mostrarNome(); // usar o this. aquilo que vc quer usar


    }



}