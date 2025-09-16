package main.java.maratonaJava.javaCore.Execão.runtime.test;

public class RuntimeExeption {
    public static void main(String[] args) {
        // checked e unchecked
        // checked filha diretas das classe execption erro de compilação
        // unchecked normal mente e culpa do programador ex: acessar um indece que nao existe dentro de um array
        Object object = null;
        object.hashCode();
    }
}
