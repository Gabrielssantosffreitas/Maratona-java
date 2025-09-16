package main.java.maratonaJava.javaCore.PadraoDeProjetos.factory;

import main.java.maratonaJava.javaCore.PadraoDeProjetos.dominio.Curso;
import main.java.maratonaJava.javaCore.PadraoDeProjetos.enums.GraduacaoEnum;

/*
o padrao de projeto factory serve para dexar a logica de criar um objeto fora dele melhorando a manutemcao e deixando a o constutor so com a resposabilidade de criar o objeto;
 */
public class FabricaCursos {
    public static Curso criar(GraduacaoEnum graduacaoEnum, String faculdade){
        switch (graduacaoEnum){
            case TECNOLOGO -> {
                return new Curso
                        .Builder()
                        .setFaculdade(faculdade)
                        .setQuantidadeSemestres(5)
                        .setMensagem("Os cursos de tecnologo sao rapidos e sevem para entrar no mercado de trabalho e no brasil sao considerardos graduacoes")
                        .build();
            }
            case BACHARELADO -> {
                return new Curso
                        .Builder()
                        .setFaculdade(faculdade)
                        .setQuantidadeSemestres(8)
                        .setMensagem("Os cursos de "+ GraduacaoEnum.BACHARELADO + " sevem para fazer pesquisa ")
                        .build();
            }
            case POS_GRADUACAO -> {
                return new Curso
                        .Builder()
                        .setFaculdade(faculdade)
                        .setQuantidadeSemestres(4)
                        .setMensagem("Os cursos de pos graduacao sevem para se especialisar ")
                        .build();
            }
            case MESTRADO -> { return new Curso
                    .Builder()
                    .setFaculdade(faculdade)
                    .setQuantidadeSemestres(8)
                    .setMensagem("Os cursos de mestrado  sevem para se especialisar em fazer pesquisa ")
                    .build();
            }
            case null, default -> {
                throw new IllegalArgumentException("nao existe esse tipo de graduaco");
            }
        }

    }
}
