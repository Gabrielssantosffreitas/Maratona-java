package main.java.maratonaJava.javaCore.data.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalFormatTest {
    public static void main(String[] args) {

        Locale local = new Locale("pt","BR");
        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,local);

        System.out.println(df.format(c.getTime()));


    }
}
