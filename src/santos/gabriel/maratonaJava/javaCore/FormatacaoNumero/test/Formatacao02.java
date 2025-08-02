package santos.gabriel.maratonaJava.javaCore.FormatacaoNumero.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Formatacao02 {
    public static void main(String[] args) throws ParseException {
        Locale brasil = new Locale("pt","BR");
        Locale japan = Locale.JAPAN;
        Locale italia = Locale.ITALIAN;
        Locale chines = Locale.CHINA;
        NumberFormat[] numberFormat = new NumberFormat[6];
        numberFormat[0] = NumberFormat.getCurrencyInstance(brasil);
        numberFormat[1] = NumberFormat.getCurrencyInstance(japan);
        numberFormat[2] = NumberFormat.getCurrencyInstance(italia);
        numberFormat[3] = NumberFormat.getCurrencyInstance(chines);
        numberFormat[4] = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        numberFormat[5] = NumberFormat.getInstance();



        for (int i = 0; i < numberFormat.length; i++) {
            System.out.println(numberFormat[i].format(1_000_000.123d));
        }

        System.out.println(numberFormat[5].getMaximumFractionDigits());
        numberFormat[5].setMaximumFractionDigits(2);
        System.out.println(numberFormat[5].getMaximumFractionDigits());

        System.out.println(numberFormat[3].parse("¥1,000,000.12"));
    }
}
