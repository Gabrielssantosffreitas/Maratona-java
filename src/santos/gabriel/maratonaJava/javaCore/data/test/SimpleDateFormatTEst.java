package santos.gabriel.maratonaJava.javaCore.data.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTEst {
    public static void main(String[] args) {
        String mascara = "YYYY-MM-dd G 'at' HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("2005-09-31 d.C. at 10:20:10")); // tem que passa o memo formato que vc comfigurol
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
