import java.util.Scanner;

public class BankAccountS2 {

    private int accountID;
    private double balance;


    public BankAccountS2(int id, double b) {
        accountID = id;
        balance = b;
    }


    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int id) {
        accountID = id;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {

            Scanner sc = new Scanner(System.in);
            System.out.println("Insufficient balance! Do you want to go into borrowing? (yes/no)");
            String response = sc.next();

            if (response.equalsIgnoreCase("yes")) {
                balance -= amount;
                System.out.println("Withdrawn (Debt): " + amount);
            } else {
                System.out.println("Transaction cancelled. Insufficient balance!");
            }
        }
    }


    public void accountDetails() {
        System.out.println("Account ID: " + accountID + " | Balance: " + balance);
    }
}
