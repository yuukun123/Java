package School_excercise_quanlynhahang;

import java.time.LocalDateTime;
import java.util.*;

public class Order {
    public LocalDateTime timeOfOrder;
    private List<MenuItem> menuItems;
    private Customer customer;
    private static int orderCount = 1;
    private final int orderID = orderCount++;

    public Order(Customer customer) {
        this.menuItems = new ArrayList<>();
        this.customer = customer;
        this.timeOfOrder = LocalDateTime.now();
    }

    public void orderItem(String name) {
        orderItem(name,1);
    }

    public void orderItem(int id) {
        orderItem(id,1);
    }

    public void orderItem(MenuItem item) {
        orderItem(item,1);
    }

    public void orderItem(String name, int quantity) {
        MenuItem item = RestaurantManagement.findItemByName(name);
        if (item != null) {
            for (int i = 0; i < quantity; i++) {
                menuItems.add(item);
            }
        } else {
            System.out.println("Item not found");
        }
    }

    public void orderItem(int id, int quantity) {
        MenuItem item = RestaurantManagement.findItemById(id);
        if (item != null) {
            for (int i = 0; i < quantity; i++) {
                menuItems.add(item);
            }
        } else {
            System.out.println("Item not found");
        }
    }

    public void orderItem(MenuItem item, int quantity) {
        if (item != null) {
            for (int i = 0; i < quantity; i++) {
                menuItems.add(item);
            }
        } else {
            throw new IllegalArgumentException("Menu item cannot be null");
        }
    }

    public double getTotal() {
        if(menuItems.isEmpty()) return 0;
        else return menuItems.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public List<MenuItem> getItems() {
        return new ArrayList<>(menuItems);
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order #").append(orderID).append("\n");
        sb.append("Customer: ").append(customer.getName()).append("\n");
        sb.append("Items:\n");
        Map<MenuItem, Integer> itemCount = new HashMap<>();
        menuItems.forEach(item -> itemCount.merge(item, 1, Integer::sum));
        itemCount.forEach((item, count) ->
                sb.append(String.format("- %s x%d: %.2f VND\n", item.getName(), count, item.getPrice() * count))
        );
        sb.append(String.format("Total: %.2f VND", getTotal()));
        return sb.toString();
    }

}
