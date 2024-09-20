package Exception_Handling;

public class takes_value_command_line_factorial_to_be_computed {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No input provided. Please enter an integer."); }
            int number = Integer.parseInt(args[0]);
            if (number == 0) {
                throw new IllegalArgumentException("Factorial of 0 is 1 by definition. Please enter a positive integer.");
            } else if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers. Please enter a positive integer."); }
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i; }
            System.out.println("The factorial of " + number + " is: " + factorial);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: The provided input is not an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); } }
}
