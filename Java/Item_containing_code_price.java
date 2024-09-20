import java.util.*;
public class Item_containing_code_price {
    private int code;
    private double price;

    // Constructor to initialize code and price
    public Item_containing_code_price(int code, double price) {
        this.code = code;
        this.price = price;
    }

    // Method to display item data
    public void display() {
        System.out.printf("%10d%10.2f\n", code, price);
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item_containing_code_price[] items = new Item_containing_code_price[5]; // Array to store 5 Item objects

        // Accepting input for each item
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter code and price for item " + (i + 1) + ":");
            int code = scanner.nextInt();
            double price = scanner.nextDouble();
            items[i] = new Item_containing_code_price(code, price); // Creating new Item object
        }

        // Displaying item data in tabular form
        System.out.println("\nItem Code   Price");
        System.out.println("--------------------");
        double totalPrice = 0;
        for (Item_containing_code_price item : items) {
            item.display();
            totalPrice += item.getPrice();
        }

        // Displaying total price of all items
        System.out.printf("\nTotal Price: %.2f\n", totalPrice);
    }
}
