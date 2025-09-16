package main.java.maratonaJava.javaCore.Interface.test;
import main.java.maratonaJava.javaCore.Interface.dominio.DatabaseLoader;

public class LoaderTest {
    public static void main(String[] args) {

        DatabaseLoader dataLoader = new DatabaseLoader();


        dataLoader.load();
        dataLoader.remove();
        dataLoader.checkPermisson();

    }
}
