package main.java.maratonaJava.javaCore.Interface.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("carregando dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados");
    }
}
