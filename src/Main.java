package bankapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(10); // Bank can hold 10 accounts

        while (true) {
            System.out.println("\n===== ReApp Bank Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Show Account Details");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    scanner.nextLine(); // consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double initial = scanner.nextDouble();
                    bank.createAccount(name, initial);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNumDeposit = scanner.nextInt();
                    BankAccount accDeposit = bank.findAccount(accNumDeposit);
                    if (accDeposit != null) {
                        System.out.print("Enter deposit amount: ");
                        double depAmount = scanner.nextDouble();
                        accDeposit.deposit(depAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNumWithdraw = scanner.nextInt();
                    BankAccount accWithdraw = bank.findAccount(accNumWithdraw);
                    if (accWithdraw != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withAmount = scanner.nextDouble();
                        accWithdraw.withdraw(withAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accNumBalance = scanner.nextInt();
                    BankAccount accBalance = bank.findAccount(accNumBalance);
                    if (accBalance != null) {
                        accBalance.showBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    int accNumDetails = scanner.nextInt();
                    BankAccount accDetails = bank.findAccount(accNumDetails);
                    if (accDetails != null) {
                        accDetails.showDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    bank.showAllAccounts();
                    break;

                case 7:
                    System.out.println("Thank you for using ReApp Bank!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
