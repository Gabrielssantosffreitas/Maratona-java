package main.java.maratonaJava.javaCore.strams.dominio;

public enum Categorias {
    ROMANCE(0),
    AVENTURA(1),
    SHONEN(2),
    SHEINEN(3),
    ;

    private  final int CategoriaNumber;

    Categorias(int CategoriaNumber){
        this.CategoriaNumber = CategoriaNumber;
    }

    public  static Categorias setCategorias(int number){
        return switch (number) {
            case 0 -> Categorias.ROMANCE;
            case 1 -> Categorias.AVENTURA;
            case 2 -> Categorias.SHONEN;
            case 3 -> Categorias.SHEINEN;
            default -> throw new RuntimeException("Esse valor nao existe");
        };
    }


    public int getCategoriaNumber() {
        return CategoriaNumber;
    }
}
