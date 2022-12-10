package formatirovanie.task2;
import formatirovanie.task1.Currency;
import formatirovanie.task1.Currency_convert;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public String name;
    public int ID, cost;
    public Shop(String name, int ID, int cost) {
        this.name = name;
        this.ID = ID;
        this.cost = cost;
    }
    public void buy(Currency_convert currency_convert){
        System.out.println("Selected product is: " + toString() + "\nChose the currency:\n1 - US\n2 - JAPAN\n3 - CHINA\n");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("convert cost:");
        System.out.println(currency_convert.arr.get(0).Symbol.format(cost) + " = " + currency_convert.arr.get(n - 1).Symbol.format(currency_convert.convert(cost, currency_convert.arr.get(0), currency_convert.arr.get(n - 1))));
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", cost=$" + cost +
                '}';
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
        /*Сделаем массив из 5 товаров и заполним его*/
        Shop[] shop = new Shop[5];
        shop[0] = new Shop("item1", 100, 5);
        shop[1] = new Shop("item2", 101, 12);
        shop[2] = new Shop("item3", 102, 3);
        shop[3] = new Shop("item4", 103, 52);
        shop[4] = new Shop("item5", 104, 121);
        /*проверим работу*/
        System.out.println("product list:");
        for (Shop el : shop)
            System.out.println(el.toString());
        /*int number = 100;
        System.out.println("currency convert:");
        System.out.println(c1.Symbol.format(100) + " = " + c2.Symbol.format(currency_convert.convert(100, c1, c2)));
        System.out.println(c1.Symbol.format(100) + " = " + c3.Symbol.format(currency_convert.convert(100, c1, c3)));*/
        System.out.println("Enter product ID to purchase it:");
        int id = in.nextInt();
        for (Shop el : shop)
            if (el.ID == id)
                el.buy(currency_convert);
    }
}
