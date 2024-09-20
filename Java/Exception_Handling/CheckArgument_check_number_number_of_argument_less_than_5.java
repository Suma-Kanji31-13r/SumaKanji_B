package Exception_Handling;
import java.util.*;
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message); } }
public class CheckArgument_check_number_number_of_argument_less_than_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter 5 numbers separated by spaces: ");
            String input = scanner.nextLine();
            String[] numberStrings = input.split(" ");
            if (numberStrings.length < 5) {
                throw new CheckArgument("Insufficient arguments. Please provide at least 5 numbers.");}
            int sum = 0;
            for (String numStr : numberStrings) {
                int num = Integer.parseInt(numStr);
                sum += num; }
            System.out.println("Sum of the five numbers: " + sum);
        } catch (CheckArgument e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter valid integers."); } }
}
