package exercises.ATM.entity;

public class Account {

    private int number;
    private String holder;
    private static double balance;


    double tax = 5.0;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public static double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw + tax;
    }

    public String toString(){
        return "Account " + number + ", "
                + "Holder: " + holder + ", "
                + "Balance: $ " + String.format("%.2f", balance);
    }

}
