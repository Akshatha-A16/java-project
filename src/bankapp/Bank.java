package bankapp;

public class Bank {
    private BankAccount[] accounts;
    private int totalAccounts;
    private static int nextAccountNumber = 1001; // static counter for account numbers

    public Bank(int size) {
        accounts = new BankAccount[size];
        totalAccounts = 0;
    }

    // Create a new account
    public void createAccount(String accountHolder, double initialBalance) {
        if (totalAccounts < accounts.length) {
            BankAccount account = new BankAccount(nextAccountNumber++, accountHolder, initialBalance);
            accounts[totalAccounts++] = account;
            System.out.println("Account created successfully! Account Number: " + account.getAccountNumber());
        } else {
            System.out.println("Bank is full. Cannot create more accounts.");
        }
    }

    // Find account by account number
    public BankAccount findAccount(int accountNumber) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null; // not found
    }

    // Show all accounts
    public void showAllAccounts() {
        for (int i = 0; i < totalAccounts; i++) {
            accounts[i].showDetails();
            System.out.println("---------------------");
        }
    }
}
