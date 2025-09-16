package main.java.maratonaJava.javaCore.data.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2019,12,15);
        System.out.println(data);
        System.out.println(data.getDayOfMonth() +" - "+data.getMonth()+" - "+data.getYear()+" "+data.getDayOfYear()+" "+ data.isLeapYear()+" ");
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getNano());
        System.out.println(time.getSecond());


        Instant tempoEnternacional = Instant.now();
        System.out.println(tempoEnternacional.plusSeconds(-120));

        //ta


    }

}