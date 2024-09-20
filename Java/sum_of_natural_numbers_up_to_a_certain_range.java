import java.util.*;
public class sum_of_natural_numbers_up_to_a_certain_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (up to which natural numbers to sum): ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; }
        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
        scanner.close(); }
}
