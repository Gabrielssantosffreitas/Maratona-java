package main.java.maratonaJava.javaCore.test.dominio;

public class Telefone {
    private String marca;
    private String number;

    public Telefone(String marca, String number) {
        this.marca = marca;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Telefone{" +
                "marca='" + marca + '\'' +
                ", number='" + number + '\'' +
                '}'+"\n";
    }

    // regras
    // simetrico: x.equals(y) == true logo y.equals(x) == true
    // consistente: x.equals(x)  sendo x diferente de null sempre retorna true
    // transitivo : para x,y,z sendo x.equals(y)  == true y.equals(z) == true logo x.equals(z) == true
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        // obrigatorio
        if (obj == null) return false;// se for nulo false
        if (this == obj) return  true; // se o for a mesma referencia do objeto return true
        if (obj.getClass() != this.getClass()) return  false; // se a classe for diferente mesma
        // agora o que vc quer comparar
        Telefone telefone =  (Telefone) obj;
        return this.marca != null && this.marca.equals(telefone.getMarca());
    }

    //x.equals(y) == true x.hashCode == y.hashCode tem quer ser true
    // x.equals(y) == false x.hashCode == y.hashCode tem ser false
    // x.hashCode == y.hashCode for true nao necessariamente x.equals(y) == true
    // x.hashCode == y.hashCode for false  x.equals(y) == false
    @Override
    public int hashCode() {
        return  this.marca == null ? 0: marca.hashCode();
        //condição ? se for true : se for false
    }

    public String getMarca() {
        return marca;
    }

    public String getNumber() {
        return number;
    }

}
