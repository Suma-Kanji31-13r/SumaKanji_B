package Exception_Handling;
import java.util.*;
public class Implement_Nested_Try_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();
            try {
                int result = number1 / number2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close(); } }
}
