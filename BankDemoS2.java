import java.util.Scanner;

public class BankDemoS2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        BankAccountS2 acc1 = new BankAccountS2(101, 500.0);
        BankAccountS2 acc2 = new BankAccountS2(102, 1000.0); 

        boolean quit = false;

        while (!quit) {
            System.out.println("\n--- BANK MENU (Processing Account 101) ---");
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Account Details");
            System.out.println("4 -> Change Account ID");
            System.out.println("5 -> Exit");
            System.out.print("Choose: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc1.deposit(scan.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc1.withdraw(scan.nextDouble());
                    break;
                case 3:
                    acc1.accountDetails();
                    break;
                case 4:
                    System.out.println("Old ID: " + acc1.getAccountID());
                    System.out.print("Enter new ID: ");
                    acc1.setAccountID(scan.nextInt());
                    System.out.println("New ID set to: " + acc1.getAccountID());
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }


        System.out.println("\n  Final status of all accounts ");
        acc1.accountDetails();
        acc2.accountDetails();
    }
}
