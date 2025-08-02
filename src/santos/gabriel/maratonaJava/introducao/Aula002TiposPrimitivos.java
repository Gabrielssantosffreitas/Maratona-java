package santos.gabriel.maratonaJava.introducao;

import java.lang.invoke.StringConcatFactory;

public class Aula002TiposPrimitivos {
    public static void main( String[] args){
        /*
        int,floar,double,char,byte,short,long,boolean
         */
        //tipos primitivos ----------------------------------------------------------------------------
        int inteiro = (int) 10000000000L; // casting força colocar um valor
        int idade = 10;// -2,147,483,648 a 2,147,483,647
        double salarioDouble = 2000;// 6 a 7 digitos
        float salarioFloat = 2000.0F;// 15 a 16  digitos
        byte idadeByte = 10; // -128 a 127
        short idadeShort = 10;// -32768 a -32767
        boolean vardadeiro = true;// true ou false
        boolean falso = false;
        long numeroGrade = 100000L;// -9,223,372,036,854,775,808 a  9,223,372,036,854,775,807
        char carectere = 'M';
        //tipo de referencia -------------------------------------------------------------------


        String nome = "Gabriel santos freitas de olivera";


        // mostrar ----------------------------------------------------
        System.out.println("salario "+ salarioDouble);
        System.out.println("sua idade é " + idade +" anos " );
        System.out.println(salarioFloat + " float");
        System.out.println(idadeByte + " byte");
        System.out.println(idadeShort + " short");
        System.out.println(vardadeiro+ " boolean");
        System.out.println(falso);
        System.out.println(numeroGrade + " long");
        System.out.println(carectere + " char");
        System.out.println(inteiro + " int com casting");
        System.out.println(nome);
    }
}
