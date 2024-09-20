import java.util.*;
public class convert_miles_to_kilometers {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.print("Enter distance in miles: "); double miles = scanner.nextDouble(); double kilometers = miles * 1.60934; System.out.println(miles + " miles is equal to " + kilometers + " kilometers."); }
}
