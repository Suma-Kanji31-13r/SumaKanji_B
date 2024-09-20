
public class factorial_of_12 {
    public static void main(String[] args) {
        int number = 12;
        long f = 1;
        for (int i = 1; i <= number; i++) {
            f *= i;
        }
        System.out.println("Factorial of " + number + " is: " + f); }
    }

