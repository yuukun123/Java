package School_excercise_quanlynhahang;

public class Waiter extends Customer{

    public Waiter(String name, String address, String phone) {
        super(name, address, phone);
    }

    public void createOrder(Order order) {
        RestaurantManagement.addOrder(order);
    }

    public void removeOrder(Order order) {
        RestaurantManagement.removeOrder(order);
    }

}
