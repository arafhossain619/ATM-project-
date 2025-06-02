import java.util.Scanner;

public class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (bank.verifyAccount(accNo, pin)) {
            UserAccount account = bank.findAccount(accNo);
            boolean running = true;

            while (running) {
                System.out.println("\n1. Balance Inquiry\n2. Deposit\n3. Withdrawal\n4. Exit");
                System.out.print("Choose transaction: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        new BalanceInquiry(account).execute();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        new Deposit(account, depositAmount).execute();
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        new Withdrawal(account, withdrawAmount).execute();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        } else {
            System.out.println("Invalid account or PIN.");
        }

        sc.close();
    }
}
