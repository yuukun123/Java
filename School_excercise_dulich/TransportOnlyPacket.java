package School_excercise_dulich;

public class TransportOnlyPacket extends TravelPacket {
    private String transportDetails;

    public TransportOnlyPacket(String name, double price, String transportDetails) {
        super(name, price);
        this.transportDetails = transportDetails;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Transport Details: " + transportDetails);
    }

    @Override
    public void bookTransport() {
        System.out.println("Booking transport: " + transportDetails);
    }

    @Override
    public void bookAccommodation() {
        System.out.println("Accommodation not included in this package.");
    }

    @Override
    public void displayExtraServices() {
        System.out.println("No extra services available for this package.");
    }
}
