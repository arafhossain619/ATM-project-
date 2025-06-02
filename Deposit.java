public class Deposit extends Transaction {
    public Deposit(UserAccount account, double amount) {
        super(account, amount);
    }

    public void execute() {
        account.credit(amount);
        System.out.println("Deposited: $" + amount);
    }
}
