package formatirovanie.task1;

import java.text.NumberFormat;

public class Currency {
    public NumberFormat Symbol;
    public double CurrencyValue;
    public Currency(NumberFormat symbol, double value){
        Symbol = symbol;
        CurrencyValue = value;
    }

}
