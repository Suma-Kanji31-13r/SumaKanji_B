package Exception_Handling;
import java.util.*;
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message); } }
public class name_age_of_person_entered_age_negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative."); }
            System.out.println("Hello, " + name + ". Your age is " + age + ".");
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); } }
}
