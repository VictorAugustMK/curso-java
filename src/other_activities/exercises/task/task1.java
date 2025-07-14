package exercises.task;

import java.util.Locale;

public class task1 {

    public static void main (String[] args) {

    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.printf("%nProducts: %nComputer, which price is $%s %nOfice desk, which price is $ %s%n" +
                      "Record: %d years old, code %s and gender: %s %n" +
                      "Mesure with eight decimal places: %s %n" +
                      "Rouded (three decimal places): %.3f %n", price1, price2, age, code, gender, measure, measure);
    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f %n",measure);

    }
}
