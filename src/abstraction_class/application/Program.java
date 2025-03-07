package abstraction_class.application;

import abstraction_class.entities.Account;
import abstraction_class.entities.BussinessAccount;
import abstraction_class.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "ALex", 500.0, 0.01));
        list.add(new BussinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BussinessAccount(1004, "Maria", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10);
        }
        for (Account acc : list){
            System.out.printf("Updated balence for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
