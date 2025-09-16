package main.java.maratonaJava.javaCore.Execão.exeption.test;

import java.io.*;

public class TryWhiteResouceTest {
    public static void main(String[] args) {

    }
    public static void lerArquivo2(){
        try(Reader ler = new BufferedReader( new FileReader("texto.txt"))){// ele facha automaticamente so pode usar com classes que exentenen o implementao autoclose o closeable

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void lerArquivo() {
        Reader ler = null;
        try {
             ler = new BufferedReader( new FileReader("texto.txt"));
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }finally {
            try {
                if (ler != null) {
                    ler.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
