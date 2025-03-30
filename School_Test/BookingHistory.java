package School_Test;

import java.util.ArrayList;
import java.util.List;

public class BookingHistory {
    private String passengerName;
    private List<Manage_Ticket> tickets;

    public BookingHistory(String passengerName) {
        this.passengerName = passengerName;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Manage_Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Manage_Ticket> getTickets() {
        return tickets;
    }

    public String getPassengerName() {
        return passengerName;
    }

}
