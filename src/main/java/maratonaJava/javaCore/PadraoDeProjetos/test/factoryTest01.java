package main.java.maratonaJava.javaCore.PadraoDeProjetos.test;

import main.java.maratonaJava.javaCore.PadraoDeProjetos.dominio.Curso;
import main.java.maratonaJava.javaCore.PadraoDeProjetos.enums.GraduacaoEnum;
import main.java.maratonaJava.javaCore.PadraoDeProjetos.factory.FabricaCursos;

public class factoryTest01 {
    private  static final Curso curso = FabricaCursos.criar(GraduacaoEnum.MESTRADO,"UFMG");

    public static void main(String[] args) {
        System.out.println(curso.getMensagemCurso()+" "+ curso.getQuantidadeSemestres());
    }
}
