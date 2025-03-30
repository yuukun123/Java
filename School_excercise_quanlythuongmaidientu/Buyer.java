package School_excercise_quanlythuongmaidientu;

import java.util.*;

public class Buyer extends User implements UserAction {
    public Buyer(String userName, String phoneNumber, String address, String email) {
        super(userName, phoneNumber, address, email);

    }

    @Override
    public void addToCart(Order order) {
        Manage_product.addOrder(order);
        System.out.println("Product added to cart successfully");
    }

    @Override
    public void removeFromCart(Order order){
        Manage_product.removeOrder(order);
    }

    @Override
    public void placeOrder() {
//        if (Manage_product.getAllOrders(this).isEmpty()) {
//            System.out.println("Cart is empty. No order to place");
//            return;
//        }
        System.out.println("Order placed successfully");
        // Add any additional code here to process the order
    }

    @Override
    public void viewOrderHistory() {
        if (Manage_product.getAllOrders(this).size() == 0) {
            System.out.println("No order history");
        } else {
            for (Order order : Manage_product.getAllOrders(this)) {
                System.out.println(order);
            }
        }
    }

}

