package oopsbasics;

import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {   //custom class
    InsufficientBalanceException(String message) {   //constructor
        super(message);   //passes the message to the parent class(Exception)
    }
}

abstract class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {    //getter
        return accountNumber;
    }

    public String getAccountHolderName() {   //getter
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Updated Balance:" + balance);
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Wrong amount entered! , Please enter correct amount!");
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            } else if (amount > 0) {
                balance -= amount;
                System.out.println("Balance left:" + balance);
            } else {
                System.out.println("Wrong amount entered! , Please enter correct amount !");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Your entered amount is bigger than your current balance!");
        }
    }

    abstract void displayAccount();   // abstract method
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void displayAccount() {
        System.out.println("This is a Savings Account!");
    }

}

public class ProjectCLI {
    public static void main(String[] args) {
        int accountNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        accountNumber = sc.nextInt();
        sc.nextLine();
        String accountHolderName;
        System.out.println("Enter Account Holder Name:");
        accountHolderName = sc.nextLine();

        double balance;
        System.out.println("Enter your Balance:");
        balance = sc.nextDouble();
        if (balance < 0) {
            balance = 0;
            System.out.println("Balance is ZERO!");
        }

        SavingsAccount obj = new SavingsAccount(accountNumber, accountHolderName, balance);
        obj.displayAccount();
        System.out.println("Account Number:" + obj.getAccountNumber());
        System.out.println("Account Holder Name:" + obj.getAccountHolderName());

        boolean running = true;
        while (running) {
            System.out.println("----MENU OPTIONS----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current Balance:" + obj.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter deposit amount:");
                        double amount = sc.nextDouble();
                        obj.deposit(amount);
                        break;
                    case 3:
                        System.out.println("Enter withdrawal amount:");
                        double money = sc.nextDouble();
                        obj.withdraw(money);
                        break;
                    case 4:
                        System.out.println("Thank You for using BankApp!");
                        System.out.println("GoodBye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice! Please Enter a valid number!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
