package santos.gabriel.maratonaJava.javaCore.introducaoClasse.test;

import santos.gabriel.maratonaJava.javaCore.introducaoClasse.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "mestr kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }


}
