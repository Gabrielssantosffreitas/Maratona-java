package main.java.maratonaJava.javaCore.Interface.dominio;

public interface DataLoader {
    int DATA_SIXE_MAX = 10;// atributos sao publicos staticos final

    void load();// public abstrato
    default void checkPermisson(){
        System.out.println("permitido");
    }

    public static void metodoStatico (){
        System.out.println("ssssssssssss");
    }

}
