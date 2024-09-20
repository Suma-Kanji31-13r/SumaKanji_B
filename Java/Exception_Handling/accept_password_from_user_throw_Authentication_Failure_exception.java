package Exception_Handling;
import java.util.*;
class AuthenticationFailureException extends Exception {
    public AuthenticationFailureException(String message) {
        super(message); } }
public class accept_password_from_user_throw_Authentication_Failure_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "secret123";
        try {
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            if (!inputPassword.equals(correctPassword)) {
                throw new AuthenticationFailureException("Incorrect password. Authentication Failure."); }
            System.out.println("Authentication successful!");
        } catch (AuthenticationFailureException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); } }
}
