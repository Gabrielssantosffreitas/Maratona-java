package santos.gabriel.maratonaJava.introducao;

public class Aula005EstruturaCondicionalSwiteCase {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalidade");

        }

        switch (dia){
            case 1:
                System.out.println("final de semana ");
                break;
            case 2:
                System.out.println(" Dia util");
                break;
            case 3:
                System.out.println("dia util");
                break;
            case 4:
                System.out.println("dia util");
                break;
            case 5:
                System.out.println("dia util");
                break;
            case 6 :
                System.out.println("dia util");
                break;
            case 7:
                System.out.println("final de semana");
                break;
            default:
                System.out.println("opicao invalida");
        }
    }
}
