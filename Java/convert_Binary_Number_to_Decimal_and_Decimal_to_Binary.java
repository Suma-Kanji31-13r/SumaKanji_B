import java.util.*;
public class convert_Binary_Number_to_Decimal_and_Decimal_to_Binary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binary = scanner.next();
            int decimal = binaryToDecimal(binary);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binary = decimalToBinary(decimal);
            System.out.println("Binary equivalent: " + binary);
        } else {
            System.out.println("Invalid choice."); }
        scanner.close(); }
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2); }
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal); }
}
