package School_excercise_quanlythuongmaidientu;

import java.util.*;

public class Manage_product {
    private static final List<Product> listProduct = new ArrayList<>();
    private static final List<Order> listOrder = new ArrayList<>();
    private static final Map<String, Product> productByName = new HashMap<>();

    public static void addProduct(Product product) {
        listProduct.add(product);
        productByName.put(product.getProductName(), product);
    }

    public static void removeProduct(Product product) {
        listProduct.remove(product);
        productByName.remove(product.getProductName());
    }

    public static void updateProduct(Product product) {
        Product oldProduct = productByName.get(product.getProductName());
        if (oldProduct != null) {
            listProduct.remove(oldProduct);
            listProduct.add(product);
        }
    }


    public static void addOrder(Order order) {
        listOrder.add(order);
    }

    public static void removeOrder(Order order) {
        listOrder.remove(order);
    }

    public static Product getProductByName(String productName) {
        for (Product product : Manage_product.getAllProducts()) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public static List<Product> getAllProducts() {
        return listProduct;
    }

    public static List<Order> getAllOrders(Buyer buyer) {
            List<Order> orders = new ArrayList<>();
            for (Order order : listOrder) {
                if (order.getBuyer().equals(buyer)) {
                    orders.add(order);
                }
            }
            return orders;
    }


}
