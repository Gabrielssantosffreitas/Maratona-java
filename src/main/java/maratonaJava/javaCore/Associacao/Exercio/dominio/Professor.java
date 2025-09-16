package main.java.maratonaJava.javaCore.Associacao.Exercio.dominio;

public class Professor {
    private String nome;
    private  String especialidade;
    private  Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public void imprimir(){
        System.out.println("------------------");
        System.out.println(this.nome);

        if (seminarios == null)return;

        for (int i = 0; i < seminarios.length; i++) {
            System.out.println(seminarios[i].getTitulo());

            if (seminarios[i].getEstudantes() == null) continue;
            System.out.println(seminarios[i].getLocal().getEndereco());

            for (Estudante estudante :seminarios[i].getEstudantes()) {
                System.out.println(estudante.getEstudante());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
