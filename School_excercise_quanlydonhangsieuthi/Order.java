package School_excercise_quanlydonhangsieuthi;

import java.util.ArrayList;

public class Order {
    private String orderId;
    private ArrayList<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.total();
        }
        return total;
    }

    public String toString() {
        String result = "- Order " + orderId + ":\n";
        for (Product product : products) {
            result += " + product: " + product.toString() + "\n";
        }
        result += "total: " + getTotal() + " VND\n";
        return result;
    }
}
