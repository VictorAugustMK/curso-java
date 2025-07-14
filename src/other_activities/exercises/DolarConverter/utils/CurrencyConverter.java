package exercises.DolarConverter.utils;

public class CurrencyConverter {

    public final double IOF = 6.0;

    public double valueDollar(double priceDollar, double dollarBought) {

        return (priceDollar * dollarBought) + (priceDollar * dollarBought) / 100 * IOF;

    }
}
