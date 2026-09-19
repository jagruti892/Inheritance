/**
 * Represents a tourist interested in adventure.
 * Demonstrates Multilevel Inheritance.
 */
public class AdventureTourist extends DomesticTourist {

    String activity;

    /**
     * Constructor for AdventureTourist.
     */
    AdventureTourist(int id, String name, String destination,
            String state, String activity) {

        super(id, name, destination, state);
        this.activity = activity;
    }

    /**
     * Displays adventure tourist details.
     */
    void displayAdventure() {
        displayDomestic();
        System.out.println("Adventure Activity: " + activity);
    }
}
