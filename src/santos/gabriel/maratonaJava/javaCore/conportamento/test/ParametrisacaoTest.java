package santos.gabriel.maratonaJava.javaCore.conportamento.test;

import santos.gabriel.maratonaJava.javaCore.conportamento.dominio.Car;
import santos.gabriel.maratonaJava.javaCore.conportamento.interfces.CarParemetro;

import java.util.ArrayList;
import java.util.List;

public class ParametrisacaoTest {

    static class Filter {
        public <T> List<T> filtro(List<T> list,CarParemetro<T> carParemetro){
            List<T> listaNova =  new ArrayList<>(list.size());
            for (T e: list){
                if (carParemetro.filter(e))
                     listaNova.add(e);
                }
            return listaNova;
        }
    }
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(List.of(new Car("2000","FIAT STRADA","preto"),new Car("2000","FIAT STRADA","vermelho"),new Car("2010","FIAT STRADA","vermelho")));
        List<Car> car2000 = new ArrayList<>();
         car2000.addAll(new Filter().filtro(carList,car -> car.getAno().equals("2000")));

        System.out.println(car2000);


    }
}
