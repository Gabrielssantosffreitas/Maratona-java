package main.java.maratonaJava.javaCore.PadraoDeProjetos.enums;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
quando vc presisa que o objeto seja criardo so uma vez isso e nao pode existeir duas instacia desse objeto no codigo
 */
public enum Aviao {
    ISTACIA;

    private final Set<String> cadeiras;
    Aviao() {
        this.cadeiras = Collections.synchronizedSet(new HashSet<>());
        this.cadeiras.add("1a");
        this.cadeiras.add("1b");
        this.cadeiras.add("2a");
        this.cadeiras.add("2b");
    }

    public boolean getCadeira(String cadeira){
        return this.cadeiras.remove(cadeira);
    }

}
