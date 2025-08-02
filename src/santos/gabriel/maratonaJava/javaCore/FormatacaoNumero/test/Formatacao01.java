package santos.gabriel.maratonaJava.javaCore.FormatacaoNumero.test;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatacao01 {
    public static void main(String[] args) {
        Locale brasil = new Locale("pt","BR");
        Locale japan = Locale.JAPAN;
        Locale italia = Locale.ITALIAN;
        Locale chines = Locale.CHINA;
        NumberFormat[] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getInstance(brasil);
        numberFormat[1] = NumberFormat.getInstance(japan);
        numberFormat[2] = NumberFormat.getInstance(italia);
        numberFormat[3] = NumberFormat.getInstance(chines);


        for (int i = 0; i < numberFormat.length; i++) {
            System.out.println(numberFormat[i].format(1_000_000.123d));
        }
    }
}
