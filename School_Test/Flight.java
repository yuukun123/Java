package School_Test;

public abstract class Flight {
    private String flightID;
    private String destination;
    private String departureTime;
    private double basePrice;

    public Flight(String flightID, String destination, String departureTime,  double basePrice) {
        this.flightID = flightID;
        this.destination = destination;
        this.departureTime = departureTime;
        this.basePrice = basePrice;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double fareDetails();

}
