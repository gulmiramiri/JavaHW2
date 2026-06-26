/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

public class SavingsAccount extends Account {
    private double overdraftLimit;

    public SavingsAccount(String accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public SavingsAccount() {
        super();
    }

    public void withdrawal(double amount) throws Exception {
        if (amount > 0 && (balance - amount + overdraftLimit >= 0)) {
            balance -= amount;
        } else {
            throw new Exception("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount: accountNumber = " + accountNumber +
               ", balance = " + balance +
               ", annualInterestRate = " + annualInterestRate +
               ", overdraftLimit = " + overdraftLimit;
    }
}
