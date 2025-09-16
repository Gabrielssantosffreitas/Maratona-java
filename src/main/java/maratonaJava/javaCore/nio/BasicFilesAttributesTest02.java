package main.java.maratonaJava.javaCore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivos/test.txt");
        DosFileAttributes attributes = Files.readAttributes(path, DosFileAttributes.class);
        FileTime lastAccessTime = attributes.lastAccessTime();
        FileTime  creationTime =  attributes.creationTime();
        FileTime  lastModifiedTime = attributes.lastModifiedTime();

        System.out.println("lastAccessTime: "+ lastAccessTime + " creationTime: "+ creationTime+" lastModifieldTime: "+ lastModifiedTime );
        System.out.println("----------------------------");

        DosFileAttributeView attributeView = Files.getFileAttributeView(path, DosFileAttributeView.class); // attributeViews set attribute and read attribute update

        FileTime timeNow =  FileTime.fromMillis(System.currentTimeMillis());

        attributeView.setTimes(lastModifiedTime,timeNow,creationTime);
        // update lastAccessTime
        lastAccessTime = attributeView.readAttributes().lastAccessTime(); // or lastAccessTime = attributes.lastAccessTime();

        System.out.println("lastAccessTime: " + lastAccessTime);


    }
}
