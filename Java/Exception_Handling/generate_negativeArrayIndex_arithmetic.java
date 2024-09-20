package Exception_Handling;

public class generate_negativeArrayIndex_arithmetic {
    public static void main(String[] args) {
        try {
            int[] myArray = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught an exception: Cannot create an array with negative size.");
            System.out.println("Exception details: " + e.toString()); }
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: Cannot divide by zero.");
            System.out.println("Exception details: " + e.toString()); } }
}
