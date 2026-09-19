/**
 * Demonstrates Hybrid Inheritance.
 */
public class SmartOrganicFarmer extends OrganicFarmer
        implements CropManagement, IrrigationManagement {

    String technology;

    /**
     * Constructor for SmartOrganicFarmer.
     */
    SmartOrganicFarmer(int id, String name, String location,
                       double land, String fertilizer,
                       String technology) {

        super(id, name, location, land, fertilizer);
        this.technology = technology;
    }

    public void manageCrop() {
        System.out.println("Managing organic crop.");
    }

    public void manageIrrigation() {
        System.out.println("Using smart irrigation.");
    }

    void displaySmartOrganic() {
        displayOrganic();
        System.out.println("Technology: " + technology);
    }
}
