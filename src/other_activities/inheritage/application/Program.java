package inheritage.application;

import inheritage.entities.Account;
import inheritage.entities.BussinessAccount;
import inheritage.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1002, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1003, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BussinessAccount acc4 = (BussinessAccount)acc2;
        acc4.loan(100.0);

       // BussinessAccount acc5 = (BussinessAccount)acc3;

        if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalence();
//            System.out.println("Update!");
        }

        Account acc6 = new Account(1006, "Alex", 1000.0);
        acc6.withDraw(200);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1007, "Maria", 1000.0, 0.01);
        acc7.withDraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BussinessAccount(1008, "Bob", 1000.0, 500.0);
        acc8.withDraw(200);
        System.out.println(acc8.getBalance());
    }

}
