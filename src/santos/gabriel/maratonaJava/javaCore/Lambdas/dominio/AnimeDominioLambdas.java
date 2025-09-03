package santos.gabriel.maratonaJava.javaCore.Lambdas.dominio;

public class AnimeDominioLambdas implements Comparable<AnimeDominioLambdas> {
    private  String nome;
    private  Integer epsodios;

    public AnimeDominioLambdas(String nome, Integer epsodios) {
        this.nome = nome;
        this.epsodios = epsodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(Integer epsodios) {
        this.epsodios = epsodios;
    }

    @Override
    public String toString() {
        return "AnimeDominioLambdas{" +
                "nome='" + nome + '\'' +
                ", epsodios=" + epsodios +
                '}';
    }

    @Override
    public int compareTo(AnimeDominioLambdas o) {
        return this.getEpsodios().compareTo(o.getEpsodios());
    }
}
