package main.java.maratonaJava.javaCore.io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest01 {



    public static void main(String[] args) {
        File file = new File("arquivos/texto.txt");
        try {

            boolean isCreate = file.createNewFile();
            System.out.println("criado: "+ isCreate);
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println("-------");
            System.out.println(file.getAbsoluteFile());
            System.out.println("------------");
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());// oculto
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY 'Horas' HH'hr'mm'm' ");

            System.out.println("modificado: "+ sdf.format(new Date(file.lastModified())));

            if (file.exists()){
                boolean isDelete = file.delete();
                System.out.println("deletado: "+isDelete);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
