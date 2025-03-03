package repetitive_structures;

import java.util.Locale;
import java.util.Scanner;

public class other_estructure {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c, f;
        char res;

        do {
            System.out.print("Digite a temperadura em Celsius: ");

            c = sc.nextDouble();
            f = 9. * c / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

            System.out.print("Deseja repetir (s/n)? ");

            res = sc.next().charAt(0);
        } while (res != 'n');

        sc.close();

    }

}
