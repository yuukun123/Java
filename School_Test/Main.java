package School_Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Flight DomesticFlight = new DomesticFlight("01", "Amsterdam", "12:00", 1000.0);
        Flight InternationalFlight = new InternationalFlight("02", "Tokyo", "13:00", 2000.0);
        Flight LowCostFlight = new LowCostFlight("03", "New York", "14:00", 500.0);

        Booking booking = new Booking();
        booking.addFlight(DomesticFlight);
        booking.addFlight(InternationalFlight);
        booking.addFlight(LowCostFlight);

        Manage_Ticket ticket = booking.bookTicket("01", DomesticFlight, "John Doe", "2023-06-01 10:00:00");
        ticket.processTicket();

        System.out.println();
        List<Manage_Ticket> history = booking.getBookingHistory("John Doe");
        System.out.println("Booking History for John Doe:");
        for (Manage_Ticket t : history) {
            System.out.println("Ticket ID: " + t.getTicketID());
            System.out.println("Flight ID: " + t.getFlight().getFlightID());
            System.out.println("Destination: " + t.getFlight().getDestination());
            System.out.println("Price: " + ticket.calculateFare());
            System.out.println("Departure Time: " + t.getFlight().getDepartureTime());
            System.out.println("Status: " + t.getStatus());
            System.out.println("Booking Time: " + t.getBookingTime());
            System.out.println("-------------------");
        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println("Update ticket status");
        ticket.updateStatus("Cancelled");
        System.out.println("-------------------");

        System.out.println();
        System.out.println("Updated Jane Doe's booking history");
        history = booking.getBookingHistory("John Doe");
        System.out.println("Booking History for John Doe:");
        for (Manage_Ticket t : history) {
            System.out.println("Ticket ID: " + t.getTicketID());
            System.out.println("Flight ID: " + t.getFlight().getFlightID());
            System.out.println("Destination: " + t.getFlight().getDestination());
            System.out.println("Price: " + ticket.calculateFare());
            System.out.println("Departure Time: " + t.getFlight().getDepartureTime());
            System.out.println("Status: " + t.getStatus());
            System.out.println("Booking Time: " + t.getBookingTime());
            System.out.println("-------------------");
        }

    }
}