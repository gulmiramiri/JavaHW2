package q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details for Account:");
        String accountNumber = scanner.next();
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        Account account = new Account(accountNumber, balance, annualInterestRate);

        System.out.println("\nEnter the details for SavingsAccount:");
        accountNumber = scanner.next();
        balance = scanner.nextDouble();
        annualInterestRate = scanner.nextDouble();
        double overdraftLimit = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, annualInterestRate, overdraftLimit);

        System.out.println("\nEnter the details for CheckingAccount:");
        accountNumber = scanner.next();
        balance = scanner.nextDouble();
        annualInterestRate = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(accountNumber, balance, annualInterestRate);

        System.out.println("\nAccount: " + account.toString());
        System.out.println("SavingsAccount: " + savingsAccount.toString());
        System.out.println("CheckingAccount: " + checkingAccount.toString());
    }
}