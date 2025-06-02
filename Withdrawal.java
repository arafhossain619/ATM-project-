public class Withdrawal extends Transaction {
    public Withdrawal(UserAccount account, double amount) {
        super(account, amount);
    }

    public void execute() {
        if (account.getBalance() >= amount) {
            account.debit(amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
