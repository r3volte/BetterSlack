package New;

public class Purchase {
    private String productName;
    private double price;

    public Purchase(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    private Purchase() {
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
