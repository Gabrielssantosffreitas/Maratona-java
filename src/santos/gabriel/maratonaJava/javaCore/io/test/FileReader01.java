package santos.gabriel.maratonaJava.javaCore.io.test;

import java.io.*;

public class FileReader01 {
    public static void main(String[] args) {

        File arquivo = new File("/home/gabriel/Documentos/JavaProjetos/maratona-java/arquivos/fileWriter.txt");
        try {
            boolean isArquivo = arquivo.exists();
            if (isArquivo) arquivo.delete();
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(arquivo, true)) { // true para fazer um append (adicionar)
            fw.write(" testando o programa de escrever arquivos ");
            fw.flush(); //  jogar tufo que esta dentro do buffer no  arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(arquivo)) {
            int i = 0;
            String texto="";
            while ((i = fr.read()) != -1) { //ready como chega no final da pagina ele retorna -1

                texto += String.valueOf((char) i);

            }
            System.out.println(texto);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
