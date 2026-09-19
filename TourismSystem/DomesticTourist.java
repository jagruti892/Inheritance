
/**
 * Represents a domestic tourist.
 * Demonstrates Single Inheritance.
 */
public class DomesticTourist extends Tourist {

    String state;

    /**
     * Constructor for DomesticTourist.
     */
    DomesticTourist(int id, String name, String destination,
            String state) {

        super(id, name, destination);
        this.state = state;
    }

    /**
     * Displays domestic tourist details.
     */
    void displayDomestic() {
        display();
        System.out.println("State: " + state);
    }
}
