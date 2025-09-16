package main.java.maratonaJava.javaCore.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {

            for (Path directory: directoryStream){
                System.out.println(directory);
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
