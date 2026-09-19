import java.util.Scanner;

/**
 * Main class for Tourism Management System.
 * Demonstrates different types of inheritance.
 */
public class TourismApp {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int choice;

                do {

                        System.out.println("\n===== TOURISM MANAGEMENT SYSTEM =====");
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

                                        System.out.print("Enter Tourist ID: ");
                                        int id = sc.nextInt();
                                        sc.nextLine();

                                        System.out.print("Enter Name: ");
                                        String name = sc.nextLine();

                                        System.out.print("Enter Destination: ");
                                        String destination = sc.nextLine();

                                        System.out.print("Enter State: ");
                                        String state = sc.nextLine();

                                        DomesticTourist dt = new DomesticTourist(
                                                        id, name, destination, state);

                                        dt.displayDomestic();

                                        break;

                                case 2:

                                        System.out.println("\n--- Multiple Inheritance ---");

                                        System.out.print("Enter Travel Agent Name: ");
                                        name = sc.nextLine();

                                        TravelAgent agent = new TravelAgent(name);

                                        agent.bookTicket();
                                        agent.bookHotel();

                                        break;

                                case 3:

                                        System.out.println("\n--- Multilevel Inheritance ---");

                                        System.out.print("Enter Tourist ID: ");
                                        id = sc.nextInt();
                                        sc.nextLine();

                                        System.out.print("Enter Name: ");
                                        name = sc.nextLine();

                                        System.out.print("Enter Destination: ");
                                        destination = sc.nextLine();

                                        System.out.print("Enter State: ");
                                        state = sc.nextLine();

                                        System.out.print("Enter Adventure Activity: ");
                                        String activity = sc.nextLine();

                                        AdventureTourist at = new AdventureTourist(
                                                        id, name, destination,
                                                        state, activity);

                                        at.displayAdventure();

                                        break;

                                case 4:

                                        System.out.println("\n--- Hierarchical Inheritance ---");

                                        System.out.println("\nDomestic Tourist");

                                        System.out.print("Enter Tourist ID: ");
                                        id = sc.nextInt();
                                        sc.nextLine();

                                        System.out.print("Enter Name: ");
                                        name = sc.nextLine();

                                        System.out.print("Enter Destination: ");
                                        destination = sc.nextLine();

                                        System.out.print("Enter State: ");
                                        state = sc.nextLine();

                                        DomesticTourist domestic = new DomesticTourist(
                                                        id, name, destination, state);

                                        domestic.displayDomestic();

                                        System.out.println("\nInternational Tourist");

                                        System.out.print("Enter Tourist ID: ");
                                        id = sc.nextInt();
                                        sc.nextLine();

                                        System.out.print("Enter Name: ");
                                        name = sc.nextLine();

                                        System.out.print("Enter Destination: ");
                                        destination = sc.nextLine();

                                        System.out.print("Enter Country: ");
                                        String country = sc.nextLine();

                                        InternationalTourist international = new InternationalTourist(
                                                        id, name, destination, country);

                                        international.displayInternational();

                                        break;

                                case 5:

                                        System.out.println("\n--- Hybrid Inheritance ---");

                                        System.out.print("Enter Tourist ID: ");
                                        id = sc.nextInt();
                                        sc.nextLine();

                                        System.out.print("Enter Name: ");
                                        name = sc.nextLine();

                                        System.out.print("Enter Destination: ");
                                        destination = sc.nextLine();

                                        System.out.print("Enter State: ");
                                        state = sc.nextLine();

                                        System.out.print("Enter Adventure Activity: ");
                                        activity = sc.nextLine();

                                        System.out.print("Enter Guide Name: ");
                                        String guideName = sc.nextLine();

                                        AdventureGuide guide = new AdventureGuide(
                                                        id, name, destination,
                                                        state, activity, guideName);

                                        guide.displayGuide();
                                        guide.bookTicket();
                                        guide.guide();

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
