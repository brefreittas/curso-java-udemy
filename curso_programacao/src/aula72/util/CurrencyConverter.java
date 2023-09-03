package aula72.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double total(double dollarPrice, double amountDollar) {
        double convertedValue = dollarPrice*amountDollar;
        return convertedValue + convertedValue * IOF;
    }
}
