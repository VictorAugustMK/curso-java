package exercises.DolarConverter.aplication;

import exercises.DolarConverter.utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        CurrencyConverter currency = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        double priceDollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        double v = currency.valueDollar(priceDollar,dollarBought);

        System.out.printf("Amount to be paid in reais $ %.2f%n ",v);

        sc.close();
    }
}
