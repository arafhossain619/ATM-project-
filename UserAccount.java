public class UserAccount {
    private String accountNumber;
    private int pin;
    private double balance;

    public UserAccount(String accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePIN(int inputPIN) {
        return this.pin == inputPIN;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void credit(double amount) {
        balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
