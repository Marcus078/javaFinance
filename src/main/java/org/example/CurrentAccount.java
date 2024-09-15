// CurrentAccount.java
package org.example;

public class CurrentAccount extends Transaction {
    Double limit;

    public CurrentAccount(String accountNumber, Double initialBalance, Double limit) {
        super(accountNumber, initialBalance);
        this.limit = limit;
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        if (withdrawAmount > 0 && balance  >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Withdrew: " + withdrawAmount);
        } else {
            System.out.println("Insufficient funds in Current Account.");
        }
    }
}

// SavingsAccount.java
