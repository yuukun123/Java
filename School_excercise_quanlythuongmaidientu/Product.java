package School_excercise_quanlythuongmaidientu;

public class Product {
    private String productID;
    private String productName;
    private int quantity;
    private double price;


    public Product(String productID, String productName, int quantity, double price) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return null;
    }

    @Override
    public String toString() {
        return "productID : " + productID + ", productName : " + productName + ", quantity : " + quantity + ", price : " + price;
    }
}
