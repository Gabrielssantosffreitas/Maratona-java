package main.java.maratonaJava.javaCore.Execão.exeption.test;

import main.java.maratonaJava.javaCore.Execão.exeption.test.exception.LoginInvalido;

import java.util.Scanner;

public class ExeptionPersonalisada {
    public static void main(String[] args) {
        try {
            ExeptionPersonalisada.logar();
        } catch (LoginInvalido e) {
            e.printStackTrace();
        }finally {
            System.out.println("--------------");
        }

    }

    public static void logar() throws LoginInvalido {
        String user = "goku";
        String senha = "madara";
        Scanner scanner = new Scanner(System.in);

        System.out.println("user");

        String userD = scanner.nextLine();

        System.out.println("senha");

        String senhaD = scanner.nextLine();

        if (!user.equals(userD) || !senha.equals(senhaD))throw new LoginInvalido();
        System.out.println("logado com susseco");
    }

}
