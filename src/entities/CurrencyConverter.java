package entities;

public class CurrencyConverter {
    public static double IOF = 6.0;

    public static double moneyConverter(double valorDolares) {
        return valorDolares - (valorDolares * IOF/100);
    }
}
