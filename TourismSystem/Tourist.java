/**
 * Parent class for tourists.
 */
public class Tourist {

    int id;
    String name;
    String destination;

    /**
     * Constructor for Tourist.
     */
    Tourist(int id, String name, String destination) {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

    /**
     * Displays tourist details.
     */
    void display() {
        System.out.println("Tourist ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Destination: " + destination);
    }
}
