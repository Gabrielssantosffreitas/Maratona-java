package santos.gabriel.maratonaJava.javaCore.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (!file.getFileName().toString().endsWith(".java")) return  FileVisitResult.CONTINUE;
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
