import java.util.Scanner;

public class lab7BonusDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many products does your store have?");
        final int LIMIT = scan.nextInt();

        lab7BonusProduct[] inventory = new lab7BonusProduct[LIMIT];

        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter product name:");
            String inputName = scan.next();

            System.out.println("Enter stock information:");
            int inputQty = scan.nextInt();

            inventory[i] = new lab7BonusProduct(inputName, inputQty);
        }

        while (true) {
            System.out.println("Enter product to buy or Q to quit:");
            String request = scan.next();

            if (request.equalsIgnoreCase("Q"))
                break;

            boolean isFound = false;
            for (lab7BonusProduct item : inventory) {
                if (item.getProdName().equalsIgnoreCase(request)) {
                    item.buyOne();
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("No such product!");
            }
        }

        System.out.println("\nFinal stock:");
        for (lab7BonusProduct item : inventory) {
            item.printInfo();
        }
    }
}