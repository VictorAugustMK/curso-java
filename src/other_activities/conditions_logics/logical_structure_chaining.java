package conditions_logics;

import java.util.Scanner;

public class logical_structure_chaining {

    public static void main (String[] arg) {

        int hour;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas?");
        hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("Bom dia!");
        }
        else if (hour < 18) {
            System.out.println("Bom tarde!");
        }
        else {
            System.out.println("Bom noite!");
        }
        sc.close();

    }
}
