package santos.gabriel.maratonaJava.javaCore.Associacao.dominio;

public class Jogador {
    private String nome;
    private Time  time;
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        if(this.time != null){
            System.out.println("Time: "+this.time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
