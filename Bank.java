import java.util.HashMap;

public class Bank {
    private String name;
    private HashMap<String, UserAccount> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(UserAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public UserAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean verifyAccount(String accountNumber, int pin) {
        UserAccount account = accounts.get(accountNumber);
        return account != null && account.validatePIN(pin);
    }
}
