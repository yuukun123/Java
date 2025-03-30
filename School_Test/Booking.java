package School_Test;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<Flight> flights;
    private List <Manage_Ticket> tickets;
    private List<BookingHistory> histories;

    public Booking() {
        this.flights = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.histories = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    private BookingHistory createBookingHistory(String passengerName) {
        for(BookingHistory history : histories) {
            if(history.getPassengerName().equals(passengerName)) {
                return history;
            }
        }
        BookingHistory newhistory = new BookingHistory(passengerName);
        histories.add(newhistory);
        return newhistory;
    }

    public List<Manage_Ticket> getBookingHistory(String passengerName) {
        for(BookingHistory history : histories) {
            if(history.getPassengerName().equals(passengerName)) {
                return history.getTickets();
            }
        }
        return null;
    }

    public Manage_Ticket bookTicket(String flightID, Flight flight, String passengerName, String bookingTime) {
        Manage_Ticket ticket = new Manage_Ticket(flightID, flight, passengerName, "Booked", bookingTime);
        tickets.add(ticket);
        BookingHistory history = createBookingHistory(passengerName);
        history.addTicket(ticket); // Add the ticket to the BookingHistory object
        return ticket;
    }

    public List<Manage_Ticket> getAllTickets() {
        return tickets;
    }

    public List<Flight> getAllFlights() {
        return flights;
    }
}
