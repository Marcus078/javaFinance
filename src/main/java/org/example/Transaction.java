package org.example;

public class Transaction {
    protected String accountNumber;
    protected Double balance;

    public Transaction(String accountNumber, Double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(Double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else {
            System.out.println("Amount should be positive.");
        }
    }

    public void withdraw(Double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrew: " + withdrawAmount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(Double transferAmount) {
        if (transferAmount <= balance) {
            balance -= transferAmount;
            System.out.println("Transferred: " + transferAmount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

