import java.util.*;
public class two_integer_values_m_and_n_and_decide_whether_m_multiple_of_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the second integer (n): ");
        int n = scanner.nextInt();
        if (m % n == 0) {
            System.out.println(m + " is a multiple of " + n);
        } else {
            System.out.println(m + " is not a multiple of " + n); }
        scanner.close(); }
}
