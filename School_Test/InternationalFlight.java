package School_Test;

public class InternationalFlight extends Flight{
    private double InternationalTax = 0.2;

    public InternationalFlight(String flightID, String destination, String departureTime, double basePrice) {
        super(flightID, destination, departureTime, basePrice);
    }

    public double getInternationalTax() {
        return InternationalTax;
    }

    @Override
    public double fareDetails() {
        return getBasePrice() * (1 + getInternationalTax());
    }
}
