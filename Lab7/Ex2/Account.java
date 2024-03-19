package Lab7.Ex2;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientFundsException {
        if ((balance - amount) < 0){
            throw new InsufficientFundsException();
        }
        else{
            balance -= amount;
            return amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
