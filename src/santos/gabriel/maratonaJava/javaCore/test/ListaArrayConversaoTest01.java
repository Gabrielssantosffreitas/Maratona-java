package santos.gabriel.maratonaJava.javaCore.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        List<Integer>  lista = new ArrayList<>(10);
        lista.add(10);
        lista.add(13);

        Integer[] inteiros = lista.toArray(new Integer[0]); // toArray transforma em um array
        System.out.println(Arrays.toString(inteiros));
        System.out.println("--------");

        Integer[] numerosArray =  new Integer[]{1,2,4,5};

        List<Integer> listVinculada =  Arrays.asList(numerosArray); // isso vincula com o array logo qualquer interacao muda tbm o array e tbm nao tem como add nada
        List<Integer>  listArray  = new ArrayList(Arrays.asList(numerosArray)); // isso transforma cria uma nova lista que nao esta vinculda com com o array

        System.out.println(listArray);
        System.out.println(listVinculada);



    }
}
