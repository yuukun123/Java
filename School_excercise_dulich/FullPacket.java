package School_excercise_dulich;


public class FullPacket extends TravelPacket {
    private String transportDetails;
    private String accommodationDetails;

    public FullPacket(String packageName, double price, String transportDetails, String accommodationDetails) {
        super(packageName, price);
        this.transportDetails = transportDetails;
        this.accommodationDetails = accommodationDetails;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Transport Details: " + transportDetails);
        System.out.println("Accommodation Details: " + accommodationDetails);
    }

    @Override
    public void bookTransport() {
        System.out.println("Booking transport: " + transportDetails);
    }

    @Override
    public void bookAccommodation() {
        System.out.println("Booking accommodation: " + accommodationDetails);
    }

    @Override
    public void displayExtraServices() {
        System.out.println("No extra services available for this package.");
    }
}
