/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Date;

public class Account {
    String accountNumber;
    double balance;
    double annualInterestRate;
    private Date dateCreated;

    public Account(String accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public Account() {
        this.accountNumber = "123456";
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Account: accountNumber = " + accountNumber +
               ", balance = " + balance +
               ", annualInterestRate = " + annualInterestRate +
               ", dateCreated = " + dateCreated;
    }
}
