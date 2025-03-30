package School_excercise_quanlythuongmaidientu;

import java.util.*;

public class Seller extends User{
    public Seller(String userName, String phoneNumber, String address, String email, String role) {
        super(userName,phoneNumber, address, email);
    }

    public void addProduct(Product product) {
        Manage_product.addProduct(product);
    }

    public void updateProduct(Product product) {
        Manage_product.updateProduct(product);
    }

    public void removeProduct(Product product) {
        Manage_product.removeProduct(product);
    }


}
