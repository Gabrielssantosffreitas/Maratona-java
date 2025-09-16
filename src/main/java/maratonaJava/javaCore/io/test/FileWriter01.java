package main.java.maratonaJava.javaCore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {

        File arquivo = new File("/home/gabriel/Documentos/JavaProjetos/maratona-java/arquivos/fileWriter.txt");
        try {
            boolean isArquivo = arquivo.exists();
            if (isArquivo) arquivo.delete();
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(arquivo,true)) { // true para fazer um append (adicionar)
            fw.write(" testando o programa de escrever arquivos ");
            fw.flush(); //  jogar tufo que esta dentro do buffer no  arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
