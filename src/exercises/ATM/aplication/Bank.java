package exercises.ATM.aplication;

import exercises.ATM.entity.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        double initialDeposit;
        
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();

            account = new Account(number, holder, initialDeposit);

        } else {
            account = new Account(number, holder);
        }

        System.out.println();

        System.out.println("Account data: " + account);
        System.out.println();

        System.out.print("Enter deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println();

        System.out.println("Update account data");
        System.out.println("Account data: " + account);
        System.out.println();

        System.out.print("How much do you withdraw? ");
        double withDraw = sc.nextDouble();

        account.withdraw(withDraw);

        System.out.println("Update account data");
        System.out.println("Account data: " + account);

    }
}
