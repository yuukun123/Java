package School_Test;

public class Manage_Ticket implements Pay_Ticket{
    private String ticketID;
    private Flight flight;
    private String passengerName;
    private String status;
    private String bookingTime;

    public Manage_Ticket(String ticketID, Flight flight, String passengerName, String status, String bookingTime) {
        this.ticketID = ticketID;
        this.flight = flight;
        this.passengerName = passengerName;
        this.status = status;
        this.bookingTime = bookingTime;
    }
    public String getTicketID() {
        return ticketID;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getPassenger() {
        return passengerName;
    }

    public String getStatus() {
        return status;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public void processTicket() {
        System.out.println("Processing ticket " + getTicketID() + " for " + passengerName);
    }

    @Override
    public double calculateFare() {
        return flight.fareDetails();
    }

    public void updateStatus(String newstatus) {
        this.status = newstatus;
        System.out.println("Ticket " + ticketID + " status updated to " + newstatus);
    }
}
