package santos.gabriel.maratonaJava.javaCore.introducaoModificadoresDeAcesso.dominio;

public class Pessoas {
    // private so essa classe tem acesso
    private String nome;
    private int idade;
    private char sexo;


    public void setNome(String nome) { // sempre usar o set para alterar atributos pois pode ter uma logica de atribuicao
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            return;
        }
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        if (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f' && sexo != 'N' && sexo != 'n') {
            System.out.println("valores invalido. Por favor digite apanes M, F, m, f, N, n");
            return;
        }
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;

    }

    public char getSexo() {
        return sexo;
    }

    public void mostrar() {
        System.out.println("NOME: " + this.nome + "\nIDADE: " + this.idade + "\nSEXO: " + this.sexo + "\n-----------------------------------------");
    }

}
