/**
 * Demonstrates Hybrid Inheritance.
 */
public class AdventureGuide extends AdventureTourist
        implements TicketBooking, GuideService {

    String guideName;

    /**
     * Constructor for AdventureGuide.
     */
    AdventureGuide(int id, String name, String destination,
            String state, String activity,
            String guideName) {

        super(id, name, destination, state, activity);
        this.guideName = guideName;
    }

    public void bookTicket() {
        System.out.println("Ticket booked by adventure guide.");
    }

    public void guide() {
        System.out.println("Guide " + guideName
                + " is providing guidance.");
    }

    void displayGuide() {
        displayAdventure();
        System.out.println("Guide Name: " + guideName);
    }
}
