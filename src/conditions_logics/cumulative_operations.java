package conditions_logics;

import java.util.Locale;

import java.util.Scanner;

public class cumulative_operations {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();
        double conta = 50.0;

        if (minutes > 100) {
            conta += (minutes - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}