package santos.gabriel.maratonaJava.javaCore.Interface.test;
import santos.gabriel.maratonaJava.javaCore.Interface.dominio.DataLoader;
import santos.gabriel.maratonaJava.javaCore.Interface.dominio.DatabaseLoader;

public class LoaderTest {
    public static void main(String[] args) {

        DatabaseLoader dataLoader = new DatabaseLoader();


        dataLoader.load();
        dataLoader.remove();
        dataLoader.checkPermisson();

    }
}
