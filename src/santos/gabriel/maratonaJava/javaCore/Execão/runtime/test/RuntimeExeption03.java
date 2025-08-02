package santos.gabriel.maratonaJava.javaCore.Execão.runtime.test;

public class RuntimeExeption03 {
    public static String main(String[] args) {
        try {
            System.out.println("abriar");
            System.out.println("escrever");
            return"aberto";

        } catch (Exception e) {
            e.printStackTrace();
        }finally {// sempre e executado
            System.out.println("fechar");
        }
        return null;
    }

}
