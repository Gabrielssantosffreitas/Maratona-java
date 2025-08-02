package santos.gabriel.maratonaJava.javaCore.introducaoMetodo.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void mostrarDados() {
        System.out.println("-----------------------------------------------");
        System.out.print("Nome: " + this.nome + "\nIdade: " + this.idade + "\nSalario: ");

        for (double salario : this.salarios) {
            System.out.print(salario+",  ");

        }
        System.out.println("\n-----------------------------------------------");
    }
    public  void mediaSalarios (){
        double soma = 0;

        for (double salario : this.salarios){
            soma += salario;
        }
        float media = (float)(soma/this.salarios.length);

        System.out.println(media);
    }

}
