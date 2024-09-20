import java.util.*;
public class fibonacci {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in); int numberOfTerms = 10; System.out.println("Fibonacci series up to " + numberOfTerms + " terms:"); int first = 0, second = 1; for (int i = 0; i < numberOfTerms; i++) { System.out.print(first + " "); int next = first + second; first = second; second = next;} }
}
