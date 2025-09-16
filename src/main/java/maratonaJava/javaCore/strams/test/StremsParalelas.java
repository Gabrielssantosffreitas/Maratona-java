package main.java.maratonaJava.javaCore.strams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;
/*
 usar benchmark
 tomar cuidado com o unboxing | boxing traformar tipo primitivo para wappers
 nao usar quando tiver limit ou findFist
 Olhar o custo total da programcao
 se os daddos for muito pequeno nao vale apena usar
 tipos de colecao ArrayList e muito bom, linkdList e horrivel, set e bom de usar
 sempre dados com tamenhos definidos
 */
public class StremsParalelas {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long inicio = System.currentTimeMillis();
        UmAMilFor();
        long fina = System.currentTimeMillis();
        long ms = fina-inicio;
        System.out.println(ms+" ms -> for");
        //--
        inicio = System.currentTimeMillis();
        UmAMilStremIterable();
        fina = System.currentTimeMillis();
        ms = fina-inicio;
        System.out.println(ms+" ms -> stremIterable");
        //--
        inicio = System.currentTimeMillis();
        UmAMilStremIterableParaleloThred();
        fina = System.currentTimeMillis();
        ms = fina-inicio;
        System.out.println(ms+" ms -> stremIterableParalelo");
        //--
        inicio = System.currentTimeMillis();
        UmAMilStremLong();
        fina = System.currentTimeMillis();
        ms = fina-inicio;
        System.out.println(ms+"  ms -> stremLog");
        //--
        inicio = System.currentTimeMillis();
        UmAMilStremLongParaleloThred();
        fina = System.currentTimeMillis();
        ms = fina-inicio;
        System.out.println(ms+" ms -> stremLogParalelo");
    }


    private static void UmAMilFor (){
        int cont = 0;
        for (int i = 0; i <1_001; i++) {
            cont += i;
        }
        System.out.println(cont);
    }


    private  static  void UmAMilStremIterable (){
        int cont = 0;
         Stream.iterate(0L,l -> l + 1)
                .limit(1_001)
                 .reduce(Long::sum)
                 .ifPresent(System.out::println);


    }
    private  static  void UmAMilStremIterableParaleloThred (){// essa nao e melhor forma de fazer pq o java nao sabe como organizar as estrems, pois o iterente nao tem final
        int cont = 0;
        Stream.iterate(0L,l -> l + 1)
                .limit(1_001)
                .parallel()
                .reduce(Long::sum)
                .ifPresent(System.out::println);


    }
    private  static  void UmAMilStremLongParaleloThred (){
        int cont = 0;
       LongStream.rangeClosed(0L,1_001)
                .reduce(Long::sum)
                .ifPresent(System.out::println);


    }
    private  static  void UmAMilStremLong (){
        int cont = 0;
        LongStream.rangeClosed(0L,1_001)
                .parallel()
                .reduce(Long::sum)
                .ifPresent(System.out::println);


    }


}
