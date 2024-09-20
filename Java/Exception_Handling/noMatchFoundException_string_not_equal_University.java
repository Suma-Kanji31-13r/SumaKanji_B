package Exception_Handling;
import java.util.*;
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message); } }
public class noMatchFoundException_string_not_equal_University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
            checkStringMatch(input);
            System.out.println("String matches 'University'.");
        } catch (NoMatchFoundException e) {
            System.out.println("Error: " + e.getMessage()); }
        scanner.close(); }
    public static void checkStringMatch(String input) throws NoMatchFoundException {
        if (!input.equals("University")) {
            throw new NoMatchFoundException("The input string does not match 'University'."); } }
}
