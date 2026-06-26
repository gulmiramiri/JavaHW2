package accountm;
import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        dateCreated = new Date();
    }

    // Constructor with id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    // Monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // withdraw
    public void withdraw(double amount) {
        balance -= amount;
    }

    // deposit
    public void deposit(double amount) {
        balance += amount;
    }
}