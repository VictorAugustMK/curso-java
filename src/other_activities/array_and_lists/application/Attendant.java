package array_and_lists.application;

import array_and_lists.application.pension.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Attendant {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many room will be rented: ");
        int n = sc.nextInt();

        Rent[] vect = new Rent[10];

        for (int i = 1; i <= n; i++){

            System.out.println();
            System.out.printf("Rent #%d: %n", i);
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);

        }
        System.out.println();

        System.out.println("Busy rooms: ");

        for(int i = 0; i < 10; i++) {

            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }

        }

    }

}
