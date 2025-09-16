package main.java.maratonaJava.javaCore.Associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Escola: " + this.nome);

        if (professores == null) return;
        System.out.print("professores: ");
        for (Professor professor : professores) {
            System.out.print(professor.getNome() + ",  ");

        }
        System.out.println();
    }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public Professor[] getProfessores () {
            return professores;
        }

        public void setProfessores (Professor[]professores){
            this.professores = professores;
        }
    }
