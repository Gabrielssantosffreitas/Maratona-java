package main.java.maratonaJava.javaCore.Generics.Test;

abstract  class Animal {
    abstract  void consuta();
}
class Cachorro extends  Animal {
    @Override
    void consuta() {
        System.out.println("consutando o dog");
    }
}
class Gato  extends Animal {
    @Override
    void consuta() {
        System.out.println("consuntando o gato");
    }
}
public class GerericsTets {
    public static void main(String[] args) {
        Cachorro cachorro =  new Cachorro();
        Gato gata = new Gato();
        cachorro.consuta();
        gata.consuta();

        mostraListaAnimal(new Animal[]{new Gato(),new Cachorro()});
    }
    private  static  void mostraListaAnimal (Animal[] animals){
        for(Animal animal:animals){
            animal.consuta(); // isso funciona pq gato e cachorro tem a mesma class mae porem
        }

            animals[1] = new Gato(); // esse vai da erro se eu passar um array de cachorros

    }
}
