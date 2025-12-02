public class lab7BonusProduct {
    private String prodName;
    private int quantity;

    public lab7BonusProduct(String prodName, int quantity) {
        this.prodName = prodName;
        this.quantity = quantity;
    }

    public void buyOne() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Bought 1 " + prodName);
        } else {
            System.out.println(prodName + " is Out of stock");
        }
    }

    public void printInfo() {
        System.out.println(prodName + " stock = " + quantity);
    }

    public String getProdName() {
        return prodName;
    }
}
