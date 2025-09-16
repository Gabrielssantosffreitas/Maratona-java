package main.java.maratonaJava.javaCore.Execão.exeption.test;

import java.io.File;
import java.io.IOException;

public class Exeption01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/texto.txt");
        try { // tenta fazer alguma coisa

            boolean isCriado = file.createNewFile();
            System.out.println(isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
