package School_excercise_quanlydonhangsieuthi;

import java.util.ArrayList;

public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phone;
    private String email;
    private ArrayList<Order> orders;

    public Customer(String customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        orders = new ArrayList<>();
    }

    public String getCustomerID() {
        return customerID;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double getTotal() {
        double total = 0;
        for (Order order : orders) {
            total += order.getTotal();
        }
        return total;
    }

    public String toString() {
        String result = "Customer: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phone + "\n\n" +
                "Total order cost: \n";

        System.out.println("History orders: ");
        for (Order order : orders) {
            result += order.toString() + "\n";
        }

        return result + "Total order cost: " + getTotal() + " VND";
    }
}
