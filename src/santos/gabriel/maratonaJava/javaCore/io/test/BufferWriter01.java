package santos.gabriel.maratonaJava.javaCore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter01 {
    public static void main(String[] args) {


        File arquivo = new File("/home/gabriel/Documentos/JavaProjetos/maratona-java/arquivos/fileWriter.txt");
        try {
            boolean isArquivo = arquivo.exists();
            if (isArquivo) arquivo.delete();
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(arquivo,true)) {
            BufferedWriter bw = new BufferedWriter(fw) ;// true para fazer um append (adicionar)
            bw.write(" testando o programa de escrever arquivos ");
            bw.newLine();
            bw.flush(); //  jogar tudo que esta dentro do buffer no  arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
