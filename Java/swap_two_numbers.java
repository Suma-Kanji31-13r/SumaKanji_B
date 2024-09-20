import java.util.*;
public class swap_two_numbers {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.print("Enter first number: "); double firstNumber = scanner.nextDouble(); System.out.print("Enter second number: "); double secondNumber = scanner.nextDouble(); System.out.println("Numbers before swapping: "); System.out.println("First number: " + firstNumber); System.out.println("Second number: " + secondNumber); double temp = firstNumber; firstNumber = secondNumber; secondNumber = temp; System.out.println("\nNumbers after swapping: "); System.out.println("First number: " + firstNumber); System.out.println("Second number: " + secondNumber);}
}
