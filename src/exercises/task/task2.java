package exercises.task;

import java.util.Locale;
import java.util.Scanner;

public class task2 {

    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    double x, y, z, area, square_metro;

    System.out.print("Area do terreno: ");
    x = sc.nextDouble();

    System.out.print("Qual e largura do terreno: ");
    y = sc.nextDouble();

    System.out.print("Valor do metro quadrado: ");
    z = sc.nextDouble();

    area = x * y;
    square_metro = area * z;

    Locale.setDefault(Locale.US);

    System.out.printf("Area do terreno: %.2f%n", area);
    System.out.printf("Preço do terreno: %.2f%n", square_metro);

    }

}
