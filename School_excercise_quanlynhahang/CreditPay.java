package School_excercise_quanlynhahang;

public class CreditPay implements Payment {

    @Override
    public void processPayment(Order order) {
        System.out.println("Payment by credit for order " + order.getTotal());
    }
}
