package School_excercise_quanlythuongmaidientu;

public interface UserAction {
    void addToCart(Order order);
    void removeFromCart(Order order);
    void placeOrder();
    void viewOrderHistory();
}
