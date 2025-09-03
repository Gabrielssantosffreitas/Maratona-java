package santos.gabriel.maratonaJava.javaCore.ClassInternas;

class Pessoa {
    private String nome;

    public  void correr(){
        System.out.println("gabriel ");
        System.out.println("esta correndo");
    }
}
// classes anonimas sao forma de cria sub classes uma vez na execucao do metodo e nuca mais ela vai existir
public class ClasseAnonimas {
    public static void main(String[] args) {

        Pessoa gabriel = new Pessoa(){
            private int quantidade = 14;
            @Override
            public void correr() {
                System.out.println("vai correr "+quantidade+"km ");
                super.correr();
            }
        };
        gabriel.correr();
    }

}
