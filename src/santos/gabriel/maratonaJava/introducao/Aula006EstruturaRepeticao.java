package santos.gabriel.maratonaJava.introducao;

public class Aula006EstruturaRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int cont = 0;

        while (cont <= 10) {
            System.out.println(cont);
            cont += 1;
        }

        int contDoWhile = 11;
        // executa uma vez mesmo se a condição for false

        do {
            System.out.println("dentro do do-while");
        } while (contDoWhile <= 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("for "+i);
        }

        //break para o loop eo continue ignora o que esta a baixo e continua o loop

    }
}
