public class BalanceInquiry extends Transaction {
    public BalanceInquiry(UserAccount account) {
        super(account, 0);
    }

    public void execute() {
        System.out.println("Current balance: $" + account.getBalance());
    }
}
