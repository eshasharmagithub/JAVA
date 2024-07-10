import java.util.Scanner;

public class BillingSystem {
    private static final double SALTY_GST_RATE = 0.10;
    private static final double SWEET_GST_RATE = 0.18;

    private static Item[] saltyItems = {
        new Item("Chips", 10.0),
        new Item("Nuts", 20.0),
        new Item("Pretzels", 15.0),
        new Item("Popcorn", 12.0),
        new Item("Crackers", 18.0),
        new Item("Salted Biscuits", 25.0),
        new Item("Salted Peanuts", 30.0),
        new Item("Salted Cashews", 35.0),
        new Item("Salted Almonds", 40.0),
        new Item("Salted Pistachios", 50.0)
    };

    private static Item[] sweetItems = {
        new Item("Chocolate", 50.0),
        new Item("Candy", 5.0),
        new Item("Cookie", 10.0),
        new Item("Cake", 100.0),
        new Item("Ice Cream", 80.0),
        new Item("Pastry", 70.0),
        new Item("Donut", 20.0),
        new Item("Brownie", 60.0),
        new Item("Pie", 90.0),
        new Item("Muffin", 30.0)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        // Salty items selection
        System.out.print("Enter the number of salty items you want: ");
        int numSaltyItems = scanner.nextInt();
        double saltyTotal = 0.0;
        System.out.println("Select salty items by number:");
        for (int i = 0; i < saltyItems.length; i++) {
            System.out.println((i + 1) + ". " + saltyItems[i].getName() + " - " + saltyItems[i].getPrice());
        }

        for (int i = 0; i < numSaltyItems; i++) {
            System.out.print("Enter item number: ");
            int itemNumber = scanner.nextInt();
            saltyTotal += saltyItems[itemNumber - 1].getPrice();
        }

        double saltyGST = saltyTotal * SALTY_GST_RATE;
        double saltyFinalTotal = saltyTotal + saltyGST;

        // Sweet items selection
        System.out.print("Enter the number of sweet items you want: ");
        int numSweetItems = scanner.nextInt();
        double sweetTotal = 0.0;
        System.out.println("Select sweet items by number:");
        for (int i = 0; i < sweetItems.length; i++) {
            System.out.println((i + 1) + ". " + sweetItems[i].getName() + " - " + sweetItems[i].getPrice());
        }

        for (int i = 0; i < numSweetItems; i++) {
            System.out.print("Enter item number: ");
            int itemNumber = scanner.nextInt();
            sweetTotal += sweetItems[itemNumber - 1].getPrice();
        }

        double sweetGST = sweetTotal * SWEET_GST_RATE;
        double sweetFinalTotal = sweetTotal + sweetGST;

        // Print the result
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Salty Items Cost: " + saltyTotal);
        System.out.println("Salty Items GST (10%): " + saltyGST);
        System.out.println("Final Salty Items Cost: " + saltyFinalTotal);
        System.out.println("Total Sweet Items Cost: " + sweetTotal);
        System.out.println("Sweet Items GST (18%): " + sweetGST);
        System.out.println("Final Sweet Items Cost: " + sweetFinalTotal);
        System.out.println("Overall Total Cost: " + (saltyFinalTotal + sweetFinalTotal));

        scanner.close();
    }
}
