import java.util.*;
public class number_is_palindrome_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPalindrome = checkPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome."); }
        scanner.close(); }
    public static boolean checkPalindrome(int number) {
        int reversedNumber = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10; }
        return number == reversedNumber; }
}
