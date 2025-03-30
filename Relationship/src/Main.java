public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1000, "Tuan", 20);
        Invoice invoice1 = new Invoice(1000, customer1, 100000);
        System.out.println("Invoice id: " + invoice1.getId());
        System.out.println("Customer name: " + invoice1.getCustomerName());
        System.out.println("Amount before discount: " + invoice1.getAmount());
        System.out.println("Customer discount: " + invoice1.getCustomer().getDiscount() + "%");
        System.out.println("Invoice after discount: " + invoice1.getAmountAfterDiscount());
    }
}