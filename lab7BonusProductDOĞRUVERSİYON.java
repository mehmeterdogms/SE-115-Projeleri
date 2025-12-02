public class lab7BonusProduct {
    private String name;
    private int stock;

    public lab7BonusProduct(String n, int s) {
        name = n;
        stock = s;
    }

    public String getName() {
        return name;
    }

    public void buyOne() {
        if (stock == 0) {
            System.out.println("the product is out of stock.");
        } else {
            stock--;
            System.out.println("You successfully bought: " + name);
        }
    }

    public void printInfo() {
        System.out.println("Product Name: " + name + " Stock: " + stock);
    }
}
