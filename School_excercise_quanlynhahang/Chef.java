package School_excercise_quanlynhahang;

public class Chef extends Customer implements MenuManagement {

    public Chef(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public void addMenuItem(MenuItem item) {
        RestaurantManagement.addToMenu(item);
    }

    @Override
    public void removeMenuItem(MenuItem item) {
        RestaurantManagement.removeFromMenu(item);
    }

    @Override
    public void updateMenuItem(MenuItem item) {
        RestaurantManagement.updateMenuItem(item);
    }
}
