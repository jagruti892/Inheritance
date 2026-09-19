/**
 * Represents an international tourist.
 * Demonstrates Hierarchical Inheritance.
 */
public class InternationalTourist extends Tourist {

    String country;

    /**
     * Constructor for InternationalTourist.
     */
    InternationalTourist(int id, String name, String destination,
            String country) {

        super(id, name, destination);
        this.country = country;
    }

    /**
     * Displays international tourist details.
     */
    void displayInternational() {
        display();
        System.out.println("Country: " + country);
    }
}
