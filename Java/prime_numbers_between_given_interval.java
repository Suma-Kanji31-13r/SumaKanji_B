import java.util.*;
public class prime_numbers_between_given_interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number of the interval: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the interval: ");
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); } }
        scanner.close(); }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; } }
        return true; }

}
