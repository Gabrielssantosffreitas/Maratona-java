package santos.gabriel.maratonaJava.javaCore.ClassInternas;

public class ClassesInternas2 {
    private static String nome;

    public static void print(){
        final String segundoNome = "santos"; // para a minha class dentro do mento acessar uma variavel do metodo ela tem que ser final pois a vida do metodo e menor que a vida da class
        nome = "gabriel";
        class Name{
            public void print(){
                System.out.println(nome);
                System.out.println(segundoNome);
            }

        }
            new Name().print();

    }

    public static void main(String[] args) {
        print();
    }
}
