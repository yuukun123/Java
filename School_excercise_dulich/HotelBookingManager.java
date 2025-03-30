package School_excercise_dulich;

import java.util.ArrayList;
import java.util.List;

public class HotelBookingManager implements AccommodationService {
    private List<HotelBooking> bookings;

    public HotelBookingManager() {
        bookings = new ArrayList<>();
    }

    // Implement the selectRoom method from the AccommodationService interface
    @Override
    public void selectRoom(String roomType, String customerName) {
        // Assuming room type selection can be stored and associated with the customer
        System.out.println("Customer " + customerName + " has selected a " + roomType + " room.");
    }

    // Add a new hotel booking
    public void addBooking(String packageName, String hotelName, String customerName) {
        HotelBooking booking = new HotelBooking(packageName, hotelName, customerName);
        bookings.add(booking);
        System.out.println("Hotel booking added for customer: " + customerName);
    }

    // Remove a booking by customer name and package name
    public void cancelBooking(String customerName, String packageName) {
        boolean removed = bookings.removeIf(b -> b.getCustomerName().equalsIgnoreCase(customerName) &&
                b.getPackageName().equalsIgnoreCase(packageName));
        if (removed) {
            System.out.println("Booking canceled for customer: " + customerName + " (Package: " + packageName + ")");
        } else {
            System.out.println("No booking found for customer: " + customerName + " (Package: " + packageName + ")");
        }
    }

    // Display all bookings
    public void displayAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No hotel bookings available.");
        } else {
            System.out.println("List of Hotel Bookings:");
            for (HotelBooking booking : bookings) {
                booking.displayBookingDetails();
                System.out.println("---------------------------");
            }
        }
    }

    // Search for bookings by customer name
    public void searchBookingsByCustomer(String customerName) {
        boolean found = false;
        for (HotelBooking booking : bookings) {
            if (booking.getCustomerName().equalsIgnoreCase(customerName)) {
                booking.displayBookingDetails();
                System.out.println("---------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No bookings found for customer: " + customerName);
        }
    }
}
