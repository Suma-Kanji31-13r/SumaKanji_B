import java.util.*;
public class ThreeDigitNumber {
    private int num;

    // Constructor to initialize the three-digit number
    public ThreeDigitNumber(int num) {
        this.num = num;
    }

    // Method to reverse the three-digit number
    public void displayReverse() {
        int reversed = 0;
        int originalNum = num;

        while(originalNum != 0) {
            int digit = originalNum % 10;
            reversed = reversed * 10 + digit;
            originalNum /= 10;
        }

        System.out.println("Reverse of the number: " + reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a 3-digit number:");
        int num = scanner.nextInt();

        // Validate if the input is a three-digit number
        if (num < 100 || num > 999) {
            System.out.println("Error: The number entered is not a 3-digit number.");
            return;
        }

        // Create an instance with user-provided number and display its reverse
        ThreeDigitNumber threeDigitNumber = new ThreeDigitNumber(num);
        threeDigitNumber.displayReverse();
    }
}
