package School_excercise_dulich;

public class AccommodationOnlyPackage extends TravelPacket{
    private String accommodationDetails;

    public AccommodationOnlyPackage(String name, double price, String accommodationDetails) {
        super(name, price);
        this.accommodationDetails = accommodationDetails;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Accommodation details: " + accommodationDetails);
    }

    @Override
    public void bookTransport() {
        System.out.println("Transport not included in this package.");
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
