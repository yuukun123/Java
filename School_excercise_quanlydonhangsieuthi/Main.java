package School_excercise_quanlydonhangsieuthi;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("001", "Sach", 2, 50000);
        Product p2 = new Product("002", "But", 1, 50000);
        Product p3 = new Product("003", "Nuoc", 1, 12000);

        // Create an order
        Order o1 = new Order("1");
        o1.addProduct(p1);
        o1.addProduct(p2);

        // Create a second order
        Order o2 = new Order("2");
        o2.addProduct(p3);

        // Create a customer
        Customer customer = new Customer("001", "Nguyen Van A", "123 Duong ABC, TP. HCM", "0987xxxxxx");
        customer.addOrder(o1);
        customer.addOrder(o2);

        // Print customer details
        System.out.println(customer);
    }
}
