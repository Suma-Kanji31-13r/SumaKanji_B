package Exception_Handling;
import java.util.*;
class StringMismatchException extends Exception {
    public StringMismatchException(String message) {
        super(message); } }
public class String_Mismatch_Exception_if_two_strings_not_equal {
    public static void compareStrings(String str1, String str2) throws StringMismatchException {
        if (!str1.equalsIgnoreCase(str2)) {
            throw new StringMismatchException("The strings do not match."); } }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first string: ");
            String firstString = scanner.nextLine();
            System.out.print("Enter the second string: ");
            String secondString = scanner.nextLine();
            compareStrings(firstString, secondString);
            System.out.println("The strings match (case ignored).");
        } catch (StringMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); } }
}
