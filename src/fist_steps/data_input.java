package fist_steps;

import java.util.Scanner;

public class data_input {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        int x;

        x = sc.nextInt();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.printf("%nDados Digitados%n");

        System.out.println(x);
        sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }

}
