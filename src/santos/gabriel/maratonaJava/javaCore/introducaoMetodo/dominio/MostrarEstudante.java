package santos.gabriel.maratonaJava.javaCore.introducaoMetodo.dominio;

public class MostrarEstudante {
    public void mostra(Estudante estudante){
        System.out.println("----------------------------------------------------------------");
        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }

    public void novoNome(Estudante estudante, String novoNome){
        estudante.nome = novoNome;
    }

}
