package Exception_Handling;
import java.util.*;
class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message); } }
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message); } }
public class raise_user_defined_exception_username_less_than_6_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            if (username.length() < 6) {
                throw new UsernameTooShortException("Username must be at least 6 characters long."); }
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            String expectedPassword = "password123";
            if (!password.equals(expectedPassword)) {
                throw new PasswordMismatchException("Password does not match."); }
            System.out.println("Registration successful!");
        } catch (UsernameTooShortException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); } }
}
