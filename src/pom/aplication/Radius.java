package pom.aplication;

import pom.entity.utils.CalculatorRadius;

import java.util.Locale;
import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculatorRadius calc = new CalculatorRadius();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("π value: %.2f%n",  calc.PI);

        sc.close();
    }

}
