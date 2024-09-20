import java.util.*;
public class method_headers_sales_commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of computing a sales commission
        System.out.println("Enter sales amount:");
        double salesAmount = scanner.nextDouble();
        System.out.println("Enter commission rate (as a percentage):");
        double commissionRate = scanner.nextDouble();
        System.out.println("Sales Commission: " + computeSalesCommission(salesAmount, commissionRate));

        // Example usage of testing whether a number is even
        System.out.println("Enter a number to check if it is even:");
        int num = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(num));

        // Example usage of printing a message a specified number of times
        System.out.println("Enter a message:");
        scanner.nextLine(); // Consume newline
        String message = scanner.nextLine();
        System.out.println("How many times to print the message?");
        int times = scanner.nextInt();
        printMessage(message, times);

        // Example usage of computing a square root
        System.out.println("Enter a number to compute the square root:");
        double number = scanner.nextDouble();
        System.out.println("Square root: " + computeSquareRoot(number));

        // Example usage of computing monthly payment
        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();
        System.out.println("Enter number of years:");
        int years = scanner.nextInt();
        System.out.println("Enter annual interest rate (as a percentage):");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Monthly Payment: " + computeMonthlyPayment(loanAmount, years, annualInterestRate));

        // Note: Implementing a full calendar display is complex and beyond a simple method call example
    }

    // a. Computing a sales commission
    public static double computeSalesCommission(double salesAmount, double commissionRate) {
        return salesAmount * (commissionRate / 100);
    }

    // b. Printing the calendar for a month (simplified header, actual implementation would be complex)
    public static void printCalendar(int month, int year) {
        // Implementation goes here
    }

    // c. Computing a square root
    public static double computeSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // d. Testing whether a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // e. Printing a message a specified number of times
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    // f. Computing the monthly payment
    public static double computeMonthlyPayment(double loanAmount, int years, double annualInterestRate) {
        double monthlyInterestRate = annualInterestRate / 1200;
        int n = years * 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -n));
    }
}
