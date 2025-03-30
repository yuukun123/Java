package School_test_datxecongnghe;

import java.util.*;

public class Customer extends User{
    private List<Ride> rideHistory;

    public Customer(String userID, String userName, String password, String phoneNumber, String address, String email, String role) {
        super(userID, userName, password, phoneNumber, address, email, "Customer");
        this.rideHistory = new ArrayList<>();
    }


    public void showCustomerInfo(){
        System.out.println("Customer ID: " + getUserID());
        System.out.println("Customer Name: " + getUserName());
        System.out.println("Customer Phone Number: " + getPhoneNumber());
        System.out.println("Customer Address: " + getAddress());
        System.out.println("Customer Email: " + getEmail());
        System.out.println();
    }

    public Ride bookRide(String pickupLocation, String destination) {
        Ride newRide = new Ride(this, pickupLocation, destination);
        rideHistory.add(newRide);
        return newRide;
    }

    public void trackRide(Ride ride) {
        System.out.println("Current ride status: " + ride.getStatus());
        System.out.println("Pickup location: " + ride.getPickupLocation());
        System.out.println("Destination: " + ride.getDestination());
        System.out.println();


        if (ride.getDriver() != null) {
            System.out.println("Driver name: " + ride.getDriver().getUserName());
            System.out.println("Driver phone number: " + ride.getDriver().getPhoneNumber());
            System.out.println();

        }

        if (ride.getCustomer() != null) {
            System.out.println("Customer name: " + ride.getCustomer().getUserName());
            System.out.println("Customer phone number: " + ride.getCustomer().getPhoneNumber());
            System.out.println();
        }

        if (ride.getStatus().equals("Cancelled")) {
            System.out.println("Ride cancelled. No further action required.");
            System.out.println();
        } else if (ride.getStatus().equals("Completed")) {
            System.out.println("Ride completed. No further action required.");
            System.out.println();
        }

    }

}
