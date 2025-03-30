package School_test_datxecongnghe;

import java.util.Objects;

public class Ride {
    private final int rideID;
    private static int countRide = 1;
    private final String pickUpLocation;
    private final String destination;
    private String status;
    private Customer customer;
    private Driver driver;

    public Ride(Customer customer ,String pickUpLocation, String destination) {
        this.rideID = countRide++;
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
        this.customer = customer;
        this.status = "Pending";
    }

    public int getRideID() {
        return rideID;
    }

    public String getPickupLocation() {
        return pickUpLocation;
    }

    public String getDestination() {
        return destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void showRideInfo() {
        System.out.println("=================Lich Su Chuyen Di==================");
        System.out.println("Chuyến đi ID: " + getRideID());
        System.out.println("Khách hàng: " + customer.getUserName());
        System.out.println("Tài xế: " + (driver != null ? driver.getUserName() : "Chưa có tài xế"));
        System.out.println("Điểm đón: " + getPickupLocation());
        System.out.println("Điểm đến: " + destination);
        System.out.println("Trạng thái: " + status);
        System.out.println();
    }


}
