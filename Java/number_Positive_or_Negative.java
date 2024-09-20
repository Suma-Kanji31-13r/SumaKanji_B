import java.util.*;
public class number_Positive_or_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println(number + " is positive."); }
        else if (number < 0) {
            System.out.println(number + " is negative."); }
        else { System.out.println("The number is zero."); }
    }
}
