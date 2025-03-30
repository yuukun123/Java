package School_excercise_quanlythuongmaidientu;

public class CreditPay implements Payment {

    @Override
    public void payment(Order order) {
        System.out.println("Payment by credit for order " + order.getTotal());
    }
}
