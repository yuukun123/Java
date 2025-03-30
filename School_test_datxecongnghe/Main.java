package School_test_datxecongnghe;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "A001",
                "Nguyen Van A",
                "123",
                "0987xxxxxx",
                "Ha Noi",
                "yZUeh@example.com",
                "Customer"
        );

        Driver driver = new Driver(
                "B001",
                "Nguyen Van B",
                "123",
                "0987xxxxxx",
                "Ha Noi",
                "yZUeh@example.com",
                "Driver"
        );
        customer.showCustomerInfo();
        driver.showDriverInfo();

        Ride ride = customer.bookRide("123 Le Loi",  "Quang Ngai");
        ride.showRideInfo();

        driver.setAvailable(true);
        driver.acceptRide(ride);

        customer.trackRide(ride);

        ride.showRideInfo();

        ride.setStatus("Completed");
        System.out.println("update status: " + ride.getStatus());
        ride.showRideInfo();
    }
}
