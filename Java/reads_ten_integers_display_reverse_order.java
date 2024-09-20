import java.util.*;
public class reads_ten_integers_display_reverse_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); }
        System.out.println("The integers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " "); } }
}
