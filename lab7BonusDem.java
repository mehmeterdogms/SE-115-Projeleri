import java.util.Scanner;

public class lab7BonusDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of products in the store: ");
        int count = input.nextInt();

        lab7BonusProduct[] arr = new lab7BonusProduct[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Name: ");
            String n = input.next();

            System.out.print("Stock amount: ");
            int s = input.nextInt();

            arr[i] = new lab7BonusProduct(n, s);
        }

        while (true) {
            System.out.println("Enter the name of the product to buy (Type Q to quit): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("Q")) {
                break;
            }

            boolean check = false;

            for (int i = 0; i < count; i++) {
                if (arr[i].getName().equalsIgnoreCase(choice)) {
                    arr[i].buyOne();
                    check = true;
                    break;
                }
            }

            if (check == false) {
                System.out.println("Product not found in the list.");
            }
        }

        System.out.println(" Latest Stock Information ");
        for (int i = 0; i < count; i++) {
            arr[i].printInfo();
        }
    }
}