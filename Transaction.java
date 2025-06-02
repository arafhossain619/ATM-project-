public public abstract class Transaction {
    protected double amount;
    protected UserAccount account;

    public Transaction(UserAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public abstract void execute();
}

