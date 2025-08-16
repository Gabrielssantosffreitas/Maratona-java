package santos.gabriel.maratonaJava.javaCore.Generics.Test;

import santos.gabriel.maratonaJava.javaCore.Generics.dominio.Barco;
import santos.gabriel.maratonaJava.javaCore.Generics.dominio.Carro;
import santos.gabriel.maratonaJava.javaCore.Generics.services.AlugelDeVeiculos;

import java.util.ArrayList;
import java.util.List;

public class VeiculosTest01 {
    public static void main(String[] args) {
        List<Carro> carros =  new ArrayList<>(List.of(new Carro("bmw",1400.30d),new Carro("bmw",1400.30d)));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("lancha",1400.30d),new Barco("iaite",1400.30d)));
        AlugelDeVeiculos<Carro> AlugarCarro =  new AlugelDeVeiculos<>(carros);
        AlugelDeVeiculos<Barco> barcoAlugelDeVeiculos =  new AlugelDeVeiculos<>(barcos);

        barcoAlugelDeVeiculos.Alugar();
        barcoAlugelDeVeiculos.devolver(new Barco("lancha",1400.30d));

        AlugarCarro.Alugar();
        AlugarCarro.devolver(new Carro("bmw",1400.30d));

    }
}
