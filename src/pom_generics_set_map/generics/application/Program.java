package pom_generics_set_map.generics.application;


import pom_generics_set_map.generics.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.fist();
        System.out.print("Fist: " + x);

        sc.close();

    }

}
