package aula81to83.entities;

public class Account {
    private final int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit (double amount) {
        accountBalance += amount;
    }

    public void withdraw (double amount) {
        accountBalance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + ", Holder: " + getAccountHolder() + ", Balance: $" + String.format("%.2f", getAccountBalance());
    }
}
