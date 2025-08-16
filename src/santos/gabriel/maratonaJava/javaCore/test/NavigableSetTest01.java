package santos.gabriel.maratonaJava.javaCore.test;

import santos.gabriel.maratonaJava.javaCore.test.dominio.Telefone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class TelfoneCompartor implements Comparator<Telefone>{
    @Override
    public int compare(Telefone o1, Telefone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Telefone> set = new  TreeSet<>(new TelfoneCompartor());// todas as classa do java que tiver tree no nome precisa de coparable ou caparator
        // caso a sua classe nao tenha um coparable use passe no cosntrutor da class treeset um coparator
        // importate o treeset nao usa o equals para saber se um obj e igual ele usa o comparable ou coparator
        set.add(new Telefone("xiaome","xx-yyyy-xxxx"));
        set.add(new Telefone("sansug","xx-yyyy-xxxx"));
        set.add(new Telefone("iphon","xx-yyyy-xxxx"));
        System.out.println(set);

        //lower() <
        //set.higher() >
        //set.floor() <=
        //set.ceiling() >=

        System.out.println(set.size());
        System.out.println(set.pollFirst());
        System.out.println(set.size());

    }
}
