package main.java.maratonaJava.javaCore.data.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarioTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
    }
}
