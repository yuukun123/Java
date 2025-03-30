package School_excercise_dulich;

public class NoTransportNoAccommodationPackage extends TravelPacket {
    public NoTransportNoAccommodationPackage(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void bookTransport() {
        System.out.println("Transport not included in this package.");
    }

    @Override
    public void bookAccommodation() {
        System.out.println("Accommodation not included in this package.");
    }

    @Override
    public void displayExtraServices() {
        if (extraServices.isEmpty()) {
            System.out.println("No extra services available.");
        } else {
            System.out.println("Extra Services: " + String.join(", ", extraServices));
        }
    }


}
