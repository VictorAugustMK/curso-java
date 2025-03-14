package array_and_lists.application.VectorClass;

import java.util.Locale;
import java.util.Scanner;

public class Height {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i=0; i < n; i++){
            sum += vect[1];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
