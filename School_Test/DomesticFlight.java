package School_Test;

public class DomesticFlight extends Flight {
    private double Tax = 0.1;

    public DomesticFlight(String flightID, String destination, String departureTime, double basePrice) {
        super(flightID, destination, departureTime, basePrice);
    }

    public double getTax() {
        return Tax;
    }

    @Override
    public double fareDetails() {
        return getBasePrice() * (1 + getTax());
    }

}
