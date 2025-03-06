package polymorphism.entities;

public class SavingsAccount extends Account {

    private Double interrestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interrestRate) {
        super(number, holder, balance);
        this.interrestRate = interrestRate;
    }

    public Double getInterrestRate() {
        return interrestRate;
    }

    public void setInterrestRate(Double interrestRate) {
        this.interrestRate = interrestRate;
    }

    public void updateBalence() {
        balance += balance * interrestRate;
    }

    @Override
    public void withDraw(double amount) {
        balance -= amount;
    }
}
