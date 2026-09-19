/**
 * Demonstrates Multiple Inheritance using interfaces.
 */
public class TravelAgent
        implements TicketBooking, HotelBooking {

    String name;

    /**
     * Constructor for TravelAgent.
     */
    TravelAgent(String name) {
        this.name = name;
    }

    public void bookTicket() {
        System.out.println("Ticket booked by " + name);
    }

    public void bookHotel() {
        System.out.println("Hotel booked by " + name);
    }
}
