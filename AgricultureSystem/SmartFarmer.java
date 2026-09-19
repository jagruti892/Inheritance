/**
 * Represents a smart farmer.
 * Demonstrates Multilevel Inheritance.
 */
public class SmartFarmer extends OrganicFarmer {

    String sensor;

    /**
     * Constructor for SmartFarmer.
     */
    SmartFarmer(int id, String name, String location,
                double land, String fertilizer, String sensor) {

        super(id, name, location, land, fertilizer);
        this.sensor = sensor;
    }

    /**
     * Displays smart farming details.
     */
    void displaySmart() {
        displayOrganic();
        System.out.println("Sensor: " + sensor);
    }
}
