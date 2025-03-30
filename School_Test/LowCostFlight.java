package School_Test;

public class LowCostFlight extends Flight {
    private double discount = 0.3;

    public LowCostFlight(String flightID, String destination, String departureTime, double basePrice) {
        super(flightID, destination, departureTime, basePrice);
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double fareDetails() {
        return getBasePrice() * (1 - getDiscount());
    }
}
