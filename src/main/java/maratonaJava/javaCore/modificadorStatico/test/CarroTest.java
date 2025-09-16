package main.java.maratonaJava.javaCore.modificadorStatico.test;

import main.java.maratonaJava.javaCore.modificadorStatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro("gol",350);
        Carro carro1 = new Carro("bmw",500);
        Carro carro2 =  new Carro("mustang", 300);


        carro.imprimir();
        carro1.imprimir();
        carro2.imprimir();

        Carro.velocidadeLimite = 240;
        System.out.println("////");
        carro.imprimir();
        carro1.imprimir();
        carro2.imprimir();

        Carro.setVelocidadeLimite2(300);
        System.out.println("////");

        carro.imprimir();
        carro1.imprimir();
        carro2.imprimir();

    }
}
