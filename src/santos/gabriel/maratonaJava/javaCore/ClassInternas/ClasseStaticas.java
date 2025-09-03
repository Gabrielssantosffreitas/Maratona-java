package santos.gabriel.maratonaJava.javaCore.ClassInternas;

public class ClasseStaticas {
    private String nome = "gabriel";

    static class Pessoa1{

        public void print(){
            System.out.println( new ClasseStaticas().nome);
        }
    }
    public static void main(String[] args) {

        new Pessoa1().print();
    }
}
