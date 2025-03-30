package School_excercise_quanlynhahang;

import java.util.*;

public class RestaurantManagement {
    private static final List<MenuItem> menu = new ArrayList<>();
    private static final List<Order> orders = new ArrayList<>();
    private static final Map<Integer, MenuItem> menuItemsById = new HashMap<>();
    private static final Map<String, MenuItem> menuItemsByName = new HashMap<>();

    public static void addToMenu(MenuItem item) {
        menu.add(item);
        menuItemsById.put(item.getId(), item);
        menuItemsByName.put(item.getName(), item);
    }

    public static void removeFromMenu(MenuItem item) {
        menu.remove(item);
        menuItemsById.remove(item.getId());
        menuItemsByName.remove(item.getName());
        item = null;
    }

    public static void updateMenuItem(MenuItem item) {
        MenuItem existingItem = menuItemsById.get(item.getId());
        if (existingItem != null) {
            removeFromMenu(existingItem);
            addToMenu(item);
        }
    }

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static void removeOrder(Order order) {
        orders.remove(order);
    }

    public static MenuItem findItemById(int id) {
        return menuItemsById.get(id);
    }

    public static MenuItem findItemByName(String name) {
        for (MenuItem item : RestaurantManagement.getMenu()) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public static List<MenuItem> getMenu() {
        return new ArrayList<>(menu);
    }

    public static List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

}
