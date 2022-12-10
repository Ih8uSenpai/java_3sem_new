package formatirovanie.task1;

import java.text.NumberFormat;
import java.util.*;

public class Currency_convert {
    public ArrayList<Currency> arr = new ArrayList<>();
    public double convert(double num, Currency c1, Currency c2){
        return num * c1.CurrencyValue / c2.CurrencyValue;
    }


    public static void main(String[] args) {
        Currency_convert currency_convert = new Currency_convert();
        Scanner in = new Scanner(System.in);
        /*добавим 3 валюты в массив валют*/
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Currency c1 = new Currency(numberFormat1, 1);
        Currency c2 = new Currency(numberFormat2, 1/135.52);
        Currency c3 = new Currency(numberFormat3, 1/7.02);
        currency_convert.arr.add(c1);
        currency_convert.arr.add(c2);
        currency_convert.arr.add(c3);
        /*проверим работу*/
        int number = 100;
        System.out.println("currency convert:");
        System.out.println(c1.Symbol.format(100) + " = " + c2.Symbol.format(currency_convert.convert(100, c1, c2)));
        System.out.println(c1.Symbol.format(100) + " = " + c3.Symbol.format(currency_convert.convert(100, c1, c3)));

    }
}
