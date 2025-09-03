package santos.gabriel.maratonaJava.javaCore.conportamento.dominio;

public class Car {
    private String ano;
    private String modelo;
    private String cor;

    public Car() {
    }

    public Car(String ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }


    @Override
    public String toString() {
       return "{Ano:"+ this.ano+"\nModelo:"+this.modelo+"\nCor:"+this.cor+"}";
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
