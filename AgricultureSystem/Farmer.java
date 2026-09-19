/**
 * This is the parent class for farmers.
 */
public class Farmer {

    int id;
    String name;
    String location;
    double land;

    /**
     * Constructor for Farmer.
     */
    Farmer(int id, String name, String location, double land) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.land = land;
    }

    /**
     * Displays farmer details.
     */
    void display() {
        System.out.println("Farmer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Land: " + land + " acres");
    }
}

