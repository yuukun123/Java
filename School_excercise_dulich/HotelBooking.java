package School_excercise_dulich;

public class HotelBooking {
    private String packageName; // The associated travel package
    private String hotelName;   // Name of the hotel being booked
    private String customerName; // Name of the customer who booked

    public HotelBooking(String packageName, String hotelName, String customerName) {
        this.packageName = packageName;
        this.hotelName = hotelName;
        this.customerName = customerName;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void displayBookingDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Package: " + packageName);
        System.out.println("Hotel: " + hotelName);
    }
}
