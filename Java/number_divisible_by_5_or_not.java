import java.util.*;
public class number_divisible_by_5_or_not {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.print("Enter a number: "); int number = scanner.nextInt(); if (number % 5 == 0) { System.out.println(number + " is divisible by 5."); } else { System.out.println(number + " is not divisible by 5."); } }
}
