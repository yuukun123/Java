package School_excercise_quanlynhahang;

public class Main {
    public static void main(String[] args) {
        // Create restaurant
        Restaurant restaurant = new Restaurant("Nhà hàng ABC", "123 Đường XYZ", "0123456789");

        // Create staff
        Chef chef = new Chef("Đầu bếp A", "0987654321", "456 Đường KLM");
        Waiter waiter = new Waiter("Phục vụ B", "0987654322", "789 Đường NOP");

        // Add menu items
        chef.addMenuItem(new MenuItem(1, "Phở bò", 55000, "Phở bò truyền thống"));
        chef.addMenuItem(new MenuItem(2, "Cơm sườn", 45000, "Cơm sườn nướng"));
        chef.addMenuItem(new MenuItem(3, "Bún chả", 40000, "Bún chả Hà Nội"));

        // Print menu
        System.out.println("\nCurrent Menu:");
        RestaurantManagement.getMenu().forEach(System.out::println);

        // Create customer and order
        Customer customer = new Customer("Khách hàng C", "0987654323", "012 Đường QRS");
        Order order = new Order(customer);

        // Test overloaded ordering methods
        order.orderItem("Phở bò");           // Order by name
        order.orderItem(2);                  // Order by id
        order.orderItem("Bún chả", 2);       // Order by name and quantity

        // Process order
        waiter.createOrder(order);

        // Print order details
        System.out.println("\nOrder Details:");
        System.out.println(order);
        System.out.println();

        // Process payment
        Payment payment = new CashPay();
        payment.processPayment(order);

        // remove order
        waiter.removeOrder(order);
        order = null;

        // Print order details
        System.out.println("\nOrder Details:");
        System.out.println(order);
        System.out.println();

        payment.processPayment(order);
    }
}
