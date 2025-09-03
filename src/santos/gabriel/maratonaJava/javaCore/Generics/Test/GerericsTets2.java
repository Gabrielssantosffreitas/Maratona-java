package santos.gabriel.maratonaJava.javaCore.Generics.Test;

import santos.gabriel.maratonaJava.javaCore.test.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class GerericsTets2 {
    public static void main(String[] args) {
        Cachorro cachorro =  new Cachorro();
        Gato gata = new Gato();
        cachorro.consuta();
        gata.consuta();
        List<Animal> animals = new ArrayList<>(List.of(new Gato()));
        mostraListaDeCachorros(animals);
    }
    private  static  void mostraListaAnimal (List<? extends  Animal> animals){// ? -> qual quer tipo que extends que tem a class mae como animal tem que fazer assim pq se colovar so Animal e so vai aceitar o tipo animal
      // pega os filhos da class Animal so poder ler
        for(Animal animal:animals){
            animal.consuta(); // isso funciona pq gato e cachorro tem a mesma class mae porem
        }

            // animals.add( new Gato()); -> isso da erro que quando usamos extends criamos um contrato com o java disedo nao vamos poder mais add coisas
    }
    private  static void mostraListaDeCachorros (List<? super Cachorro> objects){// pega tudo as classe mae O seja de chachoro -> animal -> obj

        for (Object object: objects){// sou obrigado q tudo que eu for fazer tem que ser um objeto  e dps fazer um casting
            if (object instanceof Animal){
                Animal animal  = (Animal) object;
                animal.consuta();
            }
        }
        objects.add(new Cachorro());


    }
}
