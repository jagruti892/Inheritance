/**
 * Demonstrates Multiple Inheritance using interfaces.
 */
public class SmartAgriculture
        implements CropManagement, IrrigationManagement {

    String crop;
    String irrigation;

    /**
     * Constructor for SmartAgriculture.
     */
    SmartAgriculture(String crop, String irrigation) {
        this.crop = crop;
        this.irrigation = irrigation;
    }

    public void manageCrop() {
        System.out.println("Crop: " + crop);
    }

    public void manageIrrigation() {
        System.out.println("Irrigation: " + irrigation);
    }
}
