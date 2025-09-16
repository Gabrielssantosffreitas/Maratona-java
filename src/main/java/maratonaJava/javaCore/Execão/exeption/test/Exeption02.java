package main.java.maratonaJava.javaCore.Execão.exeption.test;

import java.io.File;
import java.io.IOException;

public class Exeption02 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo/test.txt");

        try {

            boolean isCriado = file.createNewFile();
            System.out.println(isCriado);

        }catch (IOException e){
            e.printStackTrace();
            throw e; // retornar a essao para outro metodo tratar

        }



    }
}
