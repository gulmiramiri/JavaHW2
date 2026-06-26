package q7;

import java.util.Scanner;

public class ATM {

private Account[] accounts;
    private int accountCount;
    private Scanner scanner;
    int id;

    public ATM() {
        accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100.0);
        }
        accountCount = 10;
        scanner = new Scanner(System.in);
    }

    public void run() {
        
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Enter your ID:");
            id = scanner.nextInt();

            for (int i = 0; i < accountCount; i++) {
                if (accounts[i].getId() == id) {
                    loggedIn = true;
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Invalid ID. Please try again.");
            }
        }

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. View current balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBalance(id);
                    break;
                case 2:
                    withdrawMoney(id);
                    break;
                case 3:
                    depositMoney(id);
                    break;
                case 4:
                    System.out.println("Exiting the ATM...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayBalance(int id) {
        Account account = findAccountById(id);
        if (account != null) {
            System.out.printf("Current balance: $%.2f\n", account.getBalance());
        } else {
            System.out.println("No account found with the given ID.");
        }
    }

    private void withdrawMoney(int id) {
        Account account = findAccountById(id);
        if (account != null) {
            double amount;
            do {
                System.out.print("Enter the amount to withdraw: $");
                amount = scanner.nextDouble();
                if (amount > account.getBalance()) {
                    System.out.println("Insufficient funds. Please try again.");
                }
            } while (amount > account.getBalance());

            account.setBalance(account.getBalance() - amount);
            System.out.printf("Withdrawal successful. New balance: $%.2f\n", account.getBalance());
        } else {
            System.out.println("No account found with the given ID.");
        }
    }

    private void depositMoney(int id) {
        Account account = findAccountById(id);
        if (account != null) {
            double amount;
            do {
                System.out.print("Enter the amount to deposit: $");
                amount = scanner.nextDouble();
            } while (amount < 0);

            account.setBalance(account.getBalance() + amount);
            System.out.printf("Deposit successful. New balance: $%.2f\n", account.getBalance());
        } else {
            System.out.println("No account found with the given ID.");
        }
    }

    private Account findAccountById(int id) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getId() == id) {
                return accounts[i];
            }
        }
        return null;
    }
}