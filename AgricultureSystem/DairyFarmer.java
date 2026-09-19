/**
 * Represents a dairy farmer.
 * Demonstrates Hierarchical Inheritance.
 */
public class DairyFarmer extends Farmer {

    int cows;

    /**
     * Constructor for DairyFarmer.
     */
    DairyFarmer(int id, String name, String location,
                double land, int cows) {

        super(id, name, location, land);
        this.cows = cows;
    }

    /**
     * Displays dairy farming details.
     */
    void displayDairy() {
        display();
        System.out.println("Number of Cows: " + cows);
    }
}
