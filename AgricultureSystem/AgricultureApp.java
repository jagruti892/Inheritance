import java.util.Scanner;

/**
 * Main class for Agriculture Management System.
 * Demonstrates different types of inheritance.
 */
public class AgricultureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== AGRICULTURE MANAGEMENT SYSTEM =====");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n--- Single Inheritance ---");

                    System.out.print("Enter Farmer ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Land Area: ");
                    double land = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Fertilizer: ");
                    String fertilizer = sc.nextLine();

                    OrganicFarmer of = new OrganicFarmer(
                            id, name, location, land, fertilizer);

                    of.displayOrganic();

                    break;


                case 2:

                    System.out.println("\n--- Multiple Inheritance ---");

                    System.out.print("Enter Crop Name: ");
                    String crop = sc.nextLine();

                    System.out.print("Enter Irrigation Method: ");
                    String irrigation = sc.nextLine();

                    SmartAgriculture sa =
                            new SmartAgriculture(crop, irrigation);

                    sa.manageCrop();
                    sa.manageIrrigation();

                    break;


                case 3:

                    System.out.println("\n--- Multilevel Inheritance ---");

                    System.out.print("Enter Farmer ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Location: ");
                    location = sc.nextLine();

                    System.out.print("Enter Land Area: ");
                    land = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Fertilizer: ");
                    fertilizer = sc.nextLine();

                    System.out.print("Enter Sensor Type: ");
                    String sensor = sc.nextLine();

                    SmartFarmer sf = new SmartFarmer(
                            id, name, location, land,
                            fertilizer, sensor);

                    sf.displaySmart();

                    break;


                case 4:

                    System.out.println("\n--- Hierarchical Inheritance ---");

                    System.out.println("\nOrganic Farmer");

                    System.out.print("Enter Farmer ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Location: ");
                    location = sc.nextLine();

                    System.out.print("Enter Land Area: ");
                    land = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Fertilizer: ");
                    fertilizer = sc.nextLine();

                    OrganicFarmer organic =
                            new OrganicFarmer(
                                    id, name, location,
                                    land, fertilizer);

                    organic.displayOrganic();


                    System.out.println("\nDairy Farmer");

                    System.out.print("Enter Farmer ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Location: ");
                    location = sc.nextLine();

                    System.out.print("Enter Land Area: ");
                    land = sc.nextDouble();

                    System.out.print("Enter Number of Cows: ");
                    int cows = sc.nextInt();

                    DairyFarmer dairy =
                            new DairyFarmer(
                                    id, name, location,
                                    land, cows);

                    dairy.displayDairy();

                    break;


                case 5:

                    System.out.println("\n--- Hybrid Inheritance ---");

                    System.out.print("Enter Farmer ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Location: ");
                    location = sc.nextLine();

                    System.out.print("Enter Land Area: ");
                    land = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Fertilizer: ");
                    fertilizer = sc.nextLine();

                    System.out.print("Enter Technology: ");
                    String technology = sc.nextLine();

                    SmartOrganicFarmer sof =
                            new SmartOrganicFarmer(
                                    id, name, location,
                                    land, fertilizer,
                                    technology);

                    sof.displaySmartOrganic();
                    sof.manageCrop();
                    sof.manageIrrigation();

                    break;


                case 6:

                    System.out.println("Exiting program...");
                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
