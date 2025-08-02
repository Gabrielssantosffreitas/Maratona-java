package santos.gabriel.maratonaJava.javaCore.modificadorStatico.dominio;

public class Carro {
    private String nome ;
    private int valocidadeMaxima ;
    private static int velocidadeLimite2 =240; // afeta direta mente a classe  isso afeta todos os objetos
    public static int velocidadeLimite =250; // afeta direta mente a classe  isso afeta todos os objetos

    public Carro(String nome,int velocidadeMaxima){
        this.nome = nome;
        this.valocidadeMaxima = velocidadeMaxima;

    }


    public void imprimir(){
        System.out.println("==================");
        System.out.println(this.nome+"\nLimite: "+Carro.velocidadeLimite+"\nMaxima: "+this.valocidadeMaxima+"\nVelocidade Limete 2 : "+Carro.velocidadeLimite2); //  para acessar atributo static
        System.out.println("==================");
        System.out.println();
    }

    public static  int  getVelocidadeLimite2 (){
        return Carro.velocidadeLimite2;
    }

    public static void setVelocidadeLimite2(int velocidadeLimite){// metodos estaticos nao pega variaves nao estaticas
        Carro.velocidadeLimite2 = velocidadeLimite;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValocidadeMaxima() {
        return valocidadeMaxima;
    }

    public void setValocidadeMaxima(int valocidadeMaxima) {
        this.valocidadeMaxima = valocidadeMaxima;
    }



}
