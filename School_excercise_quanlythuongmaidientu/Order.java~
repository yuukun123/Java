package School_excercise_quanlythuongmaidientu;

import School_excercise_quanlynhahang.MenuItem;

import java.util.*;

public class Order {
    private int orderID;
    private static int orderCount = 0;
    private List<Product> products;
    private Buyer buyer;

    public Order(Buyer buyer) {
        this.orderID = ++orderCount;
        this.products = new ArrayList<>();
        this.buyer = buyer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public int getOrderId() {
        return orderID;
    }

    public void orderProduct(String productName){
        orderProduct(productName, 1);
    }

    public void orderProduct(String productName, int quantity) {
        Product product = Manage_product.getProductByName(productName);
        if (product != null) {
            for (int i = 0; i < quantity; i++) {
                products.add(product);
            }
        }
        else {
            System.out.println("Product not found");
        }
    }

    public double getTotal() {
        if(products.isEmpty()){
            return 0;
        }
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public String toString() {
        String result = "Order " + orderID + ":\n";
        result += "buyer: " + buyer.toString() + "\n";
        Map<Product, Integer> itemCount = new HashMap<>();
        double total = 0;
        for (Product item : products) {
            itemCount.merge(item, 1, Integer::sum);
            total += item.getPrice();
        }
        for (Map.Entry<Product, Integer> entry : itemCount.entrySet()) {
            Product product = entry.getKey();
            int count = entry.getValue();
            result += String.format("- %s x%d: %.2f VND\n", product.getProductName(), count, product.getPrice() * count);
        }
        result += "total: " + getTotal() + " VND\n";
        return result;
    }
}
