package main.java.maratonaJava.javaCore.Generics.services;

import main.java.maratonaJava.javaCore.Generics.dominio.Veiculos;

import java.util.ArrayList;
import java.util.List;

public class AlugelDeVeiculos<T extends Veiculos> {

    List<T> veiculos;

    public AlugelDeVeiculos(List<T> veiculos) {
        this.veiculos = veiculos;
    }

    public  void Alugar(){
        veiculos.removeFirst();
        System.out.println(veiculos);
    }
    public  void  devolver(T t){
        System.out.println(veiculos.add(t));
        System.out.println(veiculos);
    }

    public <E>  List<E> metodoGenerico(E t){
        List<E> arrayList = new ArrayList<>();
        return  arrayList;
    }
}
