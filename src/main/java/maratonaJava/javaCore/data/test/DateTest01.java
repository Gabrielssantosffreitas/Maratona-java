package main.java.maratonaJava.javaCore.data.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();//long
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        System.out.println(date.toInstant());

    }
}
