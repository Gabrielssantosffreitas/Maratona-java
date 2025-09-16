package main.java.maratonaJava.javaCore.nio;

import java.io.IOException;
import java.nio.file.*;

public class PathsTest {
    public static void main(String[] args) throws IOException {

        Path pasta = Paths.get("pasta");
        if (Files.notExists(pasta)) {
            Path direrorio = Files.createDirectory(pasta);
        }

        if (Files.notExists(Paths.get("ola/pasta/tex"))) {
            Path diretorios = Files.createDirectories(Paths.get("ola/pasta/tex"));// para criar multiplos diretorios vc precisa usar esse metodo;
        }

        Path diretorio  = Paths.get("ola/pasta/tex");
        Path arquivoPath = Paths.get(diretorio.toString(),"texto.txt");

        if (Files.notExists(arquivoPath)){
          Path arquivoCriado =   Files.createFile(arquivoPath);
        }

        Path resouce = arquivoPath;
        Path target = Paths.get(resouce.getParent().toString(),"comp.txt");
        Files.copy(resouce,target, StandardCopyOption.REPLACE_EXISTING);// standard e para rescrever no arquivo caso ele exista
        // normalisação
        String voltar = "../../";

        Path notNormalisencion = Paths.get(diretorio.toString(),voltar);
        System.out.println(notNormalisencion.toString());
        Path normalisencion = Paths.get(diretorio.toString(),voltar).normalize();
        System.out.println(normalisencion);

        String local = "/home/gabriel/Documentos/JavaProjetos/maratona-java";
        String local2 = "/home/gabriel/Documentos";
        Path localPath = Paths.get(local);
        Path localPath2 = Paths.get(local2);

        // local 1 para local 2

        Path local1Loca2 = localPath.relativize(localPath2).normalize();
        System.out.println(local1Loca2);
        Path local2Local1 = localPath2.relativize(localPath).normalize();
        System.out.println( local2Local1);


    }
}
