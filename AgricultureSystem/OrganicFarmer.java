/**
 * Represents an organic farmer.
 * Demonstrates Single Inheritance.
 */
public class OrganicFarmer extends Farmer {

    String fertilizer;

    /**
     * Constructor for OrganicFarmer.
     */
    OrganicFarmer(int id, String name, String location,
                  double land, String fertilizer) {

        super(id, name, location, land);
        this.fertilizer = fertilizer;
    }

    /**
     * Displays organic farming details.
     */
    void displayOrganic() {
        display();
        System.out.println("Fertilizer: " + fertilizer);
    }
}
