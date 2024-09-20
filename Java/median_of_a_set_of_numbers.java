import java.util.*;
public class median_of_a_set_of_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); }
        double median = calculateMedian(numbers);
        System.out.println("Median of the numbers is: " + median);
        scanner.close(); }
    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (double) (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
        } else {
            return (double) numbers[length / 2]; } }
}
