package santos.gabriel.maratonaJava.javaCore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributoTest01 {
    public static void main(String[] args) throws IOException {

        // BasicFileAttributes, DosFileAttributes(windos ler ), PosixFileAttributes linux ler

        Path path = Paths.get("arquivos/test.txt");

        if(!path.toFile().exists()){Files.createFile(path);}


        LocalDateTime date = LocalDateTime.now().minusDays(-10);

        FileTime filetime = FileTime.from(date.toInstant(ZoneOffset.UTC));

        Files.setLastModifiedTime(path, filetime);

        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isDirectory(path));



    }
}
