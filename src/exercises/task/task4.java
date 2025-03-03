package exercises.task;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, i, mult;

        x = sc.nextInt();

        for (i = 1; i <= 10; i++) {

            mult = i * x;

            System.out.println(i + " x " + x + " = " + mult);

        }

        sc.close();
    }

}
