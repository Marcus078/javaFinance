// SavingsAccount.java
package org.example;

public class SavingsAccount extends Transaction {
    public SavingsAccount() {
        super("savings01", 1000.0);  // Sample initial values
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        super.withdraw(withdrawAmount);
    }
}