/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

public class CheckingAccount extends Account {

    CheckingAccount(String accountNumber, double balance, double annualInterestRate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void withdrawal(double amount) throws Exception {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            throw new Exception("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount: accountNumber = " + accountNumber +
               ", balance = " + balance +
               ", annualInterestRate = " + annualInterestRate;
    }
}
