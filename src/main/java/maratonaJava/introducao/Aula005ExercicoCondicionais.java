package main.java.maratonaJava.introducao;

public class Aula005ExercicoCondicionais {
    public static void main(String[] args) {
        double salario = 6078F;

        if (salario >= 0 && salario <= 34712){

            double valorPagoDeImposto = (9.70/100) * salario;


            System.out.println("vc pagara de imposto "+ valorPagoDeImposto );
        }
        else if (salario >= 34713 && salario <= 68507){
            double valorPagoDeImposto = (37.35/100) * salario;


            System.out.println("vc pagara de imposto "+ valorPagoDeImposto );
        }

        else{
            double valorPagoDeImposto = (49.50/100) * salario;


            System.out.println("vc pagara de imposto "+ valorPagoDeImposto );
        }
    }
}
