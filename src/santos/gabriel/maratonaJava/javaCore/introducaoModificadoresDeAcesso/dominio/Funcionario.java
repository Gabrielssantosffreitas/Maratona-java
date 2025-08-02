package santos.gabriel.maratonaJava.javaCore.introducaoModificadoresDeAcesso.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private float media = 0;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Essa idade nao e valida");
            return;
        }
        this.idade = idade;
    }

    public void setSalarios(double... salarios) {
        this.salarios = salarios;
    }



    public String getNome() {

        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public float getMedia() {
        if (media == 0){System.out.println("Nao há media. Por favor use o metodo mediaSalarios para fazer a media  ");
            return 0;
        }
        return media;
    }

    public void mostrarDados() {
        System.out.println("-----------------------------------------------");
        System.out.print("Nome: " + this.nome + "\nIdade: " + this.idade + "\nSalario: ");

        for (double salario : this.salarios) {
            System.out.print(salario + ",  ");

        }
        System.out.println("\n-----------------------------------------------");
    }

    public void mediaSalarios() {
        double soma = 0;

        for (double salario : this.salarios) {
            soma += salario;
        }
        media = (float) (soma / this.salarios.length);

        System.out.println(media);
    }

}


