package org.example;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("                  Mashila Mikateko Bank");
        System.out.println("---------------------------------------------------------");

        boolean exit = false;
        while (!exit) {
            System.out.println("1: Check accounts:");
            System.out.println("2: Check credit worthiness:");
            System.out.println("3: Exit");
            System.out.println("---------------------------------------------------------");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    accountMenu();
                    break;
                case 2:
                    creditCheck();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Thank you for using Mashila Mikateko Bank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void accountMenu() {
        boolean accountExit = false;
        while (!accountExit) {
            System.out.println("1: Current account");
            System.out.println("2: Savings account");
            System.out.println("3: Return to main menu");
            System.out.println("---------------------------------------------------------");
            int account = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            switch (account) {
                case 1:
                    myCurrentAccount();
                    break;
                case 2:
                    mySavingsAccount();
                    break;
                case 3:
                    accountExit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void myCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount("mashila01", 100.0, 500.0);
        boolean currentAccountExit = false;

        while (!currentAccountExit) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Current Account Options:");
            System.out.println("1: Check balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Transfer");
            System.out.println("5: Return to account menu");
            System.out.println("---------------------------------------------------------");
            int myAccountOption = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            switch (myAccountOption) {
                case 1:
                    currentAccount.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    Double amountDeposit = scanner.nextDouble();
                    currentAccount.deposit(amountDeposit);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    Double amountWithdrawal = scanner.nextDouble();
                    currentAccount.withdraw(amountWithdrawal);
                    break;
                case 4:
                    System.out.println("Enter recipient account number:");
                    scanner.nextLine();  // Clear buffer before reading next line
                    String number = scanner.nextLine();  // recipient number is left unused for now
                    System.out.println("Enter amount to transfer:");
                    Double amountTransfer = scanner.nextDouble();
                    currentAccount.transfer(amountTransfer);
                    break;
                case 5:
                    currentAccountExit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void mySavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        boolean savingsAccountExit = false;

        while (!savingsAccountExit) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Savings Account Options:");
            System.out.println("1: Check balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Transfer");
            System.out.println("5: Return to account menu");
            System.out.println("---------------------------------------------------------");
            int myAccountOption = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            switch (myAccountOption) {
                case 1:
                    savingsAccount.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    Double amountDeposit = scanner.nextDouble();
                    savingsAccount.deposit(amountDeposit);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    Double amountWithdrawal = scanner.nextDouble();
                    savingsAccount.withdraw(amountWithdrawal);
                    break;
                case 4:
                    System.out.println("Enter recipient account number:");
                    scanner.nextLine();  // Clear buffer before reading next line
                    String number = scanner.nextLine();  // recipient number is left unused for now
                    System.out.println("Enter amount to transfer:");
                    Double amountTransfer = scanner.nextDouble();
                    savingsAccount.transfer(amountTransfer);
                    break;
                case 5:
                    savingsAccountExit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void creditCheck() {
        System.out.println("Checking credit worthiness...");
        // Simulate credit check logic
    }
}