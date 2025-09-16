package main.java.maratonaJava.javaCore.introducaoClasse.test;

import main.java.maratonaJava.javaCore.introducaoClasse.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();
        Carro carro5;



        carro1.modelo = "gol";
        carro1.anoDeFabricacao = 2005 ;
        carro1.kilometragem =50000;

        carro2.modelo = "ideia";
        carro2.anoDeFabricacao = 2007 ;
        carro2.kilometragem =30000;

        carro3.modelo = "fox";
        carro3.anoDeFabricacao = 2010 ;
        carro3.kilometragem =10000;

        carro4.modelo = "uno";
        carro4.anoDeFabricacao = 2010 ;
        carro4.kilometragem =19000;


        carro5 = carro4; // o carro5 aponta para mesmo indereco de memora que carro4




        System.out.println(carro1.modelo+" "+ carro1.anoDeFabricacao+" "+ carro1.kilometragem);
        System.out.println(carro2.modelo+" "+ carro2.anoDeFabricacao+" "+ carro2.kilometragem);
        System.out.println(carro3.modelo+" "+ carro3.anoDeFabricacao+" "+ carro3.kilometragem);
        System.out.println(carro4.modelo+" "+ carro4.anoDeFabricacao+" "+ carro4.kilometragem);
        System.out.println(carro5.modelo+" "+ carro5.anoDeFabricacao+" "+ carro5.kilometragem);




    }
}
