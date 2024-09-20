import java.util.*;
public class Fraction {
    private int numerator;
    private int denominator;

    // Default constructor
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    // Constructor with one parameter
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1; // default denominator
    }

    // Constructor with two parameters
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Method to display the fraction
    public void displayFraction() {
        System.out.println("Fractional Value: " + numerator + "/" + denominator);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Fraction fraction1 = new Fraction();
        System.out.println("Fraction 1 (Default Constructor):");
        fraction1.displayFraction();

        // Taking user input for the second Fraction
        System.out.println("Enter numerator for Fraction 2:");
        int num2 = scanner.nextInt();
        Fraction fraction2 = new Fraction(num2);
        System.out.println("Fraction 2 (Single Parameter Constructor):");
        fraction2.displayFraction();

        // Taking user input for the third Fraction
        System.out.println("Enter numerator and denominator for Fraction 3:");
        int num3 = scanner.nextInt();
        int denom3 = scanner.nextInt();
        Fraction fraction3 = new Fraction(num3, denom3);
        System.out.println("Fraction 3 (Two Parameter Constructor):");
        fraction3.displayFraction();
    }
}
