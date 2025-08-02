package santos.gabriel.maratonaJava.javaCore.io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {


    public static void main(String[] args) {
        File file = new File("arquivos/pasta");
        try {

            boolean isDiretorio = file.mkdir();


        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
