import java.util.*;
public class multiples_of_10_between_a_given_interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();
        System.out.println("Multiples of 10 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);} } }
}
